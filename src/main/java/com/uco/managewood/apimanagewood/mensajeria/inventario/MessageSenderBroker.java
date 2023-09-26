package com.uco.managewood.apimanagewood.mensajeria.inventario;


import com.uco.managewood.apimanagewood.config.ClientQueueConfig;
import com.uco.managewood.apimanagewood.domain.inventario.Inventario;
import com.uco.managewood.apimanagewood.util.MessageSender;
import com.uco.managewood.apimanagewood.util.gson.MapperJsonObjeto;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.core.MessagePropertiesBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MessageSenderBroker implements MessageSender<Inventario> {
    private final RabbitTemplate rabbitTemplate;
    private final MapperJsonObjeto mapperJsonObjeto;
    private final ClientQueueConfig clientQueueConfig;

    @Override
    public void execute(Inventario message) {

        Optional<Message> cuerpoMensaje = obtenerCuerpoMensaje(message);
        if (!cuerpoMensaje.isPresent()) {
            return;

        }
        rabbitTemplate.convertAndSend(clientQueueConfig.getExchangeName(), clientQueueConfig.getRoutingKeyName(), cuerpoMensaje.get());
    }
    public MessageSenderBroker(RabbitTemplate rabbitTemplate, MapperJsonObjeto mapperJsonObjeto, ClientQueueConfig clientQueueConfig) {
        this.rabbitTemplate = rabbitTemplate;
        this.mapperJsonObjeto = mapperJsonObjeto;
        this.clientQueueConfig = clientQueueConfig;
    }


    private MessageProperties generarPropiedadesMensaje(String idMessageSender ) {
        return MessagePropertiesBuilder.newInstance()
                .setContentType(MessageProperties.CONTENT_TYPE_JSON)
                .setHeader("idMensaje", idMessageSender)
                .build();
    }

    private Optional<Message> obtenerCuerpoMensaje(Object mensaje) {
        Optional<String> textoMensaje = mapperJsonObjeto.ejecutarGson(mensaje);

        return textoMensaje.map(msg -> MessageBuilder
                .withBody(msg.getBytes())
                .build());

    }


}

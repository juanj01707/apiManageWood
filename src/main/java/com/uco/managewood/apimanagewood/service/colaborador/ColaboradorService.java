package com.uco.managewood.apimanagewood.service.colaborador;


import com.uco.managewood.apimanagewood.domain.colaborador.Colaborador;
import com.uco.managewood.apimanagewood.domain.sede.Sede;
import com.uco.managewood.apimanagewood.repository.colaborador.IColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ColaboradorService {

    @Autowired
    private IColaboradorRepository colaboradorRepository;

    public List<Colaborador> findAll() {
        return colaboradorRepository.findAll();
    }

    public Optional<Colaborador> findById(Integer codigo){
        return colaboradorRepository.findById(codigo);

    }


    public Colaborador saveColaborador(Colaborador colaborador){
        return colaboradorRepository.save(colaborador);
    }

    public void deleteColaborador(Integer codigo){
        colaboradorRepository.deleteById(codigo);
    }

    public Colaborador updateColaborador(int codigocolaborador, Colaborador nuevoColaborador) {
        Optional<Colaborador> colaboradorOptional = colaboradorRepository.findById(codigocolaborador);

        if (colaboradorOptional.isPresent()) {
            Colaborador colaboradorExistente = colaboradorOptional.get();
            // Actualizar los campos necesarios de la colaborador existente con los valores de nuevoColaborador
            colaboradorExistente.setNombre(nuevoColaborador.getNombre());
            colaboradorExistente.setIdentificacion(nuevoColaborador.getIdentificacion());
            colaboradorExistente.setCodigotipoidentificacion(nuevoColaborador.getCodigotipoidentificacion());
            colaboradorExistente.setCodigoestadocolaborador(nuevoColaborador.getCodigoestadocolaborador());
            colaboradorExistente.setCodigotipocolaborador(nuevoColaborador.getCodigotipocolaborador());
            colaboradorExistente.setCodigosede(nuevoColaborador.getCodigosede());
            colaboradorExistente.setCorreo(nuevoColaborador.getCorreo());
            colaboradorExistente.setPassword(nuevoColaborador.getPassword());

            return colaboradorRepository.save(colaboradorExistente);
        } else {
            // Manejar el caso en que la colaborador no se encuentra
            throw new RuntimeException("Colaborador no encontrada con el código: " + codigocolaborador);
        }
    }

    public Colaborador patchColaborador(int codigocolaborador, Map<String, Object> fields){

        Optional<Colaborador> colaboradorOptional = colaboradorRepository.findById(codigocolaborador);

        if(colaboradorOptional.isPresent()) {
            Colaborador colaboradorExistente = colaboradorOptional.get();
            fields.forEach((key, value) -> {
                Field field = ReflectionUtils.findField(Colaborador.class, key);
                field.setAccessible(true);

                if (field.getType() == String.class && value instanceof String) {
                    ReflectionUtils.setField(field, colaboradorExistente, value);
                }

            });
            return colaboradorRepository.save(colaboradorExistente);
        }
        return null;
    }

    

}

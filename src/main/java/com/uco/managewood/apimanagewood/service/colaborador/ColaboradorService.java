package com.uco.managewood.apimanagewood.service.colaborador;


import com.uco.managewood.apimanagewood.domain.colaborador.Colaborador;
import com.uco.managewood.apimanagewood.domain.colaborador.EstadoColaborador;
import com.uco.managewood.apimanagewood.domain.colaborador.TipoColaborador;
import com.uco.managewood.apimanagewood.repository.colaborador.IColaboradorRepository;
import com.uco.managewood.apimanagewood.util.Constants;
import com.uco.managewood.apimanagewood.util.UtilStrings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ColaboradorService {


    public Colaborador get(Integer codigo) {
        Colaborador colaborador = new Colaborador();
        colaborador.setCodigo(777);
        colaborador.setCodigoSede(123);
        TipoColaborador tipoColaborador = new TipoColaborador();
        colaborador.setTipoColaborador(tipoColaborador);
        EstadoColaborador estadoColaborador = new EstadoColaborador();
        colaborador.setEstadoColaborador(estadoColaborador);
        return colaborador;

    }

    public String create(Colaborador colaborador){
        System.out.println(colaborador.getCodigo());
        System.out.println(colaborador.getTipoColaborador());
        System.out.println(colaborador.getEstadoColaborador());
        System.out.println(colaborador.getCodigoSede());
        return "Se ha creado un colaborador correctamente.";
    }

    public String delete(Integer codigo){
        System.out.println(codigo);
        return "Se ha eliminado un colaborador correctamente";
    }





}

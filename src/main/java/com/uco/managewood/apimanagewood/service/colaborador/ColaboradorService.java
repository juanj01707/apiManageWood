package com.uco.managewood.apimanagewood.service.colaborador;


import com.uco.managewood.apimanagewood.domain.colaborador.Colaborador;
import com.uco.managewood.apimanagewood.repository.colaborador.IColaboradorRepository;
import com.uco.managewood.apimanagewood.util.Constants;
import com.uco.managewood.apimanagewood.util.UtilStrings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ColaboradorService {

    //@Autowired
   // private IColaboradorRepository icolaboradorRepository;

    public Colaborador get(Integer codigo) {
        Colaborador colaborador = new Colaborador();
        colaborador.setCodigo(123);
        colaborador.setCodigoSede(123);
        return colaborador;

    }



}

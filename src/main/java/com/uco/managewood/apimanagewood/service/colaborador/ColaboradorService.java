package com.uco.managewood.apimanagewood.service.colaborador;


import com.uco.managewood.apimanagewood.domain.colaborador.Colaborador;
import com.uco.managewood.apimanagewood.repository.colaborador.IColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ColaboradorService {

    @Autowired
    private IColaboradorRepository colaboradorRepository;

    public Optional<Colaborador> findById(Integer codigo){
        return colaboradorRepository.findById(codigo);

    }


    public Colaborador saveColaborador(Colaborador colaborador){
        return colaboradorRepository.save(colaborador);
    }

    public void deleteColaborador(Integer codigo){
        colaboradorRepository.deleteById(codigo);
    }


}

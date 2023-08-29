package com.uco.managewood.apimanagewood.service.sede;


import com.uco.managewood.apimanagewood.domain.sede.Sede;
import com.uco.managewood.apimanagewood.repository.sede.SedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SedeService{

    @Autowired
    private SedeRepository sedeRepository;

    //FINDALL
    public List<Sede> findAll() {
        return sedeRepository.findAll();
    }







    public Optional<Sede> findById(Integer codigo){
        return sedeRepository.findById(codigo);
    }

    public Sede saveSede(Sede sede){
        return sedeRepository.save(sede);
    }

    public void deleteSede(Integer codigo){
        sedeRepository.deleteById(codigo);
    }

}

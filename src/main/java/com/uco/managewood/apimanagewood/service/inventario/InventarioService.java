package com.uco.managewood.apimanagewood.service.inventario;

import com.uco.managewood.apimanagewood.domain.inventario.Inventario;
import com.uco.managewood.apimanagewood.repository.inventario.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventarioService {

    @Autowired
    private InventarioRepository inventarioRepository;

    public List<Inventario> findAll(){return inventarioRepository.findAll();}

    public Optional<Inventario> findById(Integer codigo){
        return inventarioRepository.findById(codigo);
    }


    public Inventario saveInventario(Inventario inventario){
        return inventarioRepository.save(inventario);
    }

    public void deleteInventario(Integer codigo){
        inventarioRepository.deleteById(codigo);
    }

}

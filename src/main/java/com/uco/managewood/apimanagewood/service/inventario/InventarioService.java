package com.uco.managewood.apimanagewood.service.inventario;

import com.uco.managewood.apimanagewood.domain.inventario.Inventario;
import org.springframework.stereotype.Service;

@Service
public class InventarioService {

    Inventario inventario = new Inventario();
    public Inventario get(Integer codigoInventario){

        return inventario;
    }



}

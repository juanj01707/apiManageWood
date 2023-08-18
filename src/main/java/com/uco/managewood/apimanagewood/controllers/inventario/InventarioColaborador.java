package com.uco.managewood.apimanagewood.controllers.inventario;


import com.uco.managewood.apimanagewood.domain.inventario.Inventario;
import com.uco.managewood.apimanagewood.service.inventario.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/rest")
public class InventarioColaborador {
    @Autowired
    private InventarioService inventarioService;

    @GetMapping("inventarios")
    public Inventario get(@RequestParam(required = true) Integer codigoInventario){
        return inventarioService.get(codigoInventario);
    }



}

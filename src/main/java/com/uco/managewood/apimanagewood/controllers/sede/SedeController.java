package com.uco.managewood.apimanagewood.controllers.sede;
import com.uco.managewood.apimanagewood.domain.inventario.Inventario;
import com.uco.managewood.apimanagewood.domain.sede.Ciudad;
import com.uco.managewood.apimanagewood.domain.sede.Empresa;
import com.uco.managewood.apimanagewood.domain.sede.Sede;
import com.uco.managewood.apimanagewood.service.sede.SedeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("api/v1/rest")
public class SedeController {

    private SedeService sedeService;

    @GetMapping(value = "/{codigo}")
    public ResponseEntity<Optional<Sede>> findSedeById(@PathVariable("codigo") Integer codigo){
        return ResponseEntity.status(HttpStatus.OK).body(sedeService.findById(codigo));
    }

    @PostMapping
    public ResponseEntity<Sede> saveSede(@RequestBody Sede sede){
        return ResponseEntity.status(HttpStatus.CREATED).body(sedeService.saveSede(sede));
    }

    @DeleteMapping
    public void deleteSede(@PathVariable("codigo") Integer codigo){
        sedeService.deleteSede(codigo);
    }



}

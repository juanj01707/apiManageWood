package com.uco.managewood.apimanagewood.controllers.colaborador;


import com.uco.managewood.apimanagewood.domain.colaborador.Colaborador;
import com.uco.managewood.apimanagewood.service.colaborador.ColaboradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/rest")
public class ColaboradorController {

    @Autowired
    private ColaboradorService colaboradorService;


    @GetMapping(value = "/colaborador/{codigo}")
    public ResponseEntity<Optional<Colaborador>> findColaboradorById(@PathVariable("codigo") Integer codigo){
        return ResponseEntity.status(HttpStatus.OK).body(colaboradorService.findById(codigo));
    }

    @PostMapping
    public ResponseEntity<Colaborador> saveColaborador(@RequestBody Colaborador colaborador){
        return ResponseEntity.status(HttpStatus.CREATED).body(colaboradorService.saveColaborador(colaborador));
    }

    @DeleteMapping(value = "/{codigo}")
    public void deleteColaborador(@PathVariable("codigo") Integer codigo){
        colaboradorService.deleteColaborador(codigo);
    }

}

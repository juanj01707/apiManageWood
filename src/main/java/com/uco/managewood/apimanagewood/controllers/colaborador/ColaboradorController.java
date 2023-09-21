package com.uco.managewood.apimanagewood.controllers.colaborador;

import com.uco.managewood.apimanagewood.domain.colaborador.Colaborador;
import com.uco.managewood.apimanagewood.service.colaborador.ColaboradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;
//HOLA
@RestController
@RequestMapping("api/v1/rest")
public class ColaboradorController {

    @Autowired
    private ColaboradorService colaboradorService;

    @GetMapping(value = "/colaboradores")
    public ResponseEntity<List<Colaborador>> getAllColaboradores() {
        List<Colaborador> colaboradores = colaboradorService.findAll();
        if (!colaboradores.isEmpty()) {
            return ResponseEntity.status(HttpStatus.OK).body(colaboradores);

        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }


    @GetMapping(value = "/colaboradores/{codigo}")
    public ResponseEntity<Optional<Colaborador>> findColaboradorById(@PathVariable("codigo") Integer codigo){
        return ResponseEntity.status(HttpStatus.OK).body(colaboradorService.findById(codigo));
    }

    @PostMapping(value = "/colaboradores")
    public ResponseEntity<Colaborador> saveColaborador(@RequestBody Colaborador colaborador){
        return ResponseEntity.status(HttpStatus.CREATED).body(colaboradorService.saveColaborador(colaborador));
    }

    @DeleteMapping(value = "/colaboradores/{codigo}")
    public void deleteColaborador(@PathVariable("codigo") Integer codigo){
        colaboradorService.deleteColaborador(codigo);
    }

    @PutMapping(value = "/colaboradores/{codigo}")
    public ResponseEntity<Colaborador> updateColaborador(@PathVariable("codigo") Integer codigo, @RequestBody Colaborador nuevoColaborador) {
        Colaborador colaboradorActualizado = colaboradorService.updateColaborador(codigo, nuevoColaborador);
        return ResponseEntity.status(HttpStatus.OK).body(colaboradorActualizado);
    }

    @PatchMapping(value = "/colaboradores/{codigo}")
    public Colaborador patchColaborador(@PathVariable("codigo") Integer codigo,@RequestBody Map<String, Object> fields){
        return colaboradorService.patchColaborador(codigo,fields);
    }



}

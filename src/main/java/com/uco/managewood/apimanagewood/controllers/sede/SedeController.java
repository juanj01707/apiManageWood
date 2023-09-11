package com.uco.managewood.apimanagewood.controllers.sede;

import com.uco.managewood.apimanagewood.domain.sede.Sede;
import com.uco.managewood.apimanagewood.service.sede.SedeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
@RequestMapping("api/v1/rest")
public class SedeController {

    @Autowired
    private SedeService sedeService;

    @GetMapping(value = "/sedes")
    public ResponseEntity<List<Sede>> getAllSedes() {
        List<Sede> sedes = sedeService.findAll();
        if (!sedes.isEmpty()) {
            return ResponseEntity.status(HttpStatus.OK).body(sedes);

        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping(value = "/sedes/{codigo}")
    public ResponseEntity<Optional<Sede>> findSedeById(@PathVariable("codigo") Integer codigo){
        return ResponseEntity.status(HttpStatus.OK).body(sedeService.findById(codigo));
    }

    @PostMapping(value = "/sedes")
    public ResponseEntity<Sede> saveSede(@RequestBody Sede sede){
        return ResponseEntity.status(HttpStatus.CREATED).body(sedeService.saveSede(sede));
    }

    @DeleteMapping(value = "/sedes/{codigo}")
    public void deleteSede(@PathVariable("codigo") Integer codigo){
        sedeService.deleteSede(codigo);
    }

    @PutMapping(value = "/sedes/{codigo}")
    public ResponseEntity<Sede> updateSede(@PathVariable("codigo") Integer codigo, @RequestBody Sede nuevaSede) {
        Sede sedeActualizada = sedeService.updateSede(codigo, nuevaSede);
        return ResponseEntity.status(HttpStatus.OK).body(sedeActualizada);
    }


    @PatchMapping(value = "/sedes/{codigo}")
    public Sede patchSede(@PathVariable("codigo") Integer codigo,@RequestBody Map<String, Object> fields){
        return sedeService.patchSede(codigo,fields);
    }


}

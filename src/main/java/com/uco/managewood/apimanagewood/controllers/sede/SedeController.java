package com.uco.managewood.apimanagewood.controllers.sede;
import com.uco.managewood.apimanagewood.domain.sede.Ciudad;
import com.uco.managewood.apimanagewood.domain.sede.Empresa;
import com.uco.managewood.apimanagewood.domain.sede.Sede;
import com.uco.managewood.apimanagewood.service.sede.SedeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/rest")
public class SedeController {

    @Autowired
    private SedeService sedeService;

    @GetMapping("/sedes")
    public Sede get(@RequestParam(required = true) Integer codigoSede) {
        return sedeService.get(codigoSede);
    }



    @PostMapping("/sedes")
    public String create(@RequestBody Sede sede){

        return sedeService.create(sede);
    }



    @DeleteMapping("/sedes/{codigoSede}")
    public String delete(@PathVariable int codigoSede){
        return "Se eliminó la sede exitosamente";
    }




}

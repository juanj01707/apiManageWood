package com.uco.managewood.apimanagewood.controllers.colaborador;


import com.uco.managewood.apimanagewood.domain.colaborador.Colaborador;
import com.uco.managewood.apimanagewood.service.colaborador.ColaboradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/rest")
public class ColaboradorController {

    @Autowired
    private ColaboradorService colaboradorService;

    @GetMapping("/colaboradores")
    public Colaborador get(@RequestParam(required = true) Integer codigo){
        return colaboradorService.get(codigo);
    }

    @PostMapping("/colaboradores")
    public String create(@RequestBody Colaborador colaborador){
            return colaboradorService.create(colaborador);
    }

    @DeleteMapping("/colaboradores")
    public String delete(@RequestParam(required = true) Integer codigo){
        return colaboradorService.delete(codigo);
    }

}

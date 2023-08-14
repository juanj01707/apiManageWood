package com.uco.managewood.apimanagewood.controllers.colaborador;


import com.uco.managewood.apimanagewood.domain.colaborador.Colaborador;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/rest")
public class ColaboradorController {

    @GetMapping("/colaboradores")
    public Colaborador get(){
        Colaborador colaborador = new Colaborador();


        return colaborador;
    }
}

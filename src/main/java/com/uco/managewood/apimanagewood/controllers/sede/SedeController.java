package com.uco.managewood.apimanagewood.controllers.sede;
import com.uco.managewood.apimanagewood.domain.sede.Ciudad;
import com.uco.managewood.apimanagewood.domain.sede.Empresa;
import com.uco.managewood.apimanagewood.domain.sede.Sede;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("")
public class SedeController {

    @GetMapping("/sedes")
    public Sede get() {
        Sede sede = new Sede();
        Empresa empresa = new Empresa();
        Ciudad ciudad = new Ciudad();
        ciudad.setNombre("Rionegro");

        sede.setCodigo(123);
        sede.setNombre("Ramon");
        sede.setEmpresa(empresa);
        sede.setCiudad(ciudad);

        return sede;
    }
}

package com.uco.managewood.apimanagewood.controllers.sede;
import com.uco.managewood.apimanagewood.domain.sede.Ciudad;
import com.uco.managewood.apimanagewood.domain.sede.Empresa;
import com.uco.managewood.apimanagewood.domain.sede.Sede;
import com.uco.managewood.apimanagewood.domain.sede.SedeRequest;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/rest")
public class SedeController {

    @GetMapping("/sedes")
    public Sede get() {
        Sede sede = new Sede();

        Empresa empresa = new Empresa();
        empresa.setCodigo(7887);
        empresa.setNombre("EMPRESA CARPINETECALIDOSA");
        empresa.setNit(7774);

        Ciudad ciudad = new Ciudad();
        ciudad.setNombre("Rionegro");
        ciudad.setCodigo(4847);

        sede.setCodigo(122463);
        sede.setNombre("CARPENTERS RIONEGRO INC");
        sede.setEmpresa(empresa);
        sede.setCiudad(ciudad);

        return sede;
    }

    @PostMapping("/sedes")
    public String create(@RequestBody SedeRequest sedeRequest){
        Sede sede = new Sede();
        sede.setCodigo(sedeRequest.getCodigoSede());
        sede.setNombre(sedeRequest.getNombre());

        Empresa empresa = new Empresa();
        empresa.setCodigo(sedeRequest.getCodigoEmpresa());
        sede.setEmpresa(empresa);

        Ciudad ciudad = new Ciudad();
        ciudad.setCodigo(sedeRequest.getCodigoCiudad());
        sede.setCiudad(ciudad);

        return "se creó sede exitosamente";
    }


    @PutMapping("/sedes/{codigoSede}")
    public String update(@PathVariable int codigoSede, @RequestBody SedeRequest sedeRequest){
        String nombreNuevo = sedeRequest.setNombre("CARPENTERS CARMEN INC");
        int codigoEmpresaNuevo = sedeRequest.getCodigoEmpresa();
        int codigoCiudadNuevo = sedeRequest.getCodigoCiudad();

        // Responder con el mensaje de éxito
        return "se actualizó sede exitosamente";
    }

    @DeleteMapping("/sedes/{codigoSede}")
    public String delete(@PathVariable int codigoSede){
        return "Se eliminó la sede exitosamente";
    }




}

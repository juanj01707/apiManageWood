    package com.uco.managewood.apimanagewood.controllers.inventario;


    import com.uco.managewood.apimanagewood.domain.inventario.Inventario;
    import com.uco.managewood.apimanagewood.service.inventario.InventarioService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    import java.util.Optional;

    @RestController
    @RequestMapping("api/v1/rest")
    public class InventarioColaborador {
        @Autowired
        private InventarioService inventarioService;


        @GetMapping(value = "/find/{codigo}")
        public ResponseEntity<Optional<Inventario>> findInventarioById(@PathVariable("codigo") Integer codigo){
            return ResponseEntity.status(HttpStatus.OK).body(inventarioService.findById(codigo));
        }

        @PostMapping
        public ResponseEntity<Inventario> saveInventario(@RequestBody Inventario inventario){
            return ResponseEntity.status(HttpStatus.CREATED).body(inventarioService.saveInventario(inventario));
        }

        @DeleteMapping(value = "/{codigo}")
        public void deleteInventario(@PathVariable("codigo") Integer codigo){
            inventarioService.deleteInventario(codigo);
        }





    }

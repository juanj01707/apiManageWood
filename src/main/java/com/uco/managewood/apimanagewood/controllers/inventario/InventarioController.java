    package com.uco.managewood.apimanagewood.controllers.inventario;


    import com.uco.managewood.apimanagewood.domain.inventario.Inventario;
    import com.uco.managewood.apimanagewood.domain.sede.Sede;
    import com.uco.managewood.apimanagewood.service.inventario.InventarioService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;
    import java.util.Optional;

    @RestController
    @RequestMapping("api/v1/rest")
    public class InventarioController {
        @Autowired
        private InventarioService inventarioService;


        @GetMapping(value = "/inventario")
        public ResponseEntity<List<Inventario>> getAllInventarios(){
            List<Inventario> inventarios = inventarioService.findAll();
            if (!inventarios.isEmpty()) {
                return ResponseEntity.status(HttpStatus.OK).body(inventarios);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
        }

        @GetMapping(value = "/inventario/{codigo}")
        public ResponseEntity<Optional<Inventario>> findInventarioById(@PathVariable("codigo") Integer codigo){
            return ResponseEntity.status(HttpStatus.OK).body(inventarioService.findById(codigo));
        }

        @PostMapping(value = "/inventario")
        public ResponseEntity<Inventario> saveInventario(@RequestBody Inventario inventario){
            return ResponseEntity.status(HttpStatus.CREATED).body(inventarioService.saveInventario(inventario));
        }

        @DeleteMapping(value = "/inventario/{codigo}")
        public void deleteInventario(@PathVariable("codigo") Integer codigo){
            inventarioService.deleteInventario(codigo);
        }





    }

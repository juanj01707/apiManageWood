    package com.uco.managewood.apimanagewood.controllers.inventario;


    import com.uco.managewood.apimanagewood.domain.inventario.Inventario;
    import com.uco.managewood.apimanagewood.domain.sede.Sede;
    import com.uco.managewood.apimanagewood.service.inventario.InventarioService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;
    import java.util.Map;
    import java.util.Optional;

    @RestController
    @RequestMapping("api/v1/rest")
    public class InventarioController {
        @Autowired
        private InventarioService inventarioService;


        @GetMapping(value = "/inventarios")
        public ResponseEntity<List<Inventario>> getAllInventarios(){
            List<Inventario> inventarios = inventarioService.findAll();
            if (!inventarios.isEmpty()) {
                return ResponseEntity.status(HttpStatus.OK).body(inventarios);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
        }

        @GetMapping(value = "/inventarios/{codigo}")
        public ResponseEntity<Optional<Inventario>> findInventarioById(@PathVariable("codigo") Integer codigo){
            return ResponseEntity.status(HttpStatus.OK).body(inventarioService.findById(codigo));
        }

        @PostMapping(value = "/inventarios")
        public ResponseEntity<Inventario> saveInventario(@RequestBody Inventario inventario){
            return ResponseEntity.status(HttpStatus.CREATED).body(inventarioService.saveInventario(inventario));
        }

        @DeleteMapping(value = "/inventarios/{codigo}")
        public void deleteInventario(@PathVariable("codigo") Integer codigo){
            inventarioService.deleteInventario(codigo);
        }

        @PutMapping(value = "/inventarios/{codigo}")
        public ResponseEntity<Inventario> updateInventario(@PathVariable("codigo") Integer codigo, @RequestBody Inventario nuevoInventario) {
            Inventario inventarioActualizado = inventarioService.updateInventario(codigo, nuevoInventario);
            return ResponseEntity.status(HttpStatus.OK).body(inventarioActualizado);
        }

        @PatchMapping(value = "/inventarios/{codigo}")
        public Inventario patchInventario(@PathVariable("codigo") Integer codigo, @RequestBody Map<String, Object> fields){
            return inventarioService.patchInventario(codigo,fields);
        }




    }

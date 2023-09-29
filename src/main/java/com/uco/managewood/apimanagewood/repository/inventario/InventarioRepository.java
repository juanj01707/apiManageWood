package com.uco.managewood.apimanagewood.repository.inventario;

import com.uco.managewood.apimanagewood.domain.inventario.Inventario;
import com.uco.managewood.apimanagewood.domain.inventario.InventarioRabbit;
import com.uco.managewood.apimanagewood.domain.sede.Sede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Integer> {
    Inventario findByNombre(String nombre);

}

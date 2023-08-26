package com.uco.managewood.apimanagewood.repository.inventario;

import com.uco.managewood.apimanagewood.domain.inventario.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Integer> {

}

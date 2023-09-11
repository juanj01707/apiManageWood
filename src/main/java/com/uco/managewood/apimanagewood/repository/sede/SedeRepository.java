package com.uco.managewood.apimanagewood.repository.sede;

import com.uco.managewood.apimanagewood.domain.sede.Sede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SedeRepository extends JpaRepository<Sede, Integer> {

    Sede findByNombre(String nombre);

}

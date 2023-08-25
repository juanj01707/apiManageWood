package com.uco.managewood.apimanagewood.repository.colaborador;

import com.uco.managewood.apimanagewood.domain.colaborador.Colaborador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface IColaboradorRepository extends CrudRepository<Colaborador, Long> {
    @Query(value = "SELECT colaborador.id as id, e.nombre as nombre, e.telefono as telefono, e.email as email, e.responsable_legal as responsableLegal" +
            " FROM schema_bitacorapp.tbi_empresas e" +
            " WHERE e.nombre like %?1%", nativeQuery = true)
    ArrayList<Colaborador> findByNombre(String nombre);


}

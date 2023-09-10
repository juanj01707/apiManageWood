package com.uco.managewood.apimanagewood.repository.colaborador;

import com.uco.managewood.apimanagewood.domain.colaborador.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IColaboradorRepository extends JpaRepository<Colaborador, Integer> {

    Colaborador findByCorreo(String correo);


}

package com.uco.managewood.apimanagewood.domain.colaborador;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class EstadoColaborador {

    @Id
    private int codigoestadocolaborador;

    private String nombre;


}

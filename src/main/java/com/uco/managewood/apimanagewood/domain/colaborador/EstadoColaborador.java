package com.uco.managewood.apimanagewood.domain.colaborador;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "estadocolaborador")
public class EstadoColaborador {

    @Id
    private int codigoestadocolaborador;

    private String nombre;


}

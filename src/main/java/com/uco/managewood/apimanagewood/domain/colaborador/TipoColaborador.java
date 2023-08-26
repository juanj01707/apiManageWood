package com.uco.managewood.apimanagewood.domain.colaborador;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TipoColaborador {

    @Id
    private int codigotipocolaborador;
    private String nombre;
    private int salario;
    private String funcion;


}

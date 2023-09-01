package com.uco.managewood.apimanagewood.domain.colaborador;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tipoidentificacion")
public class TipoIdentificacion {

    @Id
    private int codigotipoidentificacion;
    private String nombre;



}

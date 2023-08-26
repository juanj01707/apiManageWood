package com.uco.managewood.apimanagewood.domain.colaborador;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TipoIdentificacion {

    @Id
    private int codigotipoidentificacion;
    private String nombre;


}

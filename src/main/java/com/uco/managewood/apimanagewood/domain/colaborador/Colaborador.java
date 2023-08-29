package com.uco.managewood.apimanagewood.domain.colaborador;


import com.uco.managewood.apimanagewood.domain.sede.Sede;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "colaborador")
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigocolaborador;

    private String nombre;

    private String identificacion;


    @ManyToOne
    @JoinColumn(name = "codigotipoidentificacion")
    private TipoIdentificacion codigotipoidentificacion;

    @ManyToOne
    @JoinColumn(name = "codigoestadocolaborador")
    private EstadoColaborador codigoestadocolaborador;

    @ManyToOne
    @JoinColumn(name = "codigotipocolaborador")
    private TipoColaborador codigotipocolaborador;

    @ManyToOne
    @JoinColumn(name = "codigosede")
    private Sede codigosede;


}

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
    private int codigocolabordor;

    private String nombre;

    private String identificacion;


    @OneToOne
    @JoinColumn(name = "FK_tipoidentificacion")
    private TipoIdentificacion codigotipoidentificacion;

    @OneToOne
    @JoinColumn(name = "FK_estadocolaborador")
    private EstadoColaborador codigoestadocolaborador;

    @OneToOne
    @JoinColumn(name = "FK_tipocolaborador")
    private TipoColaborador codigotipocolaborador;

    @OneToOne
    @JoinColumn(name = "FK_sede")
    private Sede codigosede;


}

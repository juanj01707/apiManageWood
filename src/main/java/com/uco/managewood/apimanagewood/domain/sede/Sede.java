package com.uco.managewood.apimanagewood.domain.sede;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "sede")
@Getter
@Setter
public class Sede {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigosede",nullable = false)
    private int codigosede;

    @NotBlank
    @NotNull
    @Column(name = "nombre")
    private String nombre;


    @ManyToOne
    @JoinColumn(name = "codigoempresa")
    private Empresa codigoempresa;


    @ManyToOne
    @JoinColumn(name = "codigociudad")
    private Ciudad codigociudad;

    public int getCodigosede() {
        return codigosede;
    }

    public void setCodigosede(int codigosede) {
        this.codigosede = codigosede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empresa getCodigoempresa() {
        return codigoempresa;
    }

    public void setCodigoempresa(Empresa codigoempresa) {
        this.codigoempresa = codigoempresa;
    }

    public Ciudad getCodigociudad() {
        return codigociudad;
    }

    public void setCodigociudad(Ciudad codigociudad) {
        this.codigociudad = codigociudad;
    }
}

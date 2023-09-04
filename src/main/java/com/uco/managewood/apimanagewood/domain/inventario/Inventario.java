package com.uco.managewood.apimanagewood.domain.inventario;

import com.uco.managewood.apimanagewood.domain.sede.Sede;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "inventario")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoinventario", nullable = false)
    private int codigoinventario;

    @Column(name = "nombre")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "codigosede")
    private Sede codigosede;

    public int getCodigoinventario() {
        return codigoinventario;
    }

    public void setCodigoinventario(int codigoinventario) {
        this.codigoinventario = codigoinventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Sede getCodigosede() {
        return codigosede;
    }

    public void setCodigosede(Sede codigosede) {
        this.codigosede = codigosede;
    }
}


package com.uco.managewood.apimanagewood.domain.colaborador;

import com.uco.managewood.apimanagewood.domain.sede.Sede;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table( name = "colaborador")
@Getter
@Setter

public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)


    private int codigo;
    @Column(name = "codigo")

    private String nombre;
    @Column(name = "nombre")
    private int identificacion;
    @Column(name="identificacion")


    @ManyToOne
    @JoinColumn(name = "codigoTipoColaborador", insertable = false,updatable = false)
    private TipoColaborador tipoColaborador;

    @ManyToOne
    @JoinColumn(name = "codigoEstadoColaborador", insertable = false,updatable = false)
    private EstadoColaborador estadoColaborador;

    @ManyToOne
    @JoinColumn(name = "codigoSede")
    private int codigoSede;



    public Colaborador(){

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public TipoColaborador getTipoColaborador() {
        return tipoColaborador;
    }

    public void setTipoColaborador(TipoColaborador tipoColaborador) {
        this.tipoColaborador = tipoColaborador;
    }

    public EstadoColaborador getEstadoColaborador() {
        return estadoColaborador;
    }

    public int getCodigoSede() {
        return codigoSede;
    }

    public void setCodigoSede(int codigoSede) {
        this.codigoSede = codigoSede;
    }

    public void setEstadoColaborador(EstadoColaborador estadoColaborador) {
        this.estadoColaborador = estadoColaborador;
    }

    public int getSede() {
        return codigoSede;
    }

    public void setSede(Sede sede) {
        this.codigoSede = sede.getCodigo();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
}

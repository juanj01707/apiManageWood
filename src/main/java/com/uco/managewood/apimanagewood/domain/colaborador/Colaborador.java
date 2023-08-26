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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "codigocolabordor", nullable = false)


    private int codigocolabordor;
    @Column(name = "codigocolabordor")

    private String nombre;
    @Column(name = "nombre")

    private String identificacion;
    @Column(name = "identificacion")



    @OneToOne
    private TipoIdentificacion tipoIdentificacion;


    @ManyToOne
    @JoinColumn(name = "codigotipocolaborador", insertable = false,updatable = false)
    private TipoColaborador tipoColaborador;

    @ManyToOne
    @JoinColumn(name = "codigoestadocolaborador", insertable = false,updatable = false)
    private EstadoColaborador estadoColaborador;

    @ManyToOne
    @JoinColumn(name = "codigoSede")
    private int codigoSede;



    public Colaborador(){

    }

    public Colaborador(int codigocolabordor, String nombre, TipoIdentificacion tipoIdentificacion, TipoColaborador tipoColaborador, EstadoColaborador estadoColaborador, int codigoSede) {
        this.codigocolabordor = codigocolabordor;
        this.nombre = nombre;
        this.tipoIdentificacion = tipoIdentificacion;
        this.tipoColaborador = tipoColaborador;
        this.estadoColaborador = estadoColaborador;
        this.codigoSede = codigoSede;
    }

    public int getCodigo() {
        return codigocolabordor;
    }

    public void setCodigo(int codigo) {
        this.codigocolabordor = codigo;
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

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }


}

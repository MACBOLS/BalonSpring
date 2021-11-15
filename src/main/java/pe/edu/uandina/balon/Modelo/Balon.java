package pe.edu.uandina.balon.Modelo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "balon")
public class Balon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBalon")
    private long idBalon;
    @Column(name = "capacidad")
    private String capacidad;
    @Column(name = "estado")
    private String estado;


    //--------

    @ManyToOne
    @JoinColumn(name = "pertenceRegistro", referencedColumnName = "idRegistro")
    private Registro pertenceRegistro;

    @ManyToOne
    @JoinColumn(name = "perteneceAdministrador", referencedColumnName = "idAdministrador")
    private Administrador perteneceAdministrador;

    @ManyToOne
    @JoinColumn(name = "tieneEstado", referencedColumnName = "idEstado")
    private Estado tieneEstado;

    public Balon() {
    }

    public Balon(String capacidad, String estado) {
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public long getIdBalon() {
        return idBalon;
    }

    public void setIdBalon(long idBalon) {
        this.idBalon = idBalon;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Registro getPertenceRegistro() {
        return pertenceRegistro;
    }
    public void setPertenceRegistro(Registro pertenceRegistro) {
        this.pertenceRegistro = pertenceRegistro;
    }

    public Administrador getPerteneceAdministrador() {
        return perteneceAdministrador;
    }

    public void setPerteneceAdministrador(Administrador perteneceAdministrador) {
        this.perteneceAdministrador = perteneceAdministrador;
    }

    public Estado getTieneEstado() {
        return tieneEstado;
    }

    public void setTieneEstado(Estado tieneEstado) {
        this.tieneEstado = tieneEstado;
    }
}

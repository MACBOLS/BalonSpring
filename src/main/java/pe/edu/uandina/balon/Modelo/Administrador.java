package pe.edu.uandina.balon.Modelo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "administrador")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idAdministrador")
    private long idAdministrador;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellidos")
    private String apellidos;

    @OneToOne
    @JoinColumn(name = "tieneUsuario", referencedColumnName = "idUsuario")
    private Usuario tieneUsuario;


    @ManyToOne
    @JoinColumn(name = "administraBalon", referencedColumnName = "idBalon")
    private Balon administraBalon;

    public Administrador() {
    }

    public Administrador(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.administraBalon = administraBalon;
    }

    public long getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(long idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Usuario getTieneUsuario() {
        return tieneUsuario;
    }

    public void setTieneUsuario(Usuario tieneUsuario) {
        this.tieneUsuario = tieneUsuario;
    }

    public Balon getAdministraBalon() {
        return administraBalon;
    }

    public void setAdministraBalon(Balon administraBalon) {
        this.administraBalon = administraBalon;
    }
}

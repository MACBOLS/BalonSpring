package pe.edu.uandina.balon.Modelo;

import javax.persistence.*;

@Entity
@Table(name = "accion")
public class Accion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAccion")
    public long idAccion;
    @Column(name = "nombre")
    public String nombre;

    @ManyToOne
    @JoinColumn(name = "perteneceRegistro", referencedColumnName = "idRegistro")
    private Registro perteneceRegistro;

    public Accion() {
    }

    public Accion(String nombre) {
        this.nombre = nombre;
    }

    public long getIdAccion() {
        return idAccion;
    }

    public void setIdAccion(long idAccion) {
        this.idAccion = idAccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Registro getPerteneceRegistro() {
        return perteneceRegistro;
    }

    public void setPerteneceRegistro(Registro perteneceRegistro) {
        this.perteneceRegistro = perteneceRegistro;
    }
}

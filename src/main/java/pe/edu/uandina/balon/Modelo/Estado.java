package pe.edu.uandina.balon.Modelo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEstado")
    private long idEstado;
    @Column(name = "nombre")
    private String nombre;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Balon> perteneceBalon;

    public Estado() {
    }

    public Estado(long idEstado, String nombre, List<Balon> perteneceBalon) {
        this.idEstado = idEstado;
        this.nombre = nombre;
        this.perteneceBalon = perteneceBalon;
    }

    public long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(long idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

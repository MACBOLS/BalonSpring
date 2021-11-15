package pe.edu.uandina.balon.Modelo;

import javax.persistence.*;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "registro")
public class Registro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRegistro")
    private long idRegistro;
    @Column(name = "fechaEntrada")
    private Date fechaEntrada;
    @Column(name = "fechaSalida")
    private Calendar fechaSalida;

    //------------

    @OneToMany(cascade = CascadeType.ALL)
    private List<Balon> tieneBalon;

    @ManyToOne
    @JoinColumn(name = "perteneceCliente", referencedColumnName = "idCliente")
    private Cliente perteneceCliente;

    @ManyToOne
    @JoinColumn(name = "tieneAccion", referencedColumnName = "idAccion")
    private Accion tieneAccion;


    public Registro() {
    }

    public Registro(Date fechaEntrada, Calendar fechaSalida) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public long getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(long idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Calendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Calendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Cliente getPerteneceCliente() {
        return perteneceCliente;
    }

    public void setPerteneceCliente(Cliente perteneceCliente) {
        this.perteneceCliente = perteneceCliente;
    }
}

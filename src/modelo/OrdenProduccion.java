package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ordenProduccion")
public class OrdenProduccion implements Serializable{
	//SERIALIZABLE.
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
	private Integer id;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="pedidoId", columnDefinition="SMALLINT")
    private Pedido pedido;
	//ONE TO ONE.
	@Column(name="tipoOrdenProduccionId", columnDefinition="SMALLINT")
    private String tipo;//TIPO
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="pedidoId", columnDefinition="SMALLINT")
    private Prenda prenda;
	@Column(name="fechaCreacion", columnDefinition="DATE")
    private Date fechaCreacion;
	@Column(name="fechaInicio", columnDefinition="DATE")
    private Date fechaInicio;
	@Column(name="fechaFin", columnDefinition="DATE")
    private Date fechaFin;
	//ONE TO ONE.
	@Column(name="estadoId", columnDefinition="SMALLINT")
    private Integer estado;//ESTADO

    //CONSTRUCTOR VACIO.
    public OrdenProduccion() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    //CONSTRUCTOR.
	public OrdenProduccion(Pedido pedido, String tipo, Prenda prenda, Set<ModeloProduccion> items, Date fechaCreacion, Date fechaInicio,
			Date fechaFin, Integer estado) {
		super();
		this.pedido = pedido;
		this.tipo = tipo;
		this.prenda = prenda;
		this.fechaCreacion = fechaCreacion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.estado = estado;
	}

	//CONSTRUCTOR CON ID.
	public OrdenProduccion(Integer id, Pedido pedido, Prenda prenda, String tipo, Set<ModeloProduccion> items, Date fechaCreacion,
			Date fechaInicio, Date fechaFin, Integer estado) {
		super();
		this.id = id;
		this.pedido = pedido;
		this.tipo = tipo;
		this.prenda = prenda;
		this.fechaCreacion = fechaCreacion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.estado = estado;
	}

	//METODOS GETTER & SETTER.
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Prenda getPrenda() {
		return prenda;
	}
	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	
	//METODOS DE NEGOCIO.
    public Set<ItemInsumoMP> obtenerInsumos() {
        // TODO implement here
        return null;
    }

}
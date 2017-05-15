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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="pedido")
public class Pedido implements Serializable {
	//SERIALIZABLE.
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
	private Integer id;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="clienteId")
    private Cliente cliente;
	@Column(name="fecha", columnDefinition="DATE")
    private Date fecha;
	@Column(name="fechaEntrega", columnDefinition="DATE")
    private Date fechaEntrega;
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="pedidoId", columnDefinition="SMALLINT")
    private Set<ItemPedido> itemPedido;
	@Column(name="estadoId", columnDefinition="SMALLINT")
    private String estado;
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="pedidoId", columnDefinition="SMALLINT")
    private Set<ReservaPedido> reservas;

	//CONSTRUCTOR VACIO.
    public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}

    //CONSTRUCTOR.
	public Pedido(Cliente cliente, Date fecha, Date fechaEntrega, Set<ItemPedido> itemPedido, String estado,
			Set<ReservaPedido> reservas) {
		super();
		this.cliente = cliente;
		this.fecha = fecha;
		this.fechaEntrega = fechaEntrega;
		this.itemPedido = itemPedido;
		this.estado = estado;
		this.reservas = reservas;
	}

	//CONSTRUCTOR CON ID.
	public Pedido(Integer id, Cliente cliente, Date fecha, Date fechaEntrega, Set<ItemPedido> itemPedido, String estado,
			Set<ReservaPedido> reservas) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.fecha = fecha;
		this.fechaEntrega = fechaEntrega;
		this.itemPedido = itemPedido;
		this.estado = estado;
		this.reservas = reservas;
	}

	//GETTERS & SETTERS.
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Date getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public Set<ItemPedido> getItemPedido() {
		return itemPedido;
	}
	public void setItemPedido(Set<ItemPedido> itemPedido) {
		this.itemPedido = itemPedido;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Set<ReservaPedido> getReservas() {
		return reservas;
	}
	public void setReservas(Set<ReservaPedido> reservas) {
		this.reservas = reservas;
	}
	
	//PERSISTIR.
	public void persist(Pedido pedido){
		
	}
	
	//UPDATE.
	public void update(Pedido pedido){
		
	}
	
	//LOAD.
	public Pedido load(int pedidoId){
		return new Pedido();
	}
	
	//METODOS DE NEGOCIO.
	public void agregarItem() {
        // TODO implement here
    }
    
    public Float getTotal() {
        // TODO implement here
        return 0.0f;
    }

    public void cancelarPedido() {
        // TODO implement here
    }

}
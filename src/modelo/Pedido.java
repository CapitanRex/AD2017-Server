package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
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

import dao.PedidoDao;
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
	@JoinColumn(name="clienteId", columnDefinition="SMALLINT")
    private Cliente cliente;
	@Column(name="fecha", columnDefinition="DATE")
    private Date fecha;
	@Column(name="fechaEntrega", columnDefinition="DATE")
    private Date fechaEntrega;
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="pedidoId", columnDefinition = "SMALLINT")
    private Set<ItemPedido> itemPedido = new HashSet<ItemPedido>();
	@Column(name="estadoId", columnDefinition="SMALLINT")
    private Integer estado;
/*
	10	pedido_pendiente
	11	pedido_en_proceso
	12	pedido_completo
	13	pedido_entregado
	14	pedido_cancelado
*/
	//CONSTRUCTOR VACIO.
    public Pedido() {
		super();
	}

    //CONSTRUCTOR.
	public Pedido(Cliente cliente) {
		super();
		this.cliente = cliente;
		this.fecha = new Date();
		this.fechaEntrega = calcularFechaProbale(fecha);
		this.estado = 1;
	}

	//CONSTRUCTOR CON ID.
	public Pedido(Integer id, Cliente cliente, Date fecha, Date fechaEntrega, Integer estado, Set<ItemPedido> itemPedido) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.fecha = fecha;
		this.fechaEntrega = fechaEntrega;
		this.itemPedido = itemPedido;
		this.estado = estado;
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
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	
	//PERSISTIR.
	public void persist(){
		PedidoDao.getInstancia().InsertPedido(this);
	}
	
	//UPDATE.
	public void update(Pedido pedido){
		
	}
	
	//LOAD.
	public Pedido load(int pedidoId){
		return new Pedido();
	}
	
	//METODOS DE NEGOCIO.
	
	private Date calcularFechaProbale(Date fecha) {
		return fecha;
	}
	
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
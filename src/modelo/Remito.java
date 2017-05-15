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
@Table(name="remito")
public class Remito implements Serializable {
	//SERIALIZABLE.
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
	private Integer id;
	@Column(name="fecha", columnDefinition="DATE")
    private Date fecha;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="clienteId")
    private Cliente cliente;
	@Column(name="estadoId", columnDefinition="SMALLINT")
    private String estado;
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="remitoId", columnDefinition="SMALLINT")
    private Set<ItemRemito> itemsRemito;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="pedidoId", columnDefinition="SMALLINT")
    private Pedido pedido;
    
	//CONSTRUCTOR VACIO.
    public Remito() {
		super();
		// TODO Auto-generated constructor stub
	}

    //CONSTRUCTOR.
	public Remito(Date fecha, Cliente cliente, String estado, Set<ItemRemito> itemsRemito, Pedido pedido) {
		super();
		this.fecha = fecha;
		this.cliente = cliente;
		this.estado = estado;
		this.itemsRemito = itemsRemito;
		this.pedido = pedido;
	}

	//CONSTRUCTOR CON ID.
	public Remito(Integer id, Date fecha, Cliente cliente, String estado, Set<ItemRemito> itemsRemito, Pedido pedido) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.cliente = cliente;
		this.estado = estado;
		this.itemsRemito = itemsRemito;
		this.pedido = pedido;
	}

	//GETTERS & SETTERS.
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Set<ItemRemito> getItemsRemito() {
		return itemsRemito;
	}
	public void setItemsRemito(Set<ItemRemito> itemsRemito) {
		this.itemsRemito = itemsRemito;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	//PERSISTIR.
	public void persist(Remito remito){
		
	}
	
	//UPDATE.
	public void update(Remito remito){
		
	}
	
	//LOAD.
	public Remito load(int remitoId){
		return new Remito();
	}
	
	//METODOS DE NEGOCIO.
	public void agregarItem(ItemRemito itemRemito) {
        // TODO implement here
    }

    public void actualizarEstado(String estado) {
        // TODO implement here
    }

}
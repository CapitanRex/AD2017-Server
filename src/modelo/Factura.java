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

@Entity
@Table (name="factura")
public class Factura implements Serializable{
	//SERIALIZABLE.
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
    private Integer id;
	@Column(name="fecha", columnDefinition="DATE")
    private Date fecha;
	//IMPLEMENTAR ONE TO ONE.
	@Column(name="tipoId", columnDefinition="SMALLINT")
    private String tipo;
	//IMPLEMENTAR ONE TO ONE.
	@Column(name="estadoId", columnDefinition="SMALLINT")
    private String estado;
	@Column(name="importe", columnDefinition="SMALLINT")
	private Float importe;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="pedidoId", columnDefinition="SMALLINT")
	private Pedido pedido;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="clienteId", columnDefinition="SMALLINT")
    private Cliente cliente;
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="facturaId", columnDefinition="SMALLINT")
    private Set<ItemFactura> itemFactura = new HashSet<ItemFactura>();

    //CONSTRUCTOR VACIO.
    public Factura() {
		super();
	}
    
    //CONSTRUCTOR.
	public Factura(Date fecha, String tipo, String estado, Cliente cliente, Set<ItemFactura> itemFactura, Float importe,
			Pedido pedido) {
		super();
		this.fecha = fecha;
		this.tipo = tipo;
		this.estado = estado;
		this.cliente = cliente;
		this.itemFactura = itemFactura;
		this.importe = importe;
		this.pedido = pedido;
	}
    
    //CONSTRUCTOR CON ID.
	public Factura(Integer id, Date fecha, String tipo, String estado, Cliente cliente, Set<ItemFactura> itemFactura,
			Float importe, Pedido pedido) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.tipo = tipo;
		this.estado = estado;
		this.cliente = cliente;
		this.itemFactura = itemFactura;
		this.importe = importe;
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Set<ItemFactura> getItemFactura() {
		return itemFactura;
	}
	public void setItemFactura(Set<ItemFactura> itemFactura) {
		this.itemFactura = itemFactura;
	}
	public Float getImporte() {
		return importe;
	}
	public void setImporte(Float importe) {
		this.importe = importe;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	//PERSISITR.
	public void persist(Factura factura){
		
	}
	
	//UPDATE
	public void update(Factura factura){
		
	}
	
	//LOAD.
	public Factura load(int idFactura){
		return new Factura();
	}
	
	//METODOS DE NEGOCIO.
	public void agregarItem(ItemFactura itemFactura) {
        // TODO implement here
    }
    public Float calcularImporte() {
        // TODO implement here
        return 0.0f;
    }
    public void saldarFactura(Float importe) {
       // TODO implement here

    }
    public void generarRemito() {
        // TODO implement here
    }

}
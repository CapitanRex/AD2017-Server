package modelo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="itemPedido")
public class ItemPedido implements Serializable {
	//SERIALIZABLE.
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALINT")
	private Integer id;
	@Column(name="cantidad", columnDefinition="INT")
	private Integer cantidad;
	@Column(name="cantidadLista", columnDefinition="INT")
	private Integer cantidadLista;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="prendaId", columnDefinition="SMALLINT")
	private Prenda prenda;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="talleId", columnDefinition="SMALLINT")
    private Talle talle;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="colorId", columnDefinition="SMALLINT")
    private Color color;
	@Column(name="precio", columnDefinition="FLOAT")
    private Float precio;
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="pedidoId", columnDefinition="SMALLINT")
    private Pedido pedido;
	
	//CONSTRUCTOR VACIO.
    public ItemPedido() {
		super();
	}

    //CONSTRUCTOR.
	public ItemPedido(Integer cantidad, Integer cantidadLista, Prenda prenda, Talle talle, Color color, Float precio, Pedido pedido) {
		super();
		this.cantidad = cantidad;
		this.cantidadLista = cantidadLista;
		this.prenda = prenda;
		this.talle = talle;
		this.color = color;
		this.precio = precio;
		this.pedido = pedido;
	}
	
	//CONSTRUCTOR CON ID.
	public ItemPedido(Integer id, Integer cantidad, Integer cantidadLista, Prenda prenda, Talle talle, Color color, Float precio, Pedido pedido) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.cantidadLista = cantidadLista;
		this.prenda = prenda;
		this.talle = talle;
		this.color = color;
		this.precio = precio;
		this.pedido = pedido;
	}
    
	//GETTERS & SETTERS.
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Integer getCantidadLista() {
		return cantidadLista;
	}
	public void setCantidadLista(Integer cantidadLista) {
		this.cantidadLista = cantidadLista;
	}
	public Prenda getPrenda() {
		return prenda;
	}
	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}
	public Talle getTalle() {
		return talle;
	}
	public void setTalle(Talle talle) {
		this.talle = talle;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	//METODOS DE NEGOCIO.
	public float getTotal() {
        // TODO implement here
        return 0.0f;
    }

}
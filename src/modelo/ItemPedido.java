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
	@Column(name="cantidad", columnDefinition="INTEGER")
	private Integer cantidad;
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
	
	@Column(name="pedidoId", columnDefinition="SMALLINT")
    private Integer pedidoId;
	
	//CONSTRUCTOR VACIO.
    public ItemPedido() {
		super();
	}

    //CONSTRUCTOR.
	public ItemPedido(Integer cantidad, Prenda prenda, Talle talle, Color color, Float precio, Integer pedidoId) {
		super();
		this.cantidad = cantidad;
		this.prenda = prenda;
		this.talle = talle;
		this.color = color;
		this.precio = precio;
		this.pedidoId = pedidoId;
	}
	
	//CONSTRUCTOR CON ID.
	public ItemPedido(Integer id, Integer cantidad, Prenda prenda, Talle talle, Color color, Float precio) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.prenda = prenda;
		this.talle = talle;
		this.color = color;
		this.precio = precio;
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
	
	//METODOS DE NEGOCIO.
	public float getTotal() {
        // TODO implement here
        return 0.0f;
    }

}
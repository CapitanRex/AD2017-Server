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
@Table(name="itemFactura")
public class ItemFactura implements Serializable {
	//SERIALIZABLE.
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALINT")
	private Integer id;
	@Column(name="cantidad", columnDefinition="INT")
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
    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="facturaId", columnDefinition="SMALLINT")
    private Factura factura;
    
	//CONSTRUCTOR VACIO.
    public ItemFactura() {
		super();
	}

    //CONSTRUCTOR.
	public ItemFactura(Integer cantidad, Prenda prenda, Talle talle, Color color, Float precio, Factura factura) {
		super();
		this.cantidad = cantidad;
		this.prenda = prenda;
		this.talle = talle;
		this.color = color;
		this.precio = precio;
		this.factura = factura;
	}
	
	//CONSTRUCTOR CON ID.
	public ItemFactura(Integer id, Integer cantidad, Prenda prenda, Talle talle, Color color, Float precio, Factura factura) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.prenda = prenda;
		this.talle = talle;
		this.color = color;
		this.precio = precio;
		this.factura = factura;
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
}
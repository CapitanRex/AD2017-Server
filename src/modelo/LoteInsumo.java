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
@Table(name="loteInsumo")
public class LoteInsumo implements Serializable {
	//SERIALIZABLE.
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
	private Integer id;
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="insumoId", columnDefinition="SMALLINT")
    private Insumo insumo;
	@Column(name="precioUnitario", columnDefinition="FLOAT")
    private Float precioUnitario;
	@Column(name="cantidad", columnDefinition="INT")
    private Integer cantidad;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="ordenCompraId", columnDefinition="SMALLINT")
    private OrdenCompra ordenCompra;
    
	//CONSTRUCTOR VACIO.
    public LoteInsumo() {
		super();
		// TODO Auto-generated constructor stub
	}

    //CONSTRUCTOR.
	public LoteInsumo(Insumo insumo, Float precioUnitario, Integer cantidad, OrdenCompra ordenCompra) {
		super();
		this.insumo = insumo;
		this.precioUnitario = precioUnitario;
		this.cantidad = cantidad;
		this.ordenCompra = ordenCompra;
	}

	//CONSTRUCTOR CON ID.
	public LoteInsumo(Integer id, Insumo insumo, Float precioUnitario, Integer cantidad, OrdenCompra ordenCompra) {
		super();
		this.id = id;
		this.insumo = insumo;
		this.precioUnitario = precioUnitario;
		this.cantidad = cantidad;
		this.ordenCompra = ordenCompra;
	}

	//METODOS GETTER & SETTER.
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Insumo getInsumo() {
		return insumo;
	}
	public void setInsumo(Insumo insumo) {
		this.insumo = insumo;
	}
	public Float getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(Float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public OrdenCompra getOrdenCompra() {
		return ordenCompra;
	}
	public void setOrdenCompra(OrdenCompra ordenCompra) {
		this.ordenCompra = ordenCompra;
	}
	
	//METODOS DE NEGOCIO.
	public Float calcularPrecio() {
        // TODO implement here
        return 0.0f;
	}

	public Boolean sos(Prenda prenda, Talle talle, Color color) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean sos(Insumo insumo) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getLoteId() {
		// TODO Auto-generated method stub
		return null;
	}

}
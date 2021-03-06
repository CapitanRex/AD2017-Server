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
@Table(name = "itemInsumoOP")
public class ItemInsumoOP implements Serializable{
	//SERIALIZABLE.
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
	private Integer id;
	@Column(name="cantidad", columnDefinition="INT")
	private Integer cantidad;
	@Column(name="cantidadLista", columnDefinition="INT")
	private Integer cantidadLista;
	@Column(name="desperdicio", columnDefinition="FLOAT")
    private Float desperdicio;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="insumoId", columnDefinition="SMALLINT")
    private Insumo insumo;
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="itemOPId", columnDefinition="SMALLINT")
	private ItemOP itemOP;
    
   //CONSTRUCTOR VACIO. 
    public ItemInsumoOP() {
		super();
		// TODO Auto-generated constructor stub
	}

    //CONSTRUCTOR.
	public ItemInsumoOP(Integer cantidad, Integer cantidadLista, Float desperdicio, Insumo insumo, ItemOP itemOP ) {
		super();
		this.cantidad = cantidad;
		this.cantidadLista = cantidadLista;
		this.desperdicio = desperdicio;
		this.insumo = insumo;
		this.itemOP = itemOP;
	}

	//CONSTRUCTOR CON ID.
	public ItemInsumoOP(Integer id, Integer cantidad, Integer cantidadLista, Float desperdicio, Insumo insumo, ItemOP itemOP ) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.cantidadLista = cantidadLista;
		this.desperdicio = desperdicio;
		this.insumo = insumo;
		this.itemOP = itemOP;
	}

	//METODOS GETTER & SETTER.
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
	public Float getDesperdicio() {
		return desperdicio;
	}
	public void setDesperdicio(Float desperdicio) {
		this.desperdicio = desperdicio;
	}
	public Insumo getInsumo() {
		return insumo;
	}
	public void setInsumo(Insumo insumo) {
		this.insumo = insumo;
	}
	public ItemOP getItemOP() {
		return itemOP;
	}
	public void setItemOP(ItemOP itemOP) {
		this.itemOP = itemOP;
	}

	//METODOS DE NEGOCIO.
	public Float calcularCosto() {
        // TODO implement here
        return 0.0f;
    }
}

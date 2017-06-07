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
@Table(name = "itemInsumoMP")
public class ItemInsumoMP implements Serializable{
	//SERIALIZABLE.
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
	private Integer id;
	@Column(name="cantidad", columnDefinition="INT")
	private Integer cantidad;
	@Column(name="desperdicio", columnDefinition="FLOAT")
    private Float desperdicio;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="insumoId", columnDefinition="SMALLINT")
    private Insumo insumo;
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="itemMPId", columnDefinition="SMALLINT")
	private ItemMP itemMP;

    
   //CONSTRUCTOR VACIO. 
    public ItemInsumoMP() {
		super();
		// TODO Auto-generated constructor stub
	}

    //CONSTRUCTOR.
	public ItemInsumoMP(Integer cantidad, Float desperdicio, Insumo insumo, ItemMP itemMP) {
		super();
		this.cantidad = cantidad;
		this.desperdicio = desperdicio;
		this.insumo = insumo;
		this.itemMP = itemMP;
	}

	//CONSTRUCTOR CON ID.
	public ItemInsumoMP(Integer id, Integer cantidad, Float desperdicio, Insumo insumo, ItemMP itemMP) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.desperdicio = desperdicio;
		this.insumo = insumo;
		this.itemMP = itemMP;
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
	public ItemMP getItemMP() {
		return itemMP;
	}
	public void setItemMP(ItemMP itemMP) {
		this.itemMP = itemMP;
	}

	//METODOS DE NEGOCIO.
	public Float calcularCosto() {
        // TODO implement here
        return 0.0f;
    }
}
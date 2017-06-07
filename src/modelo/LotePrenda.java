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
@Table(name = "lotePrenda")
public class LotePrenda implements Serializable {
	//SERIALIZABLE.
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition = "SMALLINT")
    private Integer id;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="prendaId", columnDefinition="SMALLINT")
    private Prenda prenda;
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="lotePrendaId", columnDefinition="SMALLINT")
    private Set<ItemLotePrenda> items;
	@Column(name="costoProduccion", columnDefinition="FLOAT")
    private Float costoProduccion;
	@Column(name="fecha", columnDefinition="DATE")
    private Date fecha;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="ordenProduccionId")
    private OrdenProduccion ordenProduccion;
    
   //CONSTRUCTOR VACIO. 
    public LotePrenda() {
		super();
		// TODO Auto-generated constructor stub
	}

    //CONSTRUCTOR.
	public LotePrenda(Prenda prenda, Set<ItemLotePrenda> items, Float costoProduccion, Date fecha,
			OrdenProduccion ordenProduccion) {
		super();
		this.prenda = prenda;
		this.items = items;
		this.costoProduccion = costoProduccion;
		this.fecha = fecha;
		this.ordenProduccion = ordenProduccion;
	}

	//CONSTRUCTOR CON ID.
	public LotePrenda(Integer id, Prenda prenda, Set<ItemLotePrenda> items, Float costoProduccion, Date fecha,
			OrdenProduccion ordenProduccion) {
		super();
		this.id = id;
		this.prenda = prenda;
		this.items = items;
		this.costoProduccion = costoProduccion;
		this.fecha = fecha;
		this.ordenProduccion = ordenProduccion;
	}

	//MWTODOS GETTER & SETTER.
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Prenda getPrenda() {
		return prenda;
	}
	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}
	public Set<ItemLotePrenda> getItems() {
		return items;
	}
	public void setItems(Set<ItemLotePrenda> items) {
		this.items = items;
	}
	public Float getCostoProduccion() {
		return costoProduccion;
	}
	public void setCostoProduccion(Float costoProduccion) {
		this.costoProduccion = costoProduccion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public OrdenProduccion getOrdenProduccion() {
		return ordenProduccion;
	}
	public void setOrdenProduccion(OrdenProduccion ordenProduccion) {
		this.ordenProduccion = ordenProduccion;
	}
	
	//METODOS DE NEGOCIO.
	public void agregarItem(ItemLotePrenda item) {
        // TODO implement here
    }

}
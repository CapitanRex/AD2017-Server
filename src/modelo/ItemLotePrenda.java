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
@Table(name="itemLotePrenda")
public class ItemLotePrenda implements Serializable {
	
	private static final long serialVersionUID = 1L;
	//ATRIBUTOS.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
	private Integer id;
	
	@Column(name="cantidad", columnDefinition = "SMALLINT")
	private Integer cantidad;
	
	//RELACIONES:
	//OneToOne
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="talleId", columnDefinition="SMALLINT")
	private Talle talle;
	
	//OneToOne
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="colorId", columnDefinition="SMALLINT")
	private Color color;
    
	
	//ManyToOne
	@ManyToOne
	private LotePrenda lote;


	//CONSTRUCTOR
    public ItemLotePrenda() {
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

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public LotePrenda getLote() {
		return lote;
	}

	public void setLote(LotePrenda lote) {
		this.lote = lote;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
package modelo;

import java.io.Serializable;
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="movimiento")
public class Movimiento implements Serializable{

	private static final long serialVersionUID = 1L;
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
    private Integer id;
	@Column(name="cantidad", columnDefinition = "SMALLINT")
	private Integer cantidad;
	
	@Column(name="fecha")
	@Temporal(TemporalType.DATE)
    private Date fecha;
    
	//RELACIONES
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="motivoId", columnDefinition="SMALLINT")
    private Motivo motivo;//Relacion uno a uno
    
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="slotId", columnDefinition="SMALLINT")
    private Slot slot;//relacion un movimiento tiene un slot (pero un slot no tiene muchos movimientos?)
    
    //tabla loteInsumo (relacion uno a uno) 
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="loteInsumoId", columnDefinition="SMALLINT")
	private LoteInsumo loteInsumo;
	
    //tabla itemLotePrendaId (relacion uno a uno) 
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="itemLotePrendaId", columnDefinition="SMALLINT")
	private ItemLotePrenda itemLotePrenda;

   
	
	//CONSTRUCTOR
    public Movimiento(Integer id, Integer cantidad, Date fecha, Motivo motivo, Slot slot, LoteInsumo loteInsumo,
			ItemLotePrenda itemLotePrenda) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.motivo = motivo;
		this.slot = slot;
		this.loteInsumo = loteInsumo;
		this.itemLotePrenda = itemLotePrenda;
	}

	//GETTERS AND SETTERS:
	
    public Integer getCantidad() {
		return cantidad;
	}

	public Slot getSlot() {
		return slot;
	}

	public void setSlot(Slot slot) {
		this.slot = slot;
	}

	public LoteInsumo getLoteInsumo() {
		return loteInsumo;
	}

	public void setLoteInsumo(LoteInsumo loteInsumo) {
		this.loteInsumo = loteInsumo;
	}

	public ItemLotePrenda getItemLotePrenda() {
		return itemLotePrenda;
	}

	public void setItemLotePrenda(ItemLotePrenda itemLotePrenda) {
		this.itemLotePrenda = itemLotePrenda;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Movimiento() {
    }

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

	public Motivo getMotivo() {
		return motivo;
	}

	public void setMotivo(Motivo motivo) {
		this.motivo = motivo;
	}

	public Slot getSlotId() {
		return slot;
	}

	public void setSlotId(Slot slotId) {
		this.slot = slotId;
	}

	//METODOS DEL NEGOCIO:

}
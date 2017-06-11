package modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="movimiento")
public class Movimiento {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
    private Integer id;
	
	@Column(name="fecha")
	@Temporal(TemporalType.DATE)
    private Date fecha;
    
    private Motivo motivo;//Relacion uno a uno
    
    private Slot slot;//relacion uno a uno
    
    private Integer cantidad;
    
    private ArticuloAlmacenable item; 

    
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

	public Slot getSlot() {
		return slot;
	}

	public void setSlot(Slot slot) {
		this.slot = slot;
	}

	public ArticuloAlmacenable getItem() {
		return item;
	}

	public void setItem(ArticuloAlmacenable item) {
		this.item = item;
	}

}
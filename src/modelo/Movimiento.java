package modelo;

import java.util.Date;

public class Movimiento {

    private Integer id;
    private Date fecha;
    private Motivo motivo;
    private Slot slot;
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
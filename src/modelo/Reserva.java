package modelo;

public class Reserva {

    private Integer id;
    private Integer cantidad;
    private Slot slot;
    
    public Reserva() {
    }

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

	public Slot getSlot() {
		return slot;
	}

	public void setSlot(Slot slot) {
		this.slot = slot;
	}

	public void cancelar() {
        // TODO implement here
    }

}
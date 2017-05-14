package modelo;

public class ItemInsumoMP {
	
    private Integer cantidad;
    private Float desperdicio;
    private Insumo insumo;

    public ItemInsumoMP() {
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

	public Float calcularCosto() {
        // TODO implement here
        return 0.0f;
    }

}
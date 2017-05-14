package modelo;

public class ItemSectorMP {

    private Integer cantidad;
    private SectorProduccion sector;
    
    public ItemSectorMP() {
    }    
    
    public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public SectorProduccion getSector() {
		return sector;
	}

	public void setSector(SectorProduccion sector) {
		this.sector = sector;
	}

	public float calcularCosto() {
        // TODO implement here
        return 0.0f;
    }

}
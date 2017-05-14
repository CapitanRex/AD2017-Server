package modelo;

import java.util.Set;

public class ItemMP {

	private Integer cantidad;
    private Talle talle;
    private Color color;
    private Molde molde;
    private Set<ItemInsumoMP> insumos;
    private Set<ItemSectorMP> sectores;

    public ItemMP() {
    }
    
    public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
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

	public Molde getMolde() {
		return molde;
	}

	public void setMolde(Molde molde) {
		this.molde = molde;
	}

	public Set<ItemInsumoMP> getInsumos() {
		return insumos;
	}

	public void setInsumos(Set<ItemInsumoMP> insumos) {
		this.insumos = insumos;
	}

	public Set<ItemSectorMP> getSectores() {
		return sectores;
	}

	public void setSectores(Set<ItemSectorMP> sectores) {
		this.sectores = sectores;
	}

	public float calcularCostoProduccion() {
        // TODO implement here
        return 0.0f;
    }

}
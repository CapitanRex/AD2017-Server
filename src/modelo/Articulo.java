package modelo;

import java.util.Set;

public class Articulo {

    private String estado;
    private Prenda prenda;
    private Talle talle;
    private Color color;
    private Set<ItemSectorMP> sectoresPendientes;
	
    public Articulo() {
    }

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Prenda getPrenda() {
		return prenda;
	}

	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
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

	public Set<ItemSectorMP> getSectoresPendientes() {
		return sectoresPendientes;
	}

	public void setSectoresPendientes(Set<ItemSectorMP> sectoresPendientes) {
		this.sectoresPendientes = sectoresPendientes;
	}


}
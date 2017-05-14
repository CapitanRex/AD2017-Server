package modelo;

public class ItemFactura {

    private Integer cantidad;
    private Prenda prenda;
    private Talle talle;
    private Color color;
    private Float precio;
    
    public ItemFactura() {
    }

    public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
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

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

}
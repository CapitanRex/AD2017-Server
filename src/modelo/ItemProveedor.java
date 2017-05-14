package modelo;

import java.util.Date;

public class ItemProveedor {
	
    private Integer id;
    private Float precio;
    private Date tiempoEntrega;
    
    public ItemProveedor() {
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Date getTiempoEntrega() {
		return tiempoEntrega;
	}

	public void setTiempoEntrega(Date tiempoEntrega) {
		this.tiempoEntrega = tiempoEntrega;
	}

}
package modelo;

import java.util.Date;
import java.util.Set;

public class Proveedor {

    private Integer id;
    private String cuit;
    private String razonSocial;
    private String estado;
    private String direccion;
    private Set<ItemProveedor> items;

    public Proveedor() {
    }
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Set<ItemProveedor> getItems() {
		return items;
	}

	public void setItems(Set<ItemProveedor> items) {
		this.items = items;
	}

	public void altaItem(Insumo insumo, Float precio, Date tiempoEntrega) {
        // TODO implement here
    }

    public void bajaItem(Integer itemProveedorId) {
        // TODO implement here
    }

}
package modelo;

import java.util.Set;

public class OrdenCompra {

    private Integer id;
    private String estado;
    private Proveedor proveedor;
    private Set<ItemOC> items;

    public OrdenCompra() {
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public Set<ItemOC> getItems() {
		return items;
	}

	public void setItems(Set<ItemOC> items) {
		this.items = items;
	}
    
}
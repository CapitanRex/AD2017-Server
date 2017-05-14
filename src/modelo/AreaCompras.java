package modelo;

import java.sql.Time;
import java.util.Set;

public class AreaCompras {
	
    private AreaAlmacen areaAlmacen;
    private Set<OrdenCompra> ordenesCompra;
    private Set<SolicitudCompra> solicitudesCompra;
    private Set<Proveedor> proveedores;
 
    public AreaCompras() {
    }

    public AreaAlmacen getAreaAlmacen() {
		return areaAlmacen;
	}

	public void setAreaAlmacen(AreaAlmacen areaAlmacen) {
		this.areaAlmacen = areaAlmacen;
	}

	public Set<OrdenCompra> getOrdenesCompra() {
		return ordenesCompra;
	}

	public void setOrdenesCompra(Set<OrdenCompra> ordenesCompra) {
		this.ordenesCompra = ordenesCompra;
	}

	public Set<SolicitudCompra> getSolicitudesCompra() {
		return solicitudesCompra;
	}

	public void setSolicitudesCompra(Set<SolicitudCompra> solicitudesCompra) {
		this.solicitudesCompra = solicitudesCompra;
	}

	public Set<Proveedor> getProveedores() {
		return proveedores;
	}

	public void setProveedores(Set<Proveedor> proveedores) {
		this.proveedores = proveedores;
	}

	public void comprar(Insumo insumo, Integer cantidad, Integer opID) {
        // TODO implement here
    }

    public void consolidadCompras() {
        // TODO implement here
    }

    public void altaProveedor(String cuit, String razonSocial, String direccion) {
        // TODO implement here
    }

    public void bajaProveedor(Integer id) {
        // TODO implement here
    }

    public void altaItemProvedor(Integer proveedorId, Insumo insumo, Float precio, Time tiempoEntrega) {
        // TODO implement here
    }

    public void bajaItemProveedor(Integer proveedorId, Integer itemProveedorId) {
        // TODO implement here
    }

}
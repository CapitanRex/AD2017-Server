package controlador;

import java.util.Set;

import modelo.Empleado;
import modelo.Factura;
import modelo.LotePrenda;
import modelo.Pedido;
import modelo.Remito;
import modelo.Sucursal;

public class CasaCentral {

    private Set<Sucursal> sucursales;
    private AreaVentas areaVentas;
    private AreaAlmacen areaAlmacen;
    private AreaCompras areaCompras;
    private AreaProduccion areaProduccion;
    private Set <Empleado> empleados;

    public CasaCentral() {
    }

    public Set<Sucursal> getSucursales() {
		return sucursales;
	}

	public void setSucursales(Set<Sucursal> sucursales) {
		this.sucursales = sucursales;
	}

	public AreaVentas getAreaVentas() {
		return areaVentas;
	}

	public void setAreaVentas(AreaVentas areaVentas) {
		this.areaVentas = areaVentas;
	}

	public AreaAlmacen getAreaAlmacen() {
		return areaAlmacen;
	}

	public void setAreaAlmacen(AreaAlmacen areaAlmacen) {
		this.areaAlmacen = areaAlmacen;
	}

	public AreaCompras getAreaCompras() {
		return areaCompras;
	}

	public void setAreaCompras(AreaCompras areaCompras) {
		this.areaCompras = areaCompras;
	}

	public AreaProduccion getAreaProduccion() {
		return areaProduccion;
	}

	public void setAreaProduccion(AreaProduccion areaProduccion) {
		this.areaProduccion = areaProduccion;
	}

	public Set<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Set<Empleado> empleados) {
		this.empleados = empleados;
	}

	public void procesarPedido(Pedido pedido) {
        // TODO implement here
    }

    public void novedadesProduccion() {
        // TODO implement here
    }

    public Factura getFactura(Pedido pedido) {
        // TODO implement here
        return null;
    }

    public Remito getRemito(Pedido pedido) {
        // TODO implement here
        return null;
    }

    public void preProcesarPedido(Pedido pedido) {
        // TODO implement here
    }

    public void novedadesProduccion(LotePrenda lote) {
        // TODO implement here
    }

}
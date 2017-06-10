package controlador;

import java.util.Set;
import modelo.Empleado;
import modelo.ItemLotePrenda;
import modelo.LoteInsumo;
import modelo.LotePrenda;
import modelo.OrdenCompra;
import modelo.OrdenProduccion;
import modelo.Pedido;
import modelo.Slot;

public class AreaAlmacen {
	
	//ATRIBUTOS
    private Set<Slot> slots;
    //private Set<Movimiento> movimientos; //Movimientos estan en el Slot
    private Set<Empleado> empleados;
    private Set<OrdenCompra> ordenesCompra;
    private AreaCompras areaCompras;

    //CONSTRUCTOR
	public AreaAlmacen() {
    }
	
	//GETTERS AND SETTERS
    public Set<Slot> getSlots() {
		return slots;
	}

	public void setSlots(Set<Slot> slots) {
		this.slots = slots;
	}

	public Set<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Set<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Set<OrdenCompra> getOrdenesCompra() {
		return ordenesCompra;
	}

	public void setOrdenesCompra(Set<OrdenCompra> ordenesCompra) {
		this.ordenesCompra = ordenesCompra;
	}

	public AreaCompras getAreaCompras() {
		return areaCompras;
	}

	public void setAreaCompras(AreaCompras areaCompras) {
		this.areaCompras = areaCompras;
	}
   
    public void agregarItemSlot(LoteInsumo item) {
        // TODO implement here
    }

    public void removerItemSlot(ItemLotePrenda item) {
        // TODO implement here
    }

    public Integer disponibilidadPrenda(Integer prendaId, Integer talleId, Integer coloIdr) {
        // TODO implement here
        return null;
    }

    public Boolean despacharPedido(Pedido pedido) {
        // TODO implement here
        return null;
    }

    public Integer reservaPrenda(Integer prendaId, Integer talleId, Integer coloIdr, Integer cantidad, Pedido pedido) {
        // TODO implement here
        return null;
    }

    public Integer disponibilidadInsumo(Integer insumoId) {
        // TODO implement here
        return null;
    }

    public Integer reservaInsumo(Integer insumoId, Integer cantidad, OrdenProduccion op) {
        // TODO implement here
        return null;
    }

    public Boolean despacharInsumos(OrdenProduccion op) {
        // TODO implement here
        return null;
    }

    public void agragarOrdenCompra(OrdenCompra oc) {
        // TODO implement here
    }

    public void recepcionInsumos(Integer ocId) {
        // TODO implement here
    }

    public void almacenarLotePrenda(LotePrenda lote) {
        // TODO implement here
    }

}
package modelo;

import java.util.Date;
import java.util.Set;

public class AreaVentas {

    private Set<Factura> facturas;
    private Set<Cliente> clientes;
    private Set<Remito> remitos;
    private Set<Pedido> pedidos;
    
    public AreaVentas() {
    }
    
    public Set<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(Set<Factura> facturas) {
		this.facturas = facturas;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Set<Remito> getRemitos() {
		return remitos;
	}

	public void setRemitos(Set<Remito> remitos) {
		this.remitos = remitos;
	}

	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Integer generarPedido(Cliente cliente, Date fechaProbable) {
        // TODO implement here
        return null;
    }

    public void aprobarPedido(Integer nroPedido) {
        // TODO implement here
    }

    public void cancelarPedido(Integer nroPedido) {
        // TODO implement here
    }

    public Factura generarFactura(Pedido pedido) {
        // TODO implement here
        return null;
    }

    public void actualizarCtaCte(Cliente cliente) {
        // TODO implement here
    }

    public Remito generarRemito(Pedido pedido) {
        // TODO implement here
        return null;
    }

}
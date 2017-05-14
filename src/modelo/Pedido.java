package modelo;

import java.util.Date;
import java.util.Set;

public class Pedido {

    private Integer id;
    private Cliente cliente;
    private Date fecha;
    private Date fechaEntrega;
    private Set<ItemPedido> itemPedido;
    private String estado;
    private Set<ReservaPedido> reservas;

    public Pedido() {
    }
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Set<ItemPedido> getItemPedido() {
		return itemPedido;
	}

	public void setItemPedido(Set<ItemPedido> itemPedido) {
		this.itemPedido = itemPedido;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Set<ReservaPedido> getReservas() {
		return reservas;
	}

	public void setReservas(Set<ReservaPedido> reservas) {
		this.reservas = reservas;
	}

	public void agregarItem() {
        // TODO implement here
    }
    
    public Float getTotal() {
        // TODO implement here
        return 0.0f;
    }

    public void cancelarPedido() {
        // TODO implement here
    }

}
package modelo;

import java.util.Date;
import java.util.Set;

public class Remito {

    private Integer id;
    private Date fecha;
    private Cliente cliente;
    private String estado;
    private Set<ItemRemito> itemsRemito;
    private Pedido pedido;
    
    public Remito() {
    }

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Set<ItemRemito> getItemsRemito() {
		return itemsRemito;
	}

	public void setItemsRemito(Set<ItemRemito> itemsRemito) {
		this.itemsRemito = itemsRemito;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public void agregarItem(ItemRemito itemRemito) {
        // TODO implement here
    }

    public void actualizarEstado(String estado) {
        // TODO implement here
    }

}
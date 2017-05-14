package modelo;

import java.util.Date;
import java.util.Set;

public class Factura {

    private Integer id;
    private Date fecha;
    private String tipo;
    private String estado;
    private Cliente cliente;
    private Set<ItemFactura> itemFactura;
    private Float importe;
    private Pedido pedido;

	
    public void Factura(String fecha, String tipo, Remito remito, Cliente cliente) {
        // TODO implement here
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Set<ItemFactura> getItemFactura() {
		return itemFactura;
	}

	public void setItemFactura(Set<ItemFactura> itemFactura) {
		this.itemFactura = itemFactura;
	}

	public Float getImporte() {
		return importe;
	}

	public void setImporte(Float importe) {
		this.importe = importe;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public void agregarItem(ItemFactura itemFactura) {
        // TODO implement here
    }
    
    public Float calcularImporte() {
        // TODO implement here
        return 0.0f;
    }

    public void saldarFactura(Float importe) {
        // TODO implement here

    }
    public void generarRemito() {
        // TODO implement here
    }

}
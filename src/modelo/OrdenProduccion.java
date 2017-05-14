package modelo;

import java.util.Date;
import java.util.Set;

public class OrdenProduccion {

    private Integer id;
    private Pedido pedido;
    private String tipo;
    private Prenda prenda;
    private Set<ItemMP> items;
    private Date fechaCreacon;
    private Date fechaInicio;
    private Date fechaFin;
    private String estado;
    private Set<ReservaOP> reservas;
    private Set<Articulo> articulos;

    public OrdenProduccion() {
    }    
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Prenda getPrenda() {
		return prenda;
	}

	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}

	public Set<ItemMP> getItems() {
		return items;
	}

	public void setItems(Set<ItemMP> items) {
		this.items = items;
	}

	public Date getFechaCreacon() {
		return fechaCreacon;
	}

	public void setFechaCreacon(Date fechaCreacon) {
		this.fechaCreacon = fechaCreacon;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Set<ReservaOP> getReservas() {
		return reservas;
	}

	public void setReservas(Set<ReservaOP> reservas) {
		this.reservas = reservas;
	}

	public Set<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(Set<Articulo> articulos) {
		this.articulos = articulos;
	}

	public Set<Articulo> generarArticulos() {
        // TODO implement here
        return null;
    }

    public Set<ItemInsumoMP> obtenerInsumos() {
        // TODO implement here
        return null;
    }

}
package modelo;

import java.util.Set;

public class Slot {
    public Slot() {
    }

    private Ubicacion id;
    private String estado;
    private ArticuloAlmacenable item;
    private Integer cantidad;
    private Set<Reserva> reservas;
    private String tipo;


    public boolean estaLleno() {
        // TODO implement here
        return false;
    }

    public Ubicacion getId() {
		return id;
	}

	public void setId(Ubicacion id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public ArticuloAlmacenable getItem() {
		return item;
	}

	public void setItem(ArticuloAlmacenable item) {
		this.item = item;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Set<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(Set<Reserva> reservas) {
		this.reservas = reservas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer disponibilidad(Integer prendaId, Integer talleId, Integer coloIdr) {
        // TODO implement here
        return null;
    }

    public void cancelarReserva(Reserva reserva) {
        // TODO implement here
    }

    public Integer generarReserva(Integer prendaId, Integer talleId, Integer coloIdr, Pedido pedido) {
        // TODO implement here
        return null;
    }

    public Integer disponibilidad(Integer insumoId) {
        // TODO implement here
        return null;
    }

    public Integer generarReserva(Integer insumoId, OrdenProduccion op) {
        // TODO implement here
        return null;
    }

    public void despacharReserva(Reserva reserva) {
        // TODO implement here
    }

}
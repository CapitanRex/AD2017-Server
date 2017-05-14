package modelo;

public class ReservaOP extends Reserva {
    
	private OrdenProduccion ordenProduccion;
    
    public ReservaOP() {
    }

	public OrdenProduccion getOrdenProduccion() {
		return ordenProduccion;
	}

	public void setOrdenProduccion(OrdenProduccion ordenProduccion) {
		this.ordenProduccion = ordenProduccion;
	}

}
package modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

public class ReservaOP extends Reserva {
    //SERIALIZABLE.
	private static final long serialVersionUID = 1L;
	
	//ATRBIUTOS.
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@Column(name = "ordenProduccionId", columnDefinition = "SMALLINT")
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
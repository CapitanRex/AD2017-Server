package controlador;

import java.util.Set;

import modelo.OrdenProduccion;
import modelo.SectorProduccion;

public class AreaProduccion {

    private Set<SectorProduccion> sectores;
    private Set<OrdenProduccion> ordeneProduccion;
	
    public AreaProduccion() {
    }
    
    public Set<SectorProduccion> getSectores() {
		return sectores;
	}

	public void setSectores(Set<SectorProduccion> sectores) {
		this.sectores = sectores;
	}

	public Set<OrdenProduccion> getOrdeneProduccion() {
		return ordeneProduccion;
	}

	public void setOrdeneProduccion(Set<OrdenProduccion> ordeneProduccion) {
		this.ordeneProduccion = ordeneProduccion;
	}

	public void procesarOP(OrdenProduccion op) {
        // TODO implement here
    }
    
    public void novedadesAlmacen() {
    	// TODO implement here
    }

}
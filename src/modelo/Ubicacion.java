package modelo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//en la base esta en Slot esta info
@Embeddable 
public class Ubicacion {
	@Column (name="letraCalle",nullable = false, length = 2, columnDefinition="VARCHAR")
    private String letraCalle;
	@Column(name="nroBloque", columnDefinition="SMALLINT")
    private Integer nroBloque;
	@Column(name="nroEstante", columnDefinition="SMALLINT")
    private Integer nroEstante;
	@Column(name="nroPosicion", columnDefinition="SMALLINT")
    private Integer nroPosicion;
	
	//CONSTRUCTOR VACIO.
    public Ubicacion() {
    	super();
    }
    
    //CONSTRUCTOR.
    public Ubicacion(String letraCalle,Integer nroBloque,Integer nroEstante,Integer nroPosicion) {
    	super();
    	this.letraCalle = letraCalle;
    	this.nroBloque = nroBloque;
    	this.nroEstante = nroEstante;
    	this.nroPosicion = nroPosicion;
    }

    
	public String getLetraCalle() {
		return letraCalle;
	}

	public void setLetraCalle(String letraCalle) {
		this.letraCalle = letraCalle;
	}

	public Integer getNroBloque() {
		return nroBloque;
	}

	public void setNroBloque(Integer nroBloque) {
		this.nroBloque = nroBloque;
	}

	public Integer getNroEstante() {
		return nroEstante;
	}

	public void setNroEstante(Integer nroEstante) {
		this.nroEstante = nroEstante;
	}

	public Integer getNroPosicion() {
		return nroPosicion;
	}

	public void setNroPosicion(Integer nroPosicion) {
		this.nroPosicion = nroPosicion;
	}

}
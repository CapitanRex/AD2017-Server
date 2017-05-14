package modelo;

public class Ubicacion {

    private String letraCalle;
    private Integer nroBloque;
    private Integer nroEstante;
    private Integer nroPosicion;
    
    public Ubicacion() {
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
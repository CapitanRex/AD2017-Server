package modelo;

public class AjusteDano extends Motivo {

    private Empleado autorizante;
    private String destino;

    public AjusteDano() {
    }

	public Empleado getAutorizante() {
		return autorizante;
	}

	public void setAutorizante(Empleado autorizante) {
		this.autorizante = autorizante;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

}
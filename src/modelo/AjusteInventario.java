package modelo;

public class AjusteInventario extends Motivo {

    private Empleado autorizante;

    public AjusteInventario() {
    }

	public Empleado getAutorizante() {
		return autorizante;
	}

	public void setAutorizante(Empleado autorizante) {
		this.autorizante = autorizante;
	}

}
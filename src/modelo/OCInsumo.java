package modelo;

public class OCInsumo extends Motivo {

    private OrdenCompra ordenCompra;

    public OCInsumo() {
    }

	public OrdenCompra getOrdenCompra() {
		return ordenCompra;
	}

	public void setOrdenCompra(OrdenCompra ordenCompra) {
		this.ordenCompra = ordenCompra;
	}

}
package modelo;

public class CumplimientoPedido extends Motivo {
    
	private Pedido pedido;

    public CumplimientoPedido() {
    }

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}
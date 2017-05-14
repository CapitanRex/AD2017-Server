package modelo;

public class ReservaPedido extends Reserva {

    private Pedido pedido;
    
    public ReservaPedido() {
    }

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
    
}
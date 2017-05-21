package modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

public class ReservaPedido extends Reserva {
	//SERIALIZABLE.
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS.
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@Column(name = "pedidoId", columnDefinition = "SMALLINT")
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
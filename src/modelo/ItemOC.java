package modelo;

import javax.persistence.*;

@Entity
@Table(name="itemOC")
public class ItemOC {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition="smallint")
	private Integer id;
    private Integer cantidad;
    private Float precio;
    @ManyToOne
    @JoinColumn(name="ordenCompraId")
    private OrdenCompra ordenCompra;
   
    public ItemOC() {
    }

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

}
package modelo;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="itemProveedor")
public class ItemProveedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition="smallint")
    private Integer id;
    private Float precio;
    @Column(columnDefinition="time")
    private Date tiempoEntrega;
    @ManyToOne
    @JoinColumn(name="proveedorId")
    private Proveedor proveedor;
    
    public ItemProveedor() {
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Date getTiempoEntrega() {
		return tiempoEntrega;
	}

	public void setTiempoEntrega(Date tiempoEntrega) {
		this.tiempoEntrega = tiempoEntrega;
	}

}
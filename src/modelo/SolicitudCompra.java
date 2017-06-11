package modelo;

import javax.persistence.*;

@Entity
@Table(name="solicitudCompra")
public class SolicitudCompra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition="smallint")
	private Integer id;
    private Integer cantidad;
    // TODO: queda comentado para que quien haga ordenproduccion lo habilite
//  @ManyToOne
//  @JoinColumn(name="ordenProduccionId")
    @Transient
    private OrdenProduccion ordenProduccion;
    @Column(name="estadoId",columnDefinition="smallint")
    private String estado;
    @ManyToOne
    @JoinColumn(name="insumoId")
    //24	solicitud_compra_pendiente
    //25	solicitud_compra_emitida
    //26	solicitud_compra_recibida
    private Insumo insumo;
    @ManyToOne
    @JoinColumn(name="proveedorId")
    private Proveedor proveedor;
    @OneToOne
    @JoinColumn(name="ordenCompraId")
    private OrdenCompra ordenCompra;
    
    public SolicitudCompra() {
    }

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public OrdenProduccion getOrdenProduccion() {
		return ordenProduccion;
	}

	public void setOrdenProduccion(OrdenProduccion ordenProduccion) {
		this.ordenProduccion = ordenProduccion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Insumo getInsumo() {
		return insumo;
	}

	public void setInsumo(Insumo insumo) {
		this.insumo = insumo;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public OrdenCompra getOrdenCompra() {
		return ordenCompra;
	}

	public void setOrdenCompra(OrdenCompra ordenCompra) {
		this.ordenCompra = ordenCompra;
	}

}
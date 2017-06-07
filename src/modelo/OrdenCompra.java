package modelo;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="ordenCompra")
public class OrdenCompra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition="smallint")
    private Integer id;
	@Column(name="estadoId",columnDefinition="smallint")
    private String estado;
    @ManyToOne
    @JoinColumn(name="proveedorId")
    private Proveedor proveedor;
    @OneToMany(mappedBy="ordenCompra")
    private Set<ItemOC> items;

    public OrdenCompra() {
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

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public Set<ItemOC> getItems() {
		return items;
	}

	public void setItems(Set<ItemOC> items) {
		this.items = items;
	}
    
}
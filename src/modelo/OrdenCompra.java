package modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="ordenCompra")
public class OrdenCompra implements Serializable {
	//SERIALIZABLE.
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
	private Integer id;
	@Column(name="estadoId", columnDefinition="SMALLINT")
    private Integer estado; //ESTADO
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="proveedorId", columnDefinition="SMALLINT")
    private Proveedor proveedor;
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="ordenCompraId", columnDefinition="SMALLINT")
    private Set<ItemOC> items = new HashSet<ItemOC>();


	//CONSTRUCTOR VACIO.
	public OrdenCompra() {
		super();
		// TODO Auto-generated constructor stub
	}

	//CONSTRUCTOR.
	public OrdenCompra(Integer estado, Proveedor proveedor, Set<ItemOC> items) {
		super();
		this.estado = estado;
		this.proveedor = proveedor;
		this.items = items;
	}

	//CONSTRUCTOR CON ID.
	public OrdenCompra(Integer id, Integer estado, Proveedor proveedor, Set<ItemOC> items) {
		super();
		this.id = id;
		this.estado = estado;
		this.proveedor = proveedor;
		this.items = items;
	}

	//METODOS GETTER & SETTER.
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
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
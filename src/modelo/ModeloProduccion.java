package modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="modeloProducion")
public class ModeloProduccion implements Serializable {
    //SERIALIZABLE.
	static final long serialVersionUID = 1L;
	
	//ATRIBUTOS.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
	private Integer id;
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="modeloProduccionId", columnDefinition="SMALLINT")
    private Set<ItemMP> items = new HashSet<ItemMP>();
	@Column(name="descripcion", columnDefinition="SMALLINT")
    private String descripcion;
	

    //CONSTRUCTOR VACIO.
    public ModeloProduccion() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    //CONTRUCTOR.
	public ModeloProduccion(Set<ItemMP> items, String descripcion) {
		super();
		this.items = items;
		this.descripcion = descripcion;
	}

	//CONSTRUCTOR CON ID.
	public ModeloProduccion(Integer id, Set<ItemMP> items, String descripcion) {
		super();
		this.id = id;
		this.items = items;
		this.descripcion = descripcion;
	}

	//METODOS GETTER & SETTER.
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Set<ItemMP> getItems() {
		return items;
	}
	public void setItems(Set<ItemMP> items) {
		this.items = items;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	//METODOS DE NEGOCIO.
	public Float calcularCostoProduccion() {
        // TODO implement here
        return 0.0f;
    }

}
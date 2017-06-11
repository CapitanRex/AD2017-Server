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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="sectorProduccion")
public class SectorProduccion implements Serializable{
	//SERIALIZABLE.
	private static final long serialVersionUID = 1L;

	//ATRIBUTOS.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
    private Integer id;
	@Column(name="nombre", columnDefinition="VARCHAR")
    private String nombre;
	@Column(name="costo", columnDefinition="FLOAT")
    private Float costo;
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="sectorProduccionId", columnDefinition="SMALLINT")
    private Set<LineaProduccion> lineas = new HashSet<LineaProduccion>();
	@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="sectorProduccionId", columnDefinition="SMALLINT")
	private Set<ItemMP> itemMP = new HashSet<ItemMP>();
	@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="sectorProduccionId", columnDefinition="SMALLINT")
	private Set<ItemOP> itemOP = new HashSet<ItemOP>();
	
	private Set<ItemOP> itemsEnCola;
	
	
	//OJO CON LOS CONSTRUCTORES Y LA REFERENCIA A LOS ITEM MP Y OP!!!!!!!!!
	
    //CONSTRUCTOR VACIO.
    public SectorProduccion() {
		super();
		// TODO Auto-generated constructor stub
	}

    //CONSTRUCTOR.
	public SectorProduccion(String nombre, Float costo) {
		super();
		this.nombre = nombre;
		this.costo = costo;
	}

	//CONSTRUCTOR CON ID.
	public SectorProduccion(Integer id, String nombre, Float costo, Set<LineaProduccion> lineas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.costo = costo;
		this.lineas = lineas;
	}

	//GETTERS & SETTERS.
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Float getCosto() {
		return costo;
	}
	public void setCosto(Float costo) {
		this.costo = costo;
	}
	public Set<LineaProduccion> getLineas() {
		return lineas;
	}
	public void setLineas(Set<LineaProduccion> lineas) {
		this.lineas = lineas;
	}
    public Set<ItemMP> getItemMP() {
		return itemMP;
	}
	public void setItemMP(Set<ItemMP> itemMP) {
		this.itemMP = itemMP;
	}
	public Set<ItemOP> getItemOP() {
		return itemOP;
	}
	public void setItemOP(Set<ItemOP> itemOP) {
		this.itemOP = itemOP;
	}

	//METODOS DE NEGOCIO.
    public void notificar() {
        // TODO implement here
    }
    
    public void procesar(ItemOP item){
    	// TODO
    }
}
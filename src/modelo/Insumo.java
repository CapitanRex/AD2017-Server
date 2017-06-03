package modelo;

import java.io.Serializable;
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
@Table(name="insumo")
public class Insumo implements Serializable{
	//SERIALIZABLE.
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
	private Integer id;
	@Column(name="nombre", columnDefinition="VARCHAR")
    private String nombre;
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="id", columnDefinition="SMALLINT")
    private Set<LoteInsumo> lotes;
    @Column(name="puntoReposicion", columnDefinition="INT")
    private Integer puntoReposicion;
    @Column(name="compraMinima", columnDefinition="INT")
    private Integer compraMinima;
    
    //CONSTRUCTOR VACIO.
    public Insumo() {
		super();
		// TODO Auto-generated constructor stub
	}

    //CONSTRUCTOR.
	public Insumo(String nombre, Set<LoteInsumo> lotes, Integer puntoReposicion, Integer compraMinima) {
		super();
		this.nombre = nombre;
		this.lotes = lotes;
		this.puntoReposicion = puntoReposicion;
		this.compraMinima = compraMinima;
	}

	//CONSTRUCTOR CON ID.
	public Insumo(Integer id, String nombre, Set<LoteInsumo> lotes, Integer puntoReposicion, Integer compraMinima) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.lotes = lotes;
		this.puntoReposicion = puntoReposicion;
		this.compraMinima = compraMinima;
	}

	//METODOS GETTER & SETTER.
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
	public Set<LoteInsumo> getLotes() {
		return lotes;
	}
	public void setLotes(Set<LoteInsumo> lotes) {
		this.lotes = lotes;
	}
	public Integer getPuntoReposicion() {
		return puntoReposicion;
	}
	public void setPuntoReposicion(Integer puntoReposicion) {
		this.puntoReposicion = puntoReposicion;
	}
	public Integer getCompraMinima() {
		return compraMinima;
	}
	public void setCompraMinima(Integer compraMinima) {
		this.compraMinima = compraMinima;
	}
	
	//METODOS DE NEGOCIO.
	public void agregarLote(LoteInsumo lote) {
        // TODO implement here
    }

}
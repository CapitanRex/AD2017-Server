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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="prenda")
public class Prenda implements Serializable {
    //SERIALIZABLE.
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
	private Integer id;
	@Column(name="descripcion", columnDefinition="VARCHAR")
    private String descripcion;
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="prendaId", columnDefinition = "SMALLINT")
    private Set<LotePrenda> lotes;
    @Column(name="estadoId", columnDefinition="SMALLINT")
    private Integer estado;
    @Column(name="porcentajeGanancia", columnDefinition="FLOAT")
    private Float porcentajeGanancia;
    @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="modeloProduccionId", columnDefinition="SMALLINT")
    private ModeloProduccion modelo;
    @Column(name="temporada", columnDefinition="VARCHAR")
    private String temporada;
    
    //CONSTRUCTOR VACIO.
	public Prenda() {
		super();
		// TODO Auto-generated constructor stub
	} 
      
	//CONSTRUCTOR.
    public Prenda(String descripcion, Set<LotePrenda> lotes, Integer estado,
			Float porcentajeGanancia, ModeloProduccion modelo, String temporada) {
		super();
		this.descripcion = descripcion;
		this.lotes = lotes;
		this.estado = estado;
		this.porcentajeGanancia = porcentajeGanancia;
		this.modelo = modelo;
		this.temporada = temporada;
	}

    //CONSTRUCTOR CON ID.
	public Prenda(Integer id, String descripcion, Set<LotePrenda> lotes,
			Integer estado, Float porcentajeGanancia, ModeloProduccion modelo, String temporada) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.lotes = lotes;
		this.estado = estado;
		this.porcentajeGanancia = porcentajeGanancia;
		this.modelo = modelo;
		this.temporada = temporada;
	}

	//GETTERS & SETTERS.
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Set<LotePrenda> getLotes() {
		return lotes;
	}
	public void setLotes(Set<LotePrenda> lotes) {
		this.lotes = lotes;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public Float getPorcentajeGanancia() {
		return porcentajeGanancia;
	}
	public void setPorcentajeGanancia(Float porcentajeGanancia) {
		this.porcentajeGanancia = porcentajeGanancia;
	}
	public ModeloProduccion getModelo() {
		return modelo;
	}
	public void setModelo(ModeloProduccion modelo) {
		this.modelo = modelo;
	}

	public String getTemporada() {
		return temporada;
	}
	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}
	
	//METODOS DE NEGOCIO.
	public Float calcularPrecioVenta() {
        // TODO implement here
        return 0.0f;
    }

    public Float calcularCostoProduccion() {
        // TODO implement here
        return 0.0f;
    }

    public void agregarTalle(Talle talle) {
        // TODO implement here
    }

    public void agregarColor(Color color) {
        // TODO implement here
    }

    public void agregarLote(LotePrenda lote) {
        // TODO implement here
    }

    public void agregarMolde(Molde molde) {
        // TODO implement here
    }

}
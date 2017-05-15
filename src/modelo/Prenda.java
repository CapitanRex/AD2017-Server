package modelo;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	//???????? many to many
    private Set<Color> colores;
    private Set<Talle> talles;
    private Set<LotePrenda> lotes;
    private String estado;
    private Float porcentajeGanancia;
    private ModeloProduccion modelo;
    private Set<Molde> molde;
    private String temporada;
    
    //CONSTRUCTOR.
    public Prenda() {
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
	public Set<Color> getColores() {
		return colores;
	}
	public void setColores(Set<Color> colores) {
		this.colores = colores;
	}
	public Set<Talle> getTalles() {
		return talles;
	}
	public void setTalles(Set<Talle> talles) {
		this.talles = talles;
	}
	public Set<LotePrenda> getLotes() {
		return lotes;
	}
	public void setLotes(Set<LotePrenda> lotes) {
		this.lotes = lotes;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
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
	public Set<Molde> getMolde() {
		return molde;
	}
	public void setMolde(Set<Molde> molde) {
		this.molde = molde;
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
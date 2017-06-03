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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="articulo")
public class Articulo implements Serializable {
	//SERIALIZABLE.
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
	private Integer id;
	@Column(name="id", columnDefinition="SMALLINT")
	private String estado;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="prendaId", columnDefinition="SMALLINT")
    private Prenda prenda;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="talleId", columnDefinition="SMALLINT")
    private Talle talle;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="colorId", columnDefinition="SMALLINT")
    private Color color;
	//NO ESTA EN LA BASE.
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="", columnDefinition="SMALLINT")
    private Set<ItemSectorMP> sectoresPendientes = new HashSet<ItemSectorMP>();
	
   //CONSTRUCTOR VACIO.
	public Articulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	//CONSTRUCTOR.
	public Articulo(String estado, Prenda prenda, Talle talle, Color color, Set<ItemSectorMP> sectoresPendientes) {
		super();
		this.estado = estado;
		this.prenda = prenda;
		this.talle = talle;
		this.color = color;
		this.sectoresPendientes = sectoresPendientes;
	}

	//CONSTRUCTOR CON ID.
	public Articulo(Integer id, String estado, Prenda prenda, Talle talle, Color color,
			Set<ItemSectorMP> sectoresPendientes) {
		super();
		this.id = id;
		this.estado = estado;
		this.prenda = prenda;
		this.talle = talle;
		this.color = color;
		this.sectoresPendientes = sectoresPendientes;
	}

	//METODOS GETTER Y SETTER.
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
	public Prenda getPrenda() {
		return prenda;
	}
	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}
	public Talle getTalle() {
		return talle;
	}
	public void setTalle(Talle talle) {
		this.talle = talle;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Set<ItemSectorMP> getSectoresPendientes() {
		return sectoresPendientes;
	}
	public void setSectoresPendientes(Set<ItemSectorMP> sectoresPendientes) {
		this.sectoresPendientes = sectoresPendientes;
	}
}
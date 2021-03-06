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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "itemMP")
public class ItemMP implements Serializable{
	//SERIALIZABLE.
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", columnDefinition="SMALLINT")
	private Integer id;
	@Column(name = "cantidad", columnDefinition="INT")
	private Integer cantidad;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="talleId", columnDefinition="SMALLINT")
    private Talle talle;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="colorId", columnDefinition="SMALLINT")
    private Color color;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="moldeId", columnDefinition="SMALLINT")
    private Molde molde;
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="itemMPId", columnDefinition="SMALLINT")
    private Set<ItemInsumoMP> insumos = new HashSet<ItemInsumoMP>();
	@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="itemMPId", columnDefinition="SMALLINT")
    private Set<SectorProduccion> sectores = new HashSet<SectorProduccion>();
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="modeloProduccionId", columnDefinition="SMALLINT")
    private ModeloProduccion modelo;

    //CONSTRUCTOR VACIO.
    public ItemMP() {
		super();
		// TODO Auto-generated constructor stub
	}

    //CONSTRUCTOR.
	public ItemMP(Integer cantidad, Talle talle, Color color, Molde molde, Set<ItemInsumoMP> insumos,
			Set<SectorProduccion> sectores, ModeloProduccion modelo) {
		super();
		this.cantidad = cantidad;
		this.talle = talle;
		this.color = color;
		this.molde = molde;
		this.insumos = insumos;
	}
		
	//CONSTRUCTOR CON ID.
	public ItemMP(Integer id, Integer cantidad, Talle talle, Color color, Molde molde, Set<ItemInsumoMP> insumos,
			Set<SectorProduccion> sectores, ModeloProduccion modelo) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.talle = talle;
		this.color = color;
		this.molde = molde;
		this.insumos = insumos;
		this.sectores = sectores;
		this.modelo = modelo;
	}
	//GETTERS & SETTERS.
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
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
	public Molde getMolde() {
		return molde;
	}
	public void setMolde(Molde molde) {
		this.molde = molde;
	}
	public Set<ItemInsumoMP> getInsumos() {
		return insumos;
	}
	public void setInsumos(Set<ItemInsumoMP> insumos) {
		this.insumos = insumos;
	}
	public Set<SectorProduccion> getSectores() {
		return sectores;
	}
	public void setSectores(Set<SectorProduccion> sectores) {
		this.sectores = sectores;
	}
	public ModeloProduccion getModelo() {
		return modelo;
	}
	public void setModelo(ModeloProduccion modelo) {
		this.modelo = modelo;
	}


	//METODOS DE NEGOCIO.
	public float calcularCostoProduccion() {
        // TODO implement here
        return 0.0f;
	}
}


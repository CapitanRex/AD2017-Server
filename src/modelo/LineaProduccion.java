package modelo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="lineaProduccion")
public class LineaProduccion implements Serializable{
	//SERIALIZABLE.
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
	private Integer id;
//    @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
//    @JoinColumn(name="articuloId")
//    private Articulo articulo;
    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="sectorProduccionId", columnDefinition="SMALLINT")
    private SectorProduccion sector;
    
    //CONSTRUCTOR VACIO.
    public LineaProduccion() {
		super();
		// TODO Auto-generated constructor stub
	}

    //CONSTRUCTOR.
	public LineaProduccion(SectorProduccion sector) {
		super();
		this.sector = sector;
	}

	//CONSTRUCTOR CON ID.
	public LineaProduccion(Integer id, SectorProduccion sector) {
		super();
		this.id = id;
		this.sector = sector;
	}

	//METODOS GETTER & SETTER.
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public SectorProduccion getSector() {
		return sector;
	}
	public void setSector(SectorProduccion sector) {
		this.sector = sector;
	}
	
	//METODOS DE NEGOCIO.
	//public void procesarArticulo(Articulo articulo) {
        // TODO implement here
    //}
}
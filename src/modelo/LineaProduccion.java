package modelo;

import java.io.Serializable;
import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="sectorProduccionId", columnDefinition="SMALLINT")
    private SectorProduccion sector;
	@Column(name="id", columnDefinition="TIME")
    private Time duracion;
    
    //CONSTRUCTOR VACIO.
    public LineaProduccion() {
		super();
		// TODO Auto-generated constructor stub
	}

    //CONSTRUCTOR.
	public LineaProduccion(SectorProduccion sector, Time duracion) {
		super();
		this.sector = sector;
		this.duracion = duracion;
	}

	//CONSTRUCTOR CON ID.
	public LineaProduccion(Integer id, SectorProduccion sector, Time duracion) {
		super();
		this.id = id;
		this.sector = sector;
		this.duracion = duracion;
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
	public Time getDuracion() {
		return duracion;
	}
	public void setDuracion(Time duracion) {
		this.duracion = duracion;
	}
	
	public void procesar(ItemOP item){
		//implementar
	}
}
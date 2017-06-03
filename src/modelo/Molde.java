package modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="molde")
public class Molde implements Serializable{
    //SERIALIZABLE.
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
	private Integer id;
	@Column(name="descripcion", columnDefinition="SMALLINT")
    private String descripcion;
	
	//CONSTRUCTOR VACIO.
	public Molde() {
		super();
		// TODO Auto-generated constructor stub
	}

	//CONSTRUCTOR.
	public Molde(String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	//CONSTRUCTOR CON ID.
	public Molde(Integer id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}

	//METODOS GETTER & SETTER.
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
}
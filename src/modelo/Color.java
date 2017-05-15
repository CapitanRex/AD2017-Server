package modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="talle")
public class Color implements Serializable{
	//SERIALIZABLE.
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
	private Integer id;
	@Column(name="nombre", columnDefinition="VARCHAR")
    private String nombre; 

    //CONSTRUCTOR VACIO.
    public Color() {
		super();
	}
     
    //CONSTRUCTOR.
	public Color(String nombre) {
		super();
		this.nombre = nombre;
	}

	//CONSTRUCTOR CON ID.
	public Color(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
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
}
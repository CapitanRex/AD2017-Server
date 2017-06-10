package modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="tipoMotivo")
public class TipoMotivo implements Serializable{
	//SERIALIZABLE.
	private static final long serialVersionUID = 1L;
	//ATRIBUTOS.
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
    private Integer id;
	@Column(name="descripcion", columnDefinition="VARCHAR")
	private String descripcion;
	
	//CONSTRUCTOR:
	public TipoMotivo(Integer id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}

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

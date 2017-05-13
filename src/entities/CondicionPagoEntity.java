package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import modelo.CondicionPago;

@Entity
@Table(name="condicionPago")
public class CondicionPagoEntity implements Serializable{
	//SERIALIZABLE.
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTO.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
	private Integer id;
	@Column(name="descripcion", columnDefinition="VARCHAR")
	private String descripcion;
	
	//CONSTRUCTOR VACIO.
	public CondicionPagoEntity() {
		super();
	}
	
	//CONSTRUCTOR.
	public CondicionPagoEntity(String descripcion) {
		super();
		this.descripcion = descripcion;
	}
	
	//CONSTRUCTOR CON ID.
	public CondicionPagoEntity(Integer id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}
	
	//GETTER & SETTER.
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
	
	//FROM ENTITY.
	public CondicionPago fromEntity(){
		return new CondicionPago(id, descripcion);
	}
}

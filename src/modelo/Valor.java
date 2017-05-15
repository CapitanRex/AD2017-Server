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
import javax.persistence.Table;

@Entity
@Table(name="valor")
public class Valor implements Serializable{
	//SERIALIZABLE.
	private static final long serialVersionUID = 1L;
	 
	//ATRIBUTOS.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
	private Integer id;
	@Column(name="descripcion", columnDefinition="VARCHAR")
	private String descripcion;
	@Column(name="monto", columnDefinition="FLOAT")
	private float monto;
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn (name = "cuentaCorrienteId", columnDefinition="SMALLINT")
	private CuentaCorriente cuenta;
	
	//CONSTRUCTOR VACIO.
	public Valor() {
		super();
	}
	
	//CONSTRUCTOR.
	public Valor(String descripcion, float monto, CuentaCorriente cuenta) {
		super();
		this.descripcion = descripcion;
		this.monto = monto;
		this.cuenta = cuenta;
	}
	
	//CONTRUCTOR CON ID.
	public Valor(Integer id, String descripcion, float monto) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.monto = monto;
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
	public float getMonto() {
		return monto;
	}
	public void setMonto(float monto) {
		this.monto = monto;
	}
}

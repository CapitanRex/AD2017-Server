package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import modelo.CuentaCorriente;

@Entity
@Table(name="valor")
public class ValorEntity implements Serializable{
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
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id")
	private CuentaCorrienteEntity cuentaCorriente;
	
	//CONSTRUCTOR VACIO.
	public ValorEntity() {
		super();
	}
	
	//CONSTRUCTOR.
	public ValorEntity(String descripcion, float monto) {
		super();
		this.descripcion = descripcion;
		this.monto = monto;
	}
	
	//CONTRUCTOR CON ID.
	public ValorEntity(Integer id, String descripcion, float monto) {
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

	public CuentaCorrienteEntity getCuentaCorriente() {
		return cuentaCorriente;
	}

	public void setCuentaCorriente(CuentaCorrienteEntity cuentaCorriente) {
		this.cuentaCorriente = cuentaCorriente;
	}
	
}

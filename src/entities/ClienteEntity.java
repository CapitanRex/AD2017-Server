package entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class ClienteEntity implements Serializable{
	//SERIALIZABLE.
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
	private Integer id;
	@Column(name="cuit", columnDefinition="CHAR")
	private String cuit;
	@Column(name="razonSocial", columnDefinition="VARCHAR")
	private String razonSocial;
	@Column(name="direccion", columnDefinition="VARCHAR")
	private String direccion;
	@Column(name="estadoId", columnDefinition="SMALLINT")
	private Integer estado;
	@OneToOne (cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="cuentaCorrienteId", columnDefinition="SMALLINT")
	private CuentaCorrienteEntity cuenta;
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="condicionPagoId", columnDefinition="SMALLINT")
	private CondicionPagoEntity condicion;
	
	//CONSTRUCTOR VACIO.
	public ClienteEntity() {
		super();
	}

	//CONSTRUCTOR.
	public ClienteEntity(String cuit, String razonSocial, String direccion, Integer estado, CuentaCorrienteEntity cuenta, CondicionPagoEntity condicion) {
		super();
		this.cuit = cuit;
		this.razonSocial = razonSocial;
		this.direccion = direccion;
		this.estado = estado;
		this.cuenta = cuenta;
		this.condicion = condicion;
	}

	//CONSTRUCTOR CON ID.
	public ClienteEntity(Integer id, String cuit, String razonSocial, String direccion, Integer estado, CuentaCorrienteEntity cuenta, CondicionPagoEntity condicion) {
		super();
		this.id = id;
		this.cuit = cuit;
		this.razonSocial = razonSocial;
		this.direccion = direccion;
		this.estado = estado;
		this.cuenta = cuenta;
		this.condicion = condicion;
	}

	//GETTER & SETTER.
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public CuentaCorrienteEntity getCuenta() {
		return cuenta;
	}
	public void setCuenta(CuentaCorrienteEntity cuenta) {
		this.cuenta = cuenta;
	}
	public CondicionPagoEntity getCondicion() {
		return condicion;
	}
	public void setCondicion(CondicionPagoEntity condicion) {
		this.condicion = condicion;
	}	
}

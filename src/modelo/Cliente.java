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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import dao.ClienteDao;

@Entity
@Table(name="cliente")
public class Cliente implements Serializable{
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
	//IMPLEMENTAR EL ONE TO ONE.
	@Column(name="estadoId", columnDefinition="SMALLINT")
	private Integer estado;
	@OneToOne (cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="cuentaCorrienteId", columnDefinition="SMALLINT")
	private CuentaCorriente cuenta;
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="condicionPagoId", columnDefinition="SMALLINT")
	private CondicionPago condicion;
	
	//CONSTRUCTOR VACIO.
	public Cliente() {
		super();
	}

	//CONSTRUCTOR.
	public Cliente(String cuit, String razonSocial, String direccion) {
		super();
		this.cuit = cuit;
		this.razonSocial = razonSocial;
		this.direccion = direccion;
		this.estado = 1; //MODIFICAR
		this.cuenta = new CuentaCorriente(0, 1000);//MODIFICAR
		this.condicion = new CondicionPago("Contado");//MOFICIAR
	}

	//CONSTRUCTOR CON ID.
	public Cliente(Integer id, String cuit, String razonSocial, String direccion, Integer estado, CuentaCorriente cuenta, CondicionPago condicion) {
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
	public CuentaCorriente getCuenta() {
		return cuenta;
	}
	public void setCuenta(CuentaCorriente cuenta) {
		this.cuenta = cuenta;
	}
	public CondicionPago getCondicion() {
		return condicion;
	}
	public void setCondicion(CondicionPago condicion) {
		this.condicion = condicion;
	}	
	
	//PERSISTIR.
	public void persist(Cliente cliente) {
		ClienteDao.getInstancia().InsertCliente(cliente);
	}
	
	//UPDATE
	public void update(Cliente cliente) {
		ClienteDao.getInstancia().UpdateCliente(cliente);
	}
	
	//LOAD CON ID.
	public Cliente loadId(int idCliente) {
		return ClienteDao.getInstancia().LoadClienteId(idCliente);
	}
	
	//LOAD CON CUIT.
	public Cliente loadCuit(String cuitCliente) {
		return ClienteDao.getInstancia().LoadClienteCuit(cuitCliente);
	}
}

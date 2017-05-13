package modelo;

import dao.ClienteDao;
import entities.ClienteEntity;

//Puto!

public class Cliente {
	//ATRIBUTOS.
	private int id;
	private String cuit;
	private String razonSocial;
	private String direccion;
	private int estado;
	private CuentaCorriente cuenta;
	private CondicionPago condicion;
	
	//CONSTRUCTOR VACIO.
	public Cliente () {
		super();
	}

	//CONSTRUCTOR.
	public Cliente (String cuit, String razonSocial, String direccion) {
		super();
		this.cuit = cuit;
		this.razonSocial = razonSocial;
		this.direccion = direccion;
		this.estado = 1;
		this.cuenta = new CuentaCorriente(0, 1000);
		this.condicion = new CondicionPago("Contado");
	}

	//CONSTRUCTOR CON ID.
	public Cliente (int id, String cuit, String razonSocial, String direccion, int estado, CuentaCorriente cuenta, CondicionPago condicion) {
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
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

	//VIEW.
	//public ClienteView toView() {
		//return new ClienteView(id, cuit, razonSocial, direccion, estado, cuenta, condicion);
	//}
	
	//TO ENTITY.
	public ClienteEntity toEntity() {
		return new ClienteEntity(cuit, razonSocial, direccion, estado, cuenta.toEntity(), condicion.toEntity());
	}
	
	//PERSISTIR.
	public void persist(Cliente cliente) {
		ClienteDao.getInstancia().InsertCliente(cliente.toEntity());
	}
	
	//UPDATE
	public void update(Cliente cliente) {
		ClienteDao.getInstancia().UpdateCliente(cliente.toEntity());
	}
	
	//LOAD
	public ClienteEntity load(int idCliente) {
		return ClienteDao.getInstancia().LoadCliente(idCliente);
	}
}

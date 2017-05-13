package modelo;

import dao.EmpleadoDao;
import entities.EmpleadoEntity;

public class Empleado {
	//ATRIBUTO.
	private int id;
	private String nombre;
	private int documento;
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Empleado(String nombre, int documento) {
		super();
		this.nombre = nombre;
		this.documento = documento;
	}
	public Empleado(int id, String nombre, int documento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.documento = documento;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	
	//ENTITY
	public EmpleadoEntity toEntity() {
		return new EmpleadoEntity(id, nombre, documento);
	}
	public void persistir(Empleado empleado){
		EmpleadoDao.getInstancia().InsertEmpleado(empleado.toEntity());
	}
}

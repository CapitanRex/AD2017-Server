package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import dao.EmpleadoDao;

@Entity
@Table(name="empleado")
public class Empleado {
	//ATRIBUTO.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
	private Integer id;
	@Column(name="nombre", columnDefinition="VARCHAR")
	private String nombre;
	@Column(name="documento", columnDefinition="INT")
	private Integer documento;
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Empleado(String nombre, Integer documento) {
		super();
		this.nombre = nombre;
		this.documento = documento;
	}
	public Empleado(Integer id, String nombre, Integer documento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.documento = documento;
	}
	
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
	public Integer getDocumento() {
		return documento;
	}
	public void setDocumento(Integer documento) {
		this.documento = documento;
	}
	
	//PERSISTIR.
	public void persistir(Empleado empleado){
		EmpleadoDao.getInstancia().InsertEmpleado(empleado);
	}
}

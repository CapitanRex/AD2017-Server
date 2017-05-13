package modelo;

import entities.CondicionPagoEntity;

public class CondicionPago {
	//ATRIBUTO.
	private int id;
	private String descripcion;
	
	//CONSTRUCTOR VACIO.
	public CondicionPago() {
		super();
	}
	
	//CONSTRUCTOR.
	public CondicionPago(String descripcion) {
		super();
		this.descripcion = descripcion;
	}
	
	//CONSTRUCTOR CON ID.
	public CondicionPago(int id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}
	
	//GETTER & SETTER.
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	//VIEW.
	
	//TO ENTITY.
	public CondicionPagoEntity toEntity() {
		return new CondicionPagoEntity(descripcion);
	}
}

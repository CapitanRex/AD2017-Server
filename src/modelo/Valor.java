package modelo;

import entities.ValorEntity;

public class Valor {
	//ATRIBUTOS.
	private int id;
	private String descripcion;
	private float monto;
	
	//CONSTRUCTOR VACIO.
	public Valor() {
		super();
	}
	
	//CONSTRUCTOR.
	public Valor(String descripcion, float monto) {
		super();
		this.descripcion = descripcion;
		this.monto = monto;
	}
	
	//CONTRUCTOR CON ID.
	public Valor(int id, String descripcion, float monto) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.monto = monto;
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
	public float getMonto() {
		return monto;
	}
	public void setMonto(float monto) {
		this.monto = monto;
	}

	//VIEW.
	
	//ENTITY.
	public ValorEntity toEntity() {
		return new ValorEntity(id, descripcion, monto);
	}
}

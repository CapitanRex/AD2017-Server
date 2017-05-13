package modelo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import entities.CuentaCorrienteEntity;
import entities.ValorEntity;

public class CuentaCorriente {
	//ATRIBUTOS.
	private int id;
	private float credito;
	private float limite;
	private Set<Valor> valores;
	
	//CONSTRUCTOR VACIO.
	public CuentaCorriente() {
		super();
	}
	
	//CONSTRUCTOR.
	public CuentaCorriente(float credito, float limite) {
		this.credito = credito;
		this.limite = limite;
		this.valores = new HashSet<Valor>();
	}

	//CONSTRUCTOR CON ID.
	public CuentaCorriente(int id, float credito, float limite, Set<Valor> valores) {
		this.id = id;
		this.credito = credito;
		this.limite = limite;
		this.valores = valores;
	}
	
	//GETER & SETTER.
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getCredito() {
		return credito;
	}
	public void setCredito(float credito) {
		this.credito = credito;
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public Set<Valor> getValores() {
		return valores;
	}
	public void setValores(Set<Valor> valores) {
		this.valores = valores;
	}
	
	//VIEW.
	//public CuentaCorrienteView toView
	
	//ENTITY.
	public CuentaCorrienteEntity toEntity() {
		Set<ValorEntity> valoresEntity = new HashSet<ValorEntity>();
		Iterator<Valor> iterator = valores.iterator();
		while(iterator.hasNext())
			valoresEntity.add(iterator.next().toEntity());
		return new CuentaCorrienteEntity (credito, limite);
	}
}

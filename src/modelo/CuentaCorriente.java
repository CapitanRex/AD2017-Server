package modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cuentaCorriente")
public class CuentaCorriente implements Serializable{
	//SERIALIZABLE.
	private static final long serialVersionUID = 1L;
	 
	//ATRIBUTOS.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
	private Integer id;
	@Column(name="credito", columnDefinition="FLOAT")
	private float credito;
	@Column(name="limite", columnDefinition="FLOAT")
	private float limite;
	@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn (name = "cuentaCorrienteId")
	private Set<Valor> valores = new HashSet<Valor>();
	
	//CONSTRUCTOR VACIO.
	public CuentaCorriente() {
		super();
	}

	//CONSTRUCTOR.
	public CuentaCorriente(float credito, float limite) {
		super();
		this.credito = credito;
		this.limite = limite;
	}

	//CONSTRUCTOR CON ID.
	public CuentaCorriente(Integer id, float credito, float limite, Set<Valor> valores) {
		super();
		this.id = id;
		this.credito = credito;
		this.limite = limite;
		this.valores = valores;
	}
	
	//GETTER & SETTER.
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
}


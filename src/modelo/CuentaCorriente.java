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

	//HASHCODE.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	//EQUALS.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaCorriente other = (CuentaCorriente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
	
	
}


package modelo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="motivo")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Motivo implements Serializable{
	//SERIALIZABLE.
	private static final long serialVersionUID = 1L;

	//ATRIBUTOS.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
    private Integer id;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="empleadoId", columnDefinition="SMALLINT")
    private Empleado empleadoResponsable;
	
    
    public Motivo() {
    }

	public Empleado getEmpleado() {
		return empleadoResponsable;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleadoResponsable = empleado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
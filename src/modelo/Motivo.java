package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="motivo")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) //Segun la base, esta todo en una tabla. Esta linea se puede obviar, ya que por defecto se usa esto.

public class Motivo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
    private Integer id;
	
	//Relacion uno a uno con Empleado (incompleto)
	
	@OneToOne
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
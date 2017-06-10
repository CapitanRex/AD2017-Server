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
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) //Segun la base, esta todo en una tabla. Esta linea se puede obviar, ya que por defecto se usa esto.
public class Motivo implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
    private Integer id;
	
	//Relacion uno a uno con Empleado 
	@OneToOne(fetch = FetchType.EAGER, mappedBy = "motivo", cascade = CascadeType.ALL)
    private Empleado empleadoResponsable;
    
	
	
	//tipoMotivo uno a uno 
	//1:ajuste_inventario , 2:ajuste_daño , 3:devolucion_mercaderia, 4: orden_compra_insumo
	//5:cumplimiento_orden_produccion , 6:	cumplimiento_pedido
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="tipoMotivoId", columnDefinition="SMALLINT")
    private TipoMotivo tipoMotivo;
	
	
	
	//CONSTRUCTOR VACIO
    public Motivo() {
    	super();
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
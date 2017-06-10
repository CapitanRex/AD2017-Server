package modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="slot")
public class Slot implements Serializable{
	//SERIALIZABLE.
		private static final long serialVersionUID = 1L;
    //Atributos:
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
    private Integer id;
    //-UBICACION:
	@Column (name="letraCalle",nullable = false, length = 2, columnDefinition="VARCHAR")
    private String letraCalle;
	@Column(name="nroBloque", columnDefinition="SMALLINT")
    private Integer nroBloque;
	@Column(name="nroEstante", columnDefinition="SMALLINT")
    private Integer nroEstante;
	@Column(name="nroPosicion", columnDefinition="SMALLINT")
    private Integer nroPosicion;
	//-RELACIONES:
	
	//tabla estado (22:slot_vacio,23:slot_lleno)
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="estadoId", columnDefinition="SMALLINT")
    private Estado estado;
   
	//tabla tipoSlot (1:prenda, 2:ainsumo)
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="tipoSlotId", columnDefinition="SMALLINT")
    private TipoSlot tipo;
	
    //tabla loteInsumo (relacion uno a uno) 
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="loteInsumoId", columnDefinition="SMALLINT")
	private LoteInsumo loteInsumo;
	
    //tabla itemLotePrendaId (relacion uno a uno) 
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="itemLotePrendaId", columnDefinition="SMALLINT")
	private ItemLotePrenda itemLotePrenda;
	
    //tabla movimientos (un Slot tiene muchos Movimientos) ----NO ENCONTRE LA RELACION EN LA BD !!
	//@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	//@JoinColumn(name="x", columnDefinition="SMALLINT")
    //private Set<Movimiento> movimientos;

	//CONSTRUCTOR
    public Slot() {
    }
    
  
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public TipoSlot getTipo() {
		return tipo;
	}

	public void setTipo(TipoSlot tipo) {
		this.tipo = tipo;
	}

	public String getLetraCalle() {
		return letraCalle;
	}

	public void setLetraCalle(String letraCalle) {
		this.letraCalle = letraCalle;
	}

	public Integer getNroBloque() {
		return nroBloque;
	}

	public void setNroBloque(Integer nroBloque) {
		this.nroBloque = nroBloque;
	}

	public Integer getNroEstante() {
		return nroEstante;
	}

	public void setNroEstante(Integer nroEstante) {
		this.nroEstante = nroEstante;
	}

	public Integer getNroPosicion() {
		return nroPosicion;
	}

	public void setNroPosicion(Integer nroPosicion) {
		this.nroPosicion = nroPosicion;
	}
//METODOS NEGOCIO:
//------------------
	public boolean estaLleno() {
	        // TODO implement here
	        return false;
	    }
	public Integer disponibilidad(Integer prendaId, Integer talleId, Integer coloIdr) {
        // TODO implement here
        return null;
    }
	 public Integer disponibilidad(Integer insumoId) {
	        // TODO implement here
	        return null;
	    }


}
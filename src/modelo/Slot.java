package modelo;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="slot")
public class Slot {
    
    @Id//En la base esta definido como integer, cuando si queremos usar el codigo de la ubicacion deberia ser String
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="SMALLINT")
    private Integer id;
    
    @Embedded
    private Ubicacion ubicacion;//La definicion de la base esta en la clase embebida Ubicacion
    @Column(name="estadoSlotId", columnDefinition="SMALLINT")
    private String estado;
    //18	proveedor_inactivo
    //19	proveedor_activo
    @Column(name="cantidad", columnDefinition="SMALLINT")
    private Integer cantidad;
    @Column(name="tipoId", columnDefinition="SMALLINT")
    private String tipo;
    //Esto es una interface
    private ArticuloAlmacenable item;

    public Slot() {
    }
    
    public boolean estaLleno() {
        // TODO implement here
        return false;
    }

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public ArticuloAlmacenable getItem() {
		return item;
	}

	public void setItem(ArticuloAlmacenable item) {
		this.item = item;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
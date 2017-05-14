package modelo;

import java.util.Set;

public class Insumo {

    private Integer id;
    private String nombre;
    private Set<LoteInsumo> lotes;
    private Integer puntoReposicion;
    private Integer compraMinima;
    
    public Insumo() {
    }

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<LoteInsumo> getLotes() {
		return lotes;
	}

	public void setLotes(Set<LoteInsumo> lotes) {
		this.lotes = lotes;
	}

	public Integer getPuntoReposicion() {
		return puntoReposicion;
	}

	public void setPuntoReposicion(Integer puntoReposicion) {
		this.puntoReposicion = puntoReposicion;
	}

	public Integer getCompraMinima() {
		return compraMinima;
	}

	public void setCompraMinima(Integer compraMinima) {
		this.compraMinima = compraMinima;
	}

	public void agregarLote(LoteInsumo lote) {
        // TODO implement here
    }

}
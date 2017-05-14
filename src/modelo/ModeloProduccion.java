package modelo;

import java.util.Set;

public class ModeloProduccion {
    private Integer id;
    private Prenda prenda;
    private Set<ItemMP> items;
    private String descripcion;

    public ModeloProduccion() {
    }
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Prenda getPrenda() {
		return prenda;
	}

	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}

	public Set<ItemMP> getItems() {
		return items;
	}

	public void setItems(Set<ItemMP> items) {
		this.items = items;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Float calcularCostoProduccion() {
        // TODO implement here
        return 0.0f;
    }

}
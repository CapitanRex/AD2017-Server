package modelo;

import java.util.Set;

public class SectorProduccion {


    public SectorProduccion() {
    }

    private Integer id;
    private String nombre;
    private Float costo;
    private Set<LineaProduccion> lineas;
    private AreaProduccion area;

    public void notificar() {
        // TODO implement here
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

	public Float getCosto() {
		return costo;
	}

	public void setCosto(Float costo) {
		this.costo = costo;
	}

	public Set<LineaProduccion> getLineas() {
		return lineas;
	}

	public void setLineas(Set<LineaProduccion> lineas) {
		this.lineas = lineas;
	}

	public AreaProduccion getArea() {
		return area;
	}

	public void setArea(AreaProduccion area) {
		this.area = area;
	}

	public void procesarArticulo(Articulo articulo) {
        // TODO implement here
    }

}
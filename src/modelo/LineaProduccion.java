package modelo;

public class LineaProduccion {

    private Integer id;
    private SectorProduccion sector;
    private Articulo articulo;
    
    public LineaProduccion() {
    }

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SectorProduccion getSector() {
		return sector;
	}

	public void setSector(SectorProduccion sector) {
		this.sector = sector;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public void procesarArticulo(Articulo articulo) {
        // TODO implement here
    }

}
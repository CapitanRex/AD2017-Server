package modelo;

public class LoteInsumo implements ArticuloAlmacenable {

    private Integer id;
    private Insumo insumo;
    private Float precioUnitario;
    private Integer cantidad;
    private OrdenCompra ordenCompra;
    
    public LoteInsumo() {
    }
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Insumo getInsumo() {
		return insumo;
	}

	public void setInsumo(Insumo insumo) {
		this.insumo = insumo;
	}

	public Float getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(Float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public OrdenCompra getOrdenCompra() {
		return ordenCompra;
	}

	public void setOrdenCompra(OrdenCompra ordenCompra) {
		this.ordenCompra = ordenCompra;
	}

	public Float calcularPrecio() {
        // TODO implement here
        return 0.0f;
    }

	@Override
	public Boolean sos(Prenda prenda, Talle talle, Color color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean sos(Insumo insumo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getLoteId() {
		// TODO Auto-generated method stub
		return null;
	}

}
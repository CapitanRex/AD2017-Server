package modelo;

public class ItemLotePrenda implements ArticuloAlmacenable {
	
    private Talle talle;
    private Color color;
    private Integer cantidad;
    private LotePrenda lote;
    private Integer id;

    public ItemLotePrenda() {
    }

	public Talle getTalle() {
		return talle;
	}

	public void setTalle(Talle talle) {
		this.talle = talle;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public LotePrenda getLote() {
		return lote;
	}

	public void setLote(LotePrenda lote) {
		this.lote = lote;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
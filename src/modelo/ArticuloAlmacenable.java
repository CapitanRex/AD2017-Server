package modelo;

public interface ArticuloAlmacenable {

    public Boolean sos(Prenda prenda, Talle talle, Color color);
    public Boolean sos(Insumo insumo);
    public Integer getLoteId();

}
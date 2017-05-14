package modelo;

import java.util.Date;
import java.util.Set;

public class LotePrenda {
    private Integer id;
    private Prenda prenda;
    private Set<ItemLotePrenda> items;
    private Float costoProduccion;
    private Date fecha;
    private OrdenProduccion ordenProduccion;
    
    public LotePrenda() {
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

	public Set<ItemLotePrenda> getItems() {
		return items;
	}

	public void setItems(Set<ItemLotePrenda> items) {
		this.items = items;
	}

	public Float getCostoProduccion() {
		return costoProduccion;
	}

	public void setCostoProduccion(Float costoProduccion) {
		this.costoProduccion = costoProduccion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public OrdenProduccion getOrdenProduccion() {
		return ordenProduccion;
	}

	public void setOrdenProduccion(OrdenProduccion ordenProduccion) {
		this.ordenProduccion = ordenProduccion;
	}

	public void agregarItem(ItemLotePrenda item) {
        // TODO implement here
    }

}
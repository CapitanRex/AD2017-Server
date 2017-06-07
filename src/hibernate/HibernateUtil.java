package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import modelo.Cliente;
import modelo.Color;
import modelo.CondicionPago;
import modelo.CuentaCorriente;
import modelo.CumplimientoOP;
import modelo.CumplimientoPedido;
import modelo.DevolucionMercaderia;
import modelo.Empleado;
import modelo.Factura;
import modelo.Insumo;
import modelo.ItemFactura;
import modelo.ItemInsumoMP;
import modelo.ItemLotePrenda;
import modelo.ItemMP;
import modelo.ItemOC;
import modelo.ItemOP;
import modelo.ItemPedido;
import modelo.ItemProveedor;
import modelo.ItemRemito;
import modelo.LineaProduccion;
import modelo.LoteInsumo;
import modelo.LotePrenda;
import modelo.ModeloProduccion;
import modelo.Molde;
import modelo.Motivo;
import modelo.Movimiento;
import modelo.OCInsumo;
import modelo.OrdenCompra;
import modelo.OrdenProduccion;
import modelo.Pedido;
import modelo.Prenda;
import modelo.Proveedor;
import modelo.Remito;
import modelo.SectorProduccion;
import modelo.Slot;
import modelo.SolicitudCompra;
import modelo.Sucursal;
import modelo.Talle;
import modelo.Ubicacion;
import modelo.Valor;
 
public class HibernateUtil {
	
	private static HibernateUtil instancia;
    private static SessionFactory sessionFactory;
    
    public static HibernateUtil getInstancia(){
		if(instancia==null){
			instancia = new HibernateUtil();
		}
		return instancia;	
	}
    
    private HibernateUtil() {
        try {
        	
        	Configuration config = new Configuration();
        	config.addAnnotatedClass(Cliente.class);
        	config.addAnnotatedClass(Color.class);
        	config.addAnnotatedClass(CondicionPago.class);
        	config.addAnnotatedClass(CuentaCorriente.class);
        	config.addAnnotatedClass(CumplimientoOP.class);
        	config.addAnnotatedClass(CumplimientoPedido.class);
        	config.addAnnotatedClass(DevolucionMercaderia.class);
        	config.addAnnotatedClass(Empleado.class);
        	config.addAnnotatedClass(Factura.class);
        	config.addAnnotatedClass(Insumo.class);
        	config.addAnnotatedClass(ItemFactura.class);
        	config.addAnnotatedClass(ItemInsumoMP.class);
        	config.addAnnotatedClass(ItemLotePrenda.class);
        	config.addAnnotatedClass(ItemMP.class);
        	config.addAnnotatedClass(ItemOC.class);
        	config.addAnnotatedClass(ItemOP.class);
        	config.addAnnotatedClass(ItemPedido.class);
        	config.addAnnotatedClass(ItemProveedor.class);
        	config.addAnnotatedClass(ItemRemito.class);
        	config.addAnnotatedClass(LineaProduccion.class);
        	config.addAnnotatedClass(LoteInsumo.class);
        	config.addAnnotatedClass(LotePrenda.class);
        	config.addAnnotatedClass(ModeloProduccion.class);
        	config.addAnnotatedClass(Molde.class);
        	config.addAnnotatedClass(Motivo.class);
        	config.addAnnotatedClass(Movimiento.class);
        	config.addAnnotatedClass(OCInsumo.class);
        	config.addAnnotatedClass(OrdenCompra.class);
        	config.addAnnotatedClass(OrdenProduccion.class);
        	config.addAnnotatedClass(Pedido.class);
        	config.addAnnotatedClass(Prenda.class);
        	config.addAnnotatedClass(Proveedor.class);
        	config.addAnnotatedClass(Remito.class);
        	config.addAnnotatedClass(SectorProduccion.class);
        	config.addAnnotatedClass(Slot.class);
        	config.addAnnotatedClass(SolicitudCompra.class);
        	config.addAnnotatedClass(Sucursal.class);
        	config.addAnnotatedClass(Talle.class);
        	config.addAnnotatedClass(Ubicacion.class);
        	config.addAnnotatedClass(Valor.class);

        	sessionFactory = config.buildSessionFactory();
                        
        }
        catch (Throwable ex)
        {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

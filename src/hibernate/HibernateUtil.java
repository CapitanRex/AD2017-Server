package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import modelo.Cliente;
import modelo.Color;
import modelo.CondicionPago;
import modelo.CuentaCorriente;
import modelo.Empleado;
import modelo.ItemPedido;
import modelo.LotePrenda;
import modelo.Pedido;
import modelo.Prenda;
import modelo.Talle;
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
        	config.addAnnotatedClass(CuentaCorriente.class);
        	config.addAnnotatedClass(CondicionPago.class);
        	config.addAnnotatedClass(Valor.class);
        	config.addAnnotatedClass(Pedido.class);
        	config.addAnnotatedClass(ItemPedido.class);
        	config.addAnnotatedClass(Prenda.class);
        	config.addAnnotatedClass(Color.class);
        	config.addAnnotatedClass(Talle.class);
        	config.addAnnotatedClass(LotePrenda.class);



        	config.addAnnotatedClass(Empleado.class);
        	

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

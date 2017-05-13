package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import modelo.Cliente;
import modelo.CondicionPago;
import modelo.CuentaCorriente;
import modelo.Empleado;
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

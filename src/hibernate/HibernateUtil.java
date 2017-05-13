package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.ClienteEntity;
import entities.CondicionPagoEntity;
import entities.CuentaCorrienteEntity;
import entities.EmpleadoEntity;
import entities.ValorEntity;
 
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
        	config.addAnnotatedClass(ClienteEntity.class);
        	config.addAnnotatedClass(CuentaCorrienteEntity.class);
        	config.addAnnotatedClass(CondicionPagoEntity.class);
        	config.addAnnotatedClass(ValorEntity.class);

        	config.addAnnotatedClass(EmpleadoEntity.class);
        	

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

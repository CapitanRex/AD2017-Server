package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hibernate.HibernateUtil;
import modelo.Empleado;

public class EmpleadoDao {
	//ATRIBUTOS.
	private static EmpleadoDao instancia = null;
	private static SessionFactory sessionFactory= null;

	//SINGLETON.
	public static EmpleadoDao getInstancia(){
			if(instancia == null){
				sessionFactory = HibernateUtil.getInstancia().getSessionFactory();
				instancia = new EmpleadoDao();
			} 
			return instancia;
	}

	//INSERTAR EN DB.
	public void InsertEmpleado(Empleado empleado){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(empleado);
	    session.getTransaction().commit();
	    session.close();
	}

}

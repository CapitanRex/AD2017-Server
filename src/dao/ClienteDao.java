package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hibernate.HibernateUtil;
import modelo.Cliente;

public class ClienteDao {
	//ATRIBUTOS.
	private static ClienteDao instancia = null;
	private static SessionFactory sessionFactory= null;

	//SINGLETON.
	public static ClienteDao getInstancia(){
			if(instancia == null){
				sessionFactory = HibernateUtil.getInstancia().getSessionFactory();
				instancia = new ClienteDao();
			} 
			return instancia;
	}

	//INSERTAR EN DB.
	public void InsertCliente(Cliente cliente) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(cliente);
	    session.getTransaction().commit();
	}
	
	//LOAD EN DB.
	public Cliente LoadCliente(int idCliente){
		Session session = sessionFactory.openSession();
		Cliente cliente = new Cliente();
		session.load(cliente,  idCliente);
	    session.close();
		return cliente;
	}
	
	//UPDATE EN DB.
	public void UpdateCliente(Cliente cliente) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(cliente);
		session.flush();
	    session.getTransaction().commit();
	    session.close();
	}
}


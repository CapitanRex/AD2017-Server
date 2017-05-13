package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entities.ClienteEntity;
import entities.CuentaCorrienteEntity;
import hibernate.HibernateUtil;

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
	public void InsertCliente(ClienteEntity cliente) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(cliente);
	    session.getTransaction().commit();
	}
	
	//LOAD EN DB/
	public ClienteEntity LoadCliente(int idCliente){
		Session session = sessionFactory.openSession();
		ClienteEntity cliente = new ClienteEntity();
		session.load(cliente,  idCliente);
		
		System.out.println(cliente.getRazonSocial());
		System.out.println(cliente.getCondicion().getDescripcion());
		System.out.println(cliente.getCuenta().getLimite());
		System.out.println(cliente.getCuenta().getValores().size());
		
	    session.close();
		return cliente;
	}
	
	//UPDATE EN DB.
	public void UpdateCliente(ClienteEntity cliente) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(cliente);
	    session.getTransaction().commit();
	    session.close();
	}
	
	//INSERTAR EN DB.
	public void UpdateCuentaCrriente(CuentaCorrienteEntity cuenta) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(cuenta);
		session.flush();
	    session.getTransaction().commit();
	}
}


package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hibernate.HibernateUtil;
import modelo.Cliente;

public class PedidoDao {
	//ATRIBUTOS.
	private static PedidoDao instancia = null;
	private static SessionFactory sessionFactory= null;

	//SINGLETON.
	public static PedidoDao getInstancia(){
			if(instancia == null){
				sessionFactory = HibernateUtil.getInstancia().getSessionFactory();
				instancia = new PedidoDao();
			} 
			return instancia;
	}

	//INSERTAR EN DB.
	public void InsertPedido(Cliente pedido) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(pedido);
	    session.getTransaction().commit();
	}

}

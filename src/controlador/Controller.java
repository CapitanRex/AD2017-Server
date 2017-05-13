package controlador;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dao.ClienteDao;
import entities.ClienteEntity;
import interfaz.TDAInterfazControlador;
import modelo.Cliente;
import modelo.Empleado;
import modelo.Valor;


public class Controller extends UnicastRemoteObject implements TDAInterfazControlador{

	//SERIALIZABLE
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS.
	private static Controller instancia;
	
	//SINGLETON.
	public static Controller getInstance() throws RemoteException{
		if(instancia==null)
			instancia= new Controller();
		return instancia;
	}
	
	//CONSTRUCTOR.
	public Controller() throws RemoteException { //CAMBIAR A PRIVADO EN FUTURO.
		super();
		//setPersonas(new ArrayList<Persona>());
	}
	
	//GETTERS & SETTERS.
	


	//ABM
	
	

	
	//ALTA DE cliente.
	public void altaCliente(String cuit, String razon, String direccion)throws RemoteException{
		Cliente nueva = new Cliente(cuit, razon, direccion);
		nueva.persist(nueva);
		
		ClienteEntity c = ClienteDao.getInstancia().LoadCliente(43);
		System.out.println(c.getRazonSocial() + c.getCuenta().getLimite() +"   "+ c.getCuenta().getValores().size());
		Valor v = new Valor("priemra cuota", 4500);
		c.getCuenta().getValores().add(v.toEntity());
		System.out.println(c.getCuenta().getValores().size());
		
		ClienteDao.getInstancia().UpdateCliente(c);
		
	//fslnsvnsjvnsvmlsdv
	}
	
	public void altaEmpleado(String desc, int doc) {
		Empleado e = new Empleado(desc, doc);
		e.persistir(e);
	}
	
}

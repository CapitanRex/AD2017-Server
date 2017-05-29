package controlador;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

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
		Valor v = new Valor("priemra cuota", 4500, nueva.getCuenta());
		nueva.getCuenta().getValores().add(v);
		nueva.persist(nueva);
		
		//Cliente c = ClienteDao.getInstancia().LoadCliente(2);
		//System.out.println(c.getCuenta().getLimite());
		//System.out.println(c.getCuenta().getId());
		//Valor v = new Valor("segunda cuota", 4500, c.getCuenta().getId());
		//c.getCuenta().getValores().add(v);
		//System.out.println(c.getCuenta().getValores().size());
		
		//ClienteDao.getInstancia().UpdateCliente(c);
		
	}
	
	public void altaEmpleado(String desc, int doc) {
		Empleado e = new Empleado(desc, doc);
		e.persistir(e);
	}
	
	public int generarPedido(String cuitCliente) throws RemoteException{
		AreaVentas AV = AreaVentas.getInstance();
		int idPedido = AV.generarPedido(cuitCliente);
		return idPedido;
	}
	
	public void armarPedido(int cantidad, int idPrenda, int idTalle, int idColor, float precio, int idPedido) throws RemoteException{
		AreaVentas AV = AreaVentas.getInstance();
		AV.armarPedido(cantidad, idPrenda, idTalle, idColor, precio, idPedido);
	}



	
}

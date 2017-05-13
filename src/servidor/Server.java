package servidor;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import controlador.Controller;
import interfaz.TDAInterfazControlador;


public class Server {
	//ATRIBUTOS.	
	TDAInterfazControlador IC;
	
	//INICIA EL SERVIDOR
	public static void main(String[] args)
	{	
		//NUEVO SERVIDOR.    
		new Server();
	}
	
	public Server() {
		iniciar();
	}
	
	//METODO DE INICIO DE SERVIDOR.
	public void iniciar() {
    	try {
    		LocateRegistry.createRegistry(1099); //DONDE ENCUENTRO EL SERVIDOR.
    		IC = new Controller();
    		Naming.rebind ("//localhost/Controller", IC);
            System.out.println("Fijado en //localhost/Controller");
            
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}

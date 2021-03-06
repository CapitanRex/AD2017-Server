package controlador;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import dao.ClienteDao;
import modelo.Cliente;
import modelo.Color;
import modelo.Factura;
import modelo.ItemPedido;
import modelo.Pedido;
import modelo.Prenda;
import modelo.Remito;
import modelo.Talle;

public class AreaVentas {
	//SERIALIZABLE
  	//private static final long serialVersionUID = 1L;
  	
  	//ATRIBUTOS.
    private Set<Factura> facturas;
    private Set<Cliente> clientes;
    private Set<Remito> remitos;
    private Set<Pedido> pedidos;
  	
  	//INSTANCIA.
  	private static AreaVentas instancia;
  
  	//SINGLETON.
  	public static AreaVentas getInstance() throws RemoteException{
  		if(instancia==null)
  			instancia= new AreaVentas();
  		return instancia;
  	}
    public AreaVentas() {
    	facturas = new HashSet<Factura>();
    	clientes = new HashSet<Cliente>();
    	remitos = new HashSet<Remito>();
    	pedidos = new HashSet<Pedido>();
    }
    
    //GETTER & SETTER.
    public Set<Factura> getFacturas() {
		return facturas;
	}
	public void setFacturas(Set<Factura> facturas) {
		this.facturas = facturas;
	}
	public Set<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}
	public Set<Remito> getRemitos() {
		return remitos;
	}
	public void setRemitos(Set<Remito> remitos) {
		this.remitos = remitos;
	}
	public Set<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	//METODOS DE NEGOCO.
	
	//CLIENTE.
	//VERIFICAR CLIENTE.
	private boolean verificarCliente(Cliente cliente){
		return false;
	}
	
	//BUSCAR CLIENTE
	private Cliente buscarCliente(String cuitCliente) {
		return ClienteDao.getInstancia().LoadClienteId(2);
	}
	
	public void actualizarCtaCte(Cliente cliente) {
        // TODO implement here
    }
	
	//PEDIDO.
	public Integer generarPedido(String cuitCliente) {
		//BUSCA CLIENTE.
		Cliente cliente = buscarCliente(cuitCliente);
		System.out.println(cliente.getCuit());
		//GENERA PEDIDO.
        Pedido pedido = new Pedido(cliente);
        System.out.println(pedido.getCliente().getRazonSocial());
        pedido.persist();
        return pedido.getId();
    }
	
	//ARMAR PEDIDO.
	public void armarPedido(Integer cantidad, int idprenda, int idTalle, int idColor, Float precio, int idPedido){
		
	}

	public void aprobarPedido(Integer nroPedido) {
        // TODO implement here
    }

    public void cancelarPedido(Integer nroPedido) {
        // TODO implement here
    }

    //REMITO.
    public Remito generarRemito(Pedido pedido) {
        // TODO implement here
        return null;
    }
    
    //FACTURA.
    public Factura generarFactura(Pedido pedido) {
        // TODO implement here
        return null;
    }
}
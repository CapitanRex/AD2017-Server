package modelo;

import java.util.Set;

import controlador.AreaVentas;

public class Sucursal {

    public Sucursal() {
    }

    private Integer id;
    private String direccion;
    private Empleado gerente;
    private Set<Empleado> empleados;
    private Set<Cliente> clientes;
    private AreaVentas areaVentas;

    public void altaCliente() {
        // TODO implement here
    }

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Empleado getGerente() {
		return gerente;
	}

	public void setGerente(Empleado gerente) {
		this.gerente = gerente;
	}

	public Set<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Set<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	public AreaVentas getAreaVentas() {
		return areaVentas;
	}

	public void setAreaVentas(AreaVentas areaVentas) {
		this.areaVentas = areaVentas;
	}

	public void modificarCliente() {
        // TODO implement here
    }

    public void bajaCliente() {
        // TODO implement here
    }

    public void recibirPedido() {
        // TODO implement here
    }

    public void recibirValor() {
        // TODO implement here
    }

}
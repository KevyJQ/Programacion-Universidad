package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import model.Clientes;

public interface HelloService extends Remote {

	// Metodos que pomos implmentar
	public String echo(String input) throws RemoteException;

	public void opcion(int opc) throws RemoteException;


}

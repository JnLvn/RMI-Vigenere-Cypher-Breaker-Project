package ie.gmit.sw;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
	public static void main(String[] args) throws Exception{
		
		VigenereBreaker vb = new VigenereBreakerImpl();
		//Start the RMI regstry on port 1099
		LocateRegistry.createRegistry(1099);
		//Bind our remote object to the registry with the human-readable name "cypher-service"
		Naming.bind("cypher-service", new VigenereBreakerImpl());
		
		//Print a message to let you know server is ready
		System.out.println("service started...");
		
	}
	
}

package ie.gmit.sw;

import java.rmi.Naming;

public class Client {
	
	
	public static void main(String[] args) throws Exception{
		/*
		 * This stuff needs to be in your tomcat app
		 */
		VigenereBreaker vb = (VigenereBreaker) Naming.lookup("rmi://localhost:1099/cypher-service");
		

		String result = vb.decrypt("JNOISRBNBCJKURBQVNWCJARJWRBV", 4);
		
		
		
				
		System.out.println(result);
	}
}

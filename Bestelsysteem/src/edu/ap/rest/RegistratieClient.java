package edu.ap.rest;

import org.restlet.resource.ClientResource;

import edu.ap.bestelsysteem.Registratie;

public class RegistratieClient {
	
	public static void main(String[] args) {
        
        try {
       	ClientResource resource = new ClientResource("http://127.0.0.1:8181/registraties/registratie");
       	// Post a new record
       	Registratie registratie = new Registratie("Isa Lambrechts", "Meistraat 3, 2000 Antwerpen", "02/08/2017", "Laptop Acer", 1);
       	Registratie registratie2 = new Registratie("Maddy", "Sportpleinstraat 30, 9130 Kieldrecht", "03/09/2017", "kattenmelk", 2);
       	resource.post(registratie.toString());
       	resource.post(registratie2.toString());
       	
       	// Write the response entity on the console
       	resource.get().write(System.out);
    	System.out.println();
       	
       }
       catch (Exception e) {
           
       }
   }

}

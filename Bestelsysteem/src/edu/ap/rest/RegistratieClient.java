package edu.ap.rest;

import org.restlet.resource.ClientResource;

import edu.ap.bestelsysteem.Registratie;

public class RegistratieClient {
	
	public static void main(String[] args) {
        
        try {
       	ClientResource resource = new ClientResource("http://127.0.0.1:8181/registraties/registratie");
       	// Post a new record
       	Registratie registratie = new Registratie("Isa Lambrechts", "Meistraat 3, 2000 Antwerpen", "02/08/2017", "Laptop Acer", 1);
       	Registratie registratie2 = new Registratie("Maddy", "Dorpstraat 30, 9130 Kieldrecht", "03/09/2017", "kattenmelk", 2);
       	Registratie registratie3 = new Registratie("Nicolas", "Meir 30, 2000 Antwerpen", "27/08/2017", "schoenen", 5);
       	Registratie registratie4 = new Registratie("Julie", "Meistraat 5 , 2000 Antwerpen", "01/09/2017", "voetbal", 1);
       	resource.post(registratie.toString());
       	resource.post(registratie2.toString());
       	resource.post(registratie3.toString());
       	resource.post(registratie4.toString());
       	
       	// Write the response entity on the console
       	resource.get().write(System.out);
    	System.out.println();
       	
       }
       catch (Exception e) {
           
       }
   }

}

package edu.ap.productbeheer;

import org.restlet.Component;
import org.restlet.data.Protocol;

public class ProductServer {
	
public static void main(String[] args) {
		
		try {
			// Create a new Component.
		    Component component = new Component();
	
		    // Add a new HTTP server listening on port 8181.
		    component.getServers().add(Protocol.HTTP, 8181);
	
		    // Attach the sample application.
		    component.getDefaultHost().attach("/products", ProductsResource.class);
		    component.getDefaultHost().attach("/products/{product_id}", ProductResource.class);
		    
			component.start();
		} 
	    catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

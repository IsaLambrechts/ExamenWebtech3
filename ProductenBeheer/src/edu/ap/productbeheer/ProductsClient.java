package edu.ap.productbeheer;

import org.restlet.resource.ClientResource;

public class ProductsClient {
	
	 public static void main(String[] args) {
         
         try {
        	ClientResource resource = new ClientResource("http://localhost:8080/ProductenBeheer/products");
        	// Post a Object
        	Product product = new Product("Whiskas", "Food&Co", "5.99");
    		resource.post(product);
    		// get the response
        	System.out.println(resource.getResponseEntity().getText());
        }
        catch (Exception e) {
            System.out.println("In main : " + e.getMessage());
        }
    }

}

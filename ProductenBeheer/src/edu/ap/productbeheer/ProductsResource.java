package edu.ap.productbeheer;

import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

public class ProductsResource extends ServerResource {
	
	@Get
	public String getAllProducts(){
		return "test";
	}
	
	@Post
	public void postProduct(){
		
	}

}

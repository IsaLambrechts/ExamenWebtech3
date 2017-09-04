package edu.ap.productbeheer;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class ProductResource extends ServerResource {
	
	@Get
	public String getProduct(){
		return "";
	}

}

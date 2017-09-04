package edu.ap.productbeheer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

public class ProductsResource extends ServerResource {
	
	@Get
	public String getAllProducts(){
		
		JSONParser parser = new JSONParser();

        Object obj;

        try {
          obj = parser.parse(new FileReader("C:\\Users\\CaruCath\\Documents\\GitHub\\ExamenWebtech3\\ProductenBeheer\\product.json"));
          JSONObject jsonObject = (JSONObject) obj;
          return obj.toString();

        } catch (Exception e) {
          return e.getMessage();
        }
		
	}
	
	@Post
	public void postProduct(){
		
	}

}

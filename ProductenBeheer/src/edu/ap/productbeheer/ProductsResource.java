package edu.ap.productbeheer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
	public void postProduct(Product product) throws IOException{
		
		// Create a new JSONObject
        JSONObject jsonObject = new JSONObject();

        // Add the values to the jsonObject
        jsonObject.put("naam", product.getNaam());
        jsonObject.put("producent", product.getProducent());
        jsonObject.put("prijs", product.getPrijs());

        // Create a new FileWriter object
        FileWriter fileWriter = new FileWriter("C:\\Users\\CaruCath\\Documents\\GitHub\\ExamenWebtech3\\ProductenBeheer\\product.json");

        // Writting the jsonObject into sample.json
        fileWriter.write(jsonObject.toJSONString());
        fileWriter.close();

        System.out.println("JSON Object Successfully written to the file!!");
	}

}

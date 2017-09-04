package edu.ap.rest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

public class RegistratieResource extends ServerResource {
	
	@Get("xml")
	public String getAlleRegistraties(){
		try {
			BufferedReader in = new BufferedReader(new FileReader("registratie.xml"));
			String line;
			String output = "";
			while((line = in.readLine()) != null)
			{
			    output += line + "\n";
			}
			in.close();
			return output;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}

	}
	
	@Post("xml")
	public void newRegistratie(String registratie){
		
		try (FileWriter fw = new FileWriter("registratie.xml", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.println(registratie);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}

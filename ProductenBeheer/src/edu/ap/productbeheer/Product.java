package edu.ap.productbeheer;

public class Product {
	private String naam;
	private String producent;
	private String prijs;
	
	public Product(String naam, String producent, String prijs) {
		this.setNaam(naam);
		this.setProducent(producent);
		this.setPrijs(prijs);
	}

	public String getProducent() {
		return producent;
	}

	public void setProducent(String producent) {
		this.producent = producent;
	}

	public String getNaam() {
		return naam;
	}

	private void setNaam(String naam) {
		this.naam = naam;
	}

	public String getPrijs() {
		return prijs;
	}

	private void setPrijs(String prijs) {
		this.prijs = prijs;
	}
	
	

}

package edu.ap.bestelsysteem;

public class Registratie {
	
	private String naam;
	private String adres;
	private String datum;
	private String productnaam;
	private int hoeveelheid;
	
	
	public Registratie(String klantnaam, String adres, String besteldatum, String productnaam, int hoeveelheid) {
		this.naam = klantnaam;
		this.adres = adres;
		this.datum = besteldatum;
		this.productnaam = productnaam;
		this.hoeveelheid = hoeveelheid;
		
	}

}

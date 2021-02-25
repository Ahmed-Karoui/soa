package tn.epsrit.entities;

public class User {
	
	private int cin;
	private String nom;
	private String prenom;
	private String Role;
	
	
	public User() {
	}


	public User(int cin, String nom, String prenom, String role) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		Role = role;
	}


	public int getCin() {
		return cin;
	}


	public void setCin(int cin) {
		this.cin = cin;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getRole() {
		return Role;
	}


	public void setRole(String role) {
		Role = role;
	}
	
	
}

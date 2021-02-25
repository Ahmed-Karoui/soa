package tn.epsrit.entities;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Favoris {
	
	private int cin;
	private String Ref;
	private String nom_User;
	private String book_Name;
	private Date add_Date;
	
	
	public Favoris() {
	}


	public Favoris(int cin, String ref, String nom_User, String book_Name, Date add_Date) {
		super();
		this.cin = cin;
		Ref = ref;
		this.nom_User = nom_User;
		this.book_Name = book_Name;
		this.add_Date = add_Date;
	}


	public int getCin() {
		return cin;
	}


	public void setCin(int cin) {
		this.cin = cin;
	}


	public String getRef() {
		return Ref;
	}


	public void setRef(String ref) {
		Ref = ref;
	}


	public String getNom_User() {
		return nom_User;
	}


	public void setNom_User(String nom_User) {
		this.nom_User = nom_User;
	}


	public String getBook_Name() {
		return book_Name;
	}


	public void setBook_Name(String book_Name) {
		this.book_Name = book_Name;
	}


	public Date getAdd_Date() {
		return add_Date;
	}


	public void setAdd_Date(Date add_Date) {
		this.add_Date = add_Date;
	}
	
	
	
}

package tn.epsrit.entities;

import java.util.Date;


public class Book {
	
	private String Ref;
	private String nom;
	private String Genre;
	private String Author;
	private Date First_Add;
	
	
	public Book() {
	}





	public Book(String ref, String nom, String genre, String author, Date first_Add) {
		super();
		Ref = ref;
		this.nom = nom;
		Genre = genre;
		Author = author;
		First_Add = first_Add;
	}
	
	





	public Book(String ref) {
		Ref = ref;
	}





	public String getRef() {
		return Ref;
	}


	public void setRef(String ref) {
		Ref = ref;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getGenre() {
		return Genre;
	}


	public void setGenre(String genre) {
		Genre = genre;
	}


	public String getAuthor() {
		return Author;
	}


	public void setAuthor(String author) {
		Author = author;
	}





	public Date getFirst_Add() {
		return First_Add;
	}


	public void setFirst_Add(Date first_Add) {
		First_Add = first_Add;
	}





	@Override
	public int hashCode() {
		return 1;
	}





	@Override
	public boolean equals(Object obj) {
		return Ref.equals(((Book)obj).getRef());
	}
	
	
	
	

}

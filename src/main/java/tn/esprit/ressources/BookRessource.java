package tn.esprit.ressources;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import tn.epsrit.entities.Book;

@Path("Book")
public class BookRessource implements IBookRessource{
	
	public static List<Book> books = new ArrayList<Book>();
	
	
//		books.add(new Book("test", "test", "test", "test",new Date()));
//	
	
	
	
	        
	@Override
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("addbook")
	public String addBook(Book book) {
		if(books.contains(book))
			return "this book already exists";
		else {
			books.add(book);
			return "add is succefful";
		}
	}

	@Override
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("updatebook")
	public String updateBook(Book book) {
			books.set(books.indexOf(book), book);
			return "update succefful !";
	}

	@Override
	@DELETE
	@Path("{id}")
	public boolean deleteBook(@PathParam(value="id") String Ref) {
		return books.remove(new Book(Ref));
	}

	@Override
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Book searchBook(@PathParam(value="id") String Ref) {
		return books.stream().filter(Book-> Book.equals(new Book(Ref))).findFirst().orElse(null);
	}

	@Override
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("getall")
	public List<Book> getAllEBook() {
		return books;
		
	}

	@Override
	public Book displayBook() {
		// TODO Auto-generated method stub
		return null;
	}

}

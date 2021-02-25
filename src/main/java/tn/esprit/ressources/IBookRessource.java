package tn.esprit.ressources;
import java.util.List;

import tn.epsrit.entities.Book;

public interface IBookRessource {
	
	public String addBook(Book book);
	
	public String updateBook(Book book);

	public boolean deleteBook(String Ref);

	public Book searchBook(String Ref);

	public List <Book> getAllEBook();
	
	public Book displayBook ();
	
	
	
	
	
	
	


}

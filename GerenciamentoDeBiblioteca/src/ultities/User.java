package ultities;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String name;
	private double number;
	private String email;
	private List<Book> borrowedBooks;
	
	
	
	
	public User(String name, double number, String email) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
		this.borrowedBooks = new ArrayList<>();
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getNumber() {
		return number;
	}




	public void setNumber(double number) {
		this.number = number;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public List<Book> getBorrowedBooks() {
		return borrowedBooks;
	}




	public void setBorrowedBooks(List<Book> borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}


	public String toString() {
		return "Nome: " + name + ", Numero: " 
	          + number +", Email: " + email;
	}
	
}

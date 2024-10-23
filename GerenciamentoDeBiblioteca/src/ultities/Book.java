package ultities;

public class Book {
	
	private String title;
	private String author;
	private int year;
	private boolean IsAvaible;
	
	
	
	
	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.IsAvaible = true;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getAuthor() {
		return author;
	}




	public void setAuthor(String author) {
		this.author = author;
	}




	public int getYer() {
		return year;
	}




	public void setYer(int yer) {
		this.year = yer;
	}




	public boolean isIsAvaible() {
		return IsAvaible;
	}




	public void setIsAvaible(boolean isAvaible) {
		IsAvaible = isAvaible;
	}
	
	@Override
	public String toString() {
		return " Livro: " + title +
			   ", Autor: " + author +
			   ", Ano: " + year;
		            
	}
	

}

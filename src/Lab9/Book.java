package Lab9;

public class Book extends LibraryItem implements LoanItem{
	//Variables
	private String author;
	private String title;
	private int numPages;
	
	//Constructor
	public Book (String author, String title, int numPages, String type, String ID) 
	{
		super(type , ID);
		this.author = author;
		this.title = title;
		this.numPages = numPages;
	}
	//Getters and setters
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String author) 
	{
		this.author = author;
	}
	public String getTitle() 
	{
		return title;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}
	public int getNumPages() 
	{
		return numPages;
	}
	public void setNumPages(int numPages)
	{
		this.numPages = numPages;
	}
	//toString method
	public String toString() 
	{
		return "Book [author=" + author + ", title=" + title + ", numPages=" + numPages + "]";
	}
	//calculatePrice method
	public double  calculatePrice() 
	{
		return 43.44;
	}

}
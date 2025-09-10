package library;

import utility.Date;

public class PaperBook extends Book{

	private int numberOfPages;
	private Date dateOfPublication;
	
	public PaperBook() {
		super();
		dateOfPublication=new Date(0,0,0000);
	}
	
	public PaperBook(String bookTitle, float bookPrice, int numberOfPages, int dd,int mm,int yy) {
		super(bookTitle,bookPrice);
		this.numberOfPages = numberOfPages;
		this.dateOfPublication = new Date(dd,mm,yy);
	}
	
	public void display() {
		super.display();
		System.out.println("Number of pages = "+numberOfPages);
		dateOfPublication.display();
	}
	
	
	
}

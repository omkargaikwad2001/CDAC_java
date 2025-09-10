package library;


public class EBook extends Book{
	
	private String url;
	private double size;
	
	public EBook() {
		super();
	}
	
	public EBook(String url,double size,String bookTitle, float bookPrice) {
		super(bookTitle,bookPrice);
		this.url = url;
		this.size = size;
	}
	
	public void display() {
		super.display();
		System.out.println("URL = "+url);
		System.out.println("Size = "+size);
	}

	
	
}

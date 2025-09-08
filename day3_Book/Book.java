public class Book{
	
	private int bookId;
	private String bookTitle;
	private float bookPrice;
	
	public static int count;
	
	static{
		count=0;
	}
	
	public Book(){
		count++;
		bookId=count;
		bookTitle="NA";
		bookPrice=0.0f;
		
	}

	public Book(String bookTitle){
		count++;
		this.bookId=count;
		this.bookTitle=bookTitle;
		
	}

	public Book(Book obj){
		count++;
		this.bookId=count;
		this.bookTitle=obj.bookTitle;
		this.bookPrice=obj.bookPrice;
	}

	public void setPrice(float price){
		this.bookPrice=price;
	}

	public void display(){
		System.out.println("Book Id = "+bookId);
		System.out.println("Book Title = "+bookTitle);
		System.out.println("Book Price = "+bookPrice);
		System.out.println();
	}

}
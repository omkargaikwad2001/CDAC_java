public class BookDemo{
	
	public static void main(String[] args){
		
		//default
		Book b1 = new Book();
		b1.display();

		//para
		Book b2 = new Book("JAVA");
		b2.setPrice(500.0f);
		b2.display();
	
		//copy
		Book b3 = new Book(b2);
		b3.display();
		
		Book b4 = new Book("CPP");
		b4.setPrice(200.0f);
		b4.display();
		
	}

}
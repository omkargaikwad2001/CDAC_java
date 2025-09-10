package app;

import library.Book;
import library.EBook;
import library.PaperBook;

public class Main {

	public static void main(String[] args) {
		
//		Book b = new Book("JAVA",500);
//		b.display();
		
//		PaperBook p1 = new PaperBook("JAVA",500,200,10,9,2025);
//		p1.display();
		
//		EBook e1 =new EBook("Book.com",135.23f,"JAVA",500.5f);
//		e1.display();
		
		Book b1 = new PaperBook("Cpp",500,200,10,9,2025);
		b1.display();
		
		System.out.println();
		
		Book b2 = new EBook("Book.com",135.23f,"JAVA",500.5f);
		b2.display();

	}

}

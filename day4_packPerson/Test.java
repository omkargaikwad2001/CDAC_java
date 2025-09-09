import utility.Date;
import utility.Person;
public class Test{
	
	public static void main(String[] args){
		
		Date d = new Date(4,5,2001);
		Person p = new Person("Omkar",24,d);
		
		d.display();
		p.display();
		
	}


}
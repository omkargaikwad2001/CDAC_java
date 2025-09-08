public class PersonDemo {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.display();
	
	Date obj = new Date(4,5,2001);
        Person p2 = new Person("Omkar", 25, obj);
        p2.display();

	Person p3 = new Person(p2);
	p3.display();

    }
}

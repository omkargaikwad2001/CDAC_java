package utility;
public class Person {

    private String name;
    private int age;
    private Date dob;

    // default constructor
    public Person() {
        name = "NA";
        age = 0;
        dob = new Date();
    }

    // parameterized constructor
    public Person(String name, int age, Date dob) {
        this.name = name;
        this.age = age;
        this.dob = new Date(dob);
    }

    //copy const
    public Person(Person obj){
	this.name=obj.name;
    	this.age=obj.age;
	this.dob= new Date(obj.dob);
    }	

    public void display() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        dob.display();
	System.out.println();
    }
}

package utility;

public class Student extends Person {
	
	private Course course;
	private String PRN;
	private transient int age;
	
	public Student() {
		super();
	}
	
	public Student(int courseId, String courseName, double fees, String PRN, int age, String name, int dd, int mm, int yy){
		super(name, dd, mm, yy);
		this.course = new Course(courseId,courseName,fees);
		this.PRN = PRN;
		this.age = age;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" +
			   "Student Details:\n" +
			   "PRN : " + PRN + "\n" +
			   "Age : " + age + "\n" +
			   course;
	}
}

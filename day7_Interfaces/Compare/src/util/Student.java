package util;

public class Student {
	
	private int rollnum;
	private String name;
	private int marks;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollnum, String name, int marks) {
		super();
		this.rollnum = rollnum;
		this.name = name;
		this.marks = marks;
	}
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}

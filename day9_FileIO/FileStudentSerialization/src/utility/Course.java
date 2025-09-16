package utility;

import java.io.Serializable;

public class Course implements Serializable {
	
	private int courseId;
	private String courseName;
	private double fees;
	
	public Course() {
		super();
	}

	public Course(int courseId, String courseName, double fees) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "\nCourse Details:\n" +
		       "Course ID   : " + courseId + "\n" +
		       "Course Name : " + courseName + "\n" +
		       "Fees        : " + fees + "\n";
	}
}

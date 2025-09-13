package util;

public class InvalidUserNameException extends Exception{

	String msg;
	
	public InvalidUserNameException() {
		msg="Invalid Name...";
	}
	
	public String getMessage() {
		return msg;
	}
	
}

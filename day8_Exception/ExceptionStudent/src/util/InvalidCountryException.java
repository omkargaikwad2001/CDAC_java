package util;

public class InvalidCountryException extends Exception{
	
	String msg;
	
	public InvalidCountryException() {
		msg="User outside india cannot register...";
	}

	@Override
	public String getMessage() {
		return msg;
	}

	
	
}

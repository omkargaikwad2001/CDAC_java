package util;

public class Password {
	
	private String password;
	
	public Password(String password) {
		
		if(password.length()>12) {
			throw new PasswordToLongException("The password is to long the length should btn 8 - 12");
		}
		else if(password.length()<8) {
			throw new PasswordToShortException("The password is to short the length should btn 8 - 12");
		}
		else {
			this.password=password;
		}
		
	}

	@Override
	public String toString() {
		return "Password [password=" + password + "]";
	}
	
}

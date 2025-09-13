package util;

public class UserRegistration {
	
	private String userName;
	private String userCountry;
		
	public UserRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRegistration(String userName, String userCountry) {
		super();
		this.userName = userName;
		this.userCountry = userCountry;
	}

	public void registerUser(String userName,String userCountry) throws InvalidCountryException{
		
		if(!(userCountry.toLowerCase()).equals("india")) {
			throw new InvalidCountryException(); 
		}else {
			System.out.println("User registration done successfully...");
		}
		
		
	}
	
}

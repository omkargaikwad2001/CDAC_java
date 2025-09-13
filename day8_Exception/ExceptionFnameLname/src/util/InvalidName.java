package util;

public class InvalidName {
    
    public void validateUserName(String fname, String lname) throws InvalidUserNameException {
        
        if(!isValid(fname) || !isValid(lname)) {
            throw new InvalidUserNameException();
        }

        System.out.println("Welcome " + fname + " " + lname);
    }

    // Helper method to check name rule
    private boolean isValid(String name) {
        if(name == null || name.isEmpty()) return false;
        if(!Character.isUpperCase(name.charAt(0))) return false;
        
        for(int i = 1; i < name.length(); i++) {
            if(!Character.isLowerCase(name.charAt(i))) return false;
        }
        return true;
    }
}

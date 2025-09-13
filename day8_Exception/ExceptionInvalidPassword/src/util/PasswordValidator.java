package util;

public class PasswordValidator {
    
    public static void checkPwd(String password) throws InvalidPwdException {
        
        if(password == null || password.isEmpty()) {
            throw new InvalidPwdException("Password cannot be empty.");
        }

        boolean hasUpper = false, hasDigit = false, hasSpecial = false;

        for(char ch : password.toCharArray()) {
            if(Character.isUpperCase(ch)) hasUpper = true;
            else if(Character.isDigit(ch)) hasDigit = true;
            else if(!Character.isLetterOrDigit(ch)) hasSpecial = true;
        }

        if(!(hasUpper && hasDigit && hasSpecial)) {
            throw new InvalidPwdException(
                "Password must contain at least one uppercase letter, one digit, and one special character."
            );
        }

        System.out.println("Password is valid!");
    }
}

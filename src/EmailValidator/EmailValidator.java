package EmailValidator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailValidator {
    public static boolean isValidEmail(String email) {
        // Regular expression for a valid email address
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z]+.com+$";		

        // Compile the regular expression
        Pattern pattern = Pattern.compile(regex);

        // Match the given email with the pattern
        Matcher matcher = pattern.matcher(email);

        // Return true if it matches the pattern, false otherwise
        return matcher.matches();
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean continuecheckEmail = true;
		
		
		while(continuecheckEmail) {
			
		
		System.out.println("Enter EmailID:: " );
		String email = sc.next();		//mail id must be like ganesh@ab.com
		
		
	    if (isValidEmail(email)) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }
   }
}}
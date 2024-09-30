package geek.java.string.programs;

import java.util.Scanner;

public class ExtractStringFromEmail {

	public static void main(String[] args) {
		/*
			Question: Input an email from the user. You have to create a username 
			from the email by deleting the part that comes after ‘@’. 
			Display that username to the user.
			Example : email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
			email = “helloWorld123@gmail.com”; username = “helloWorld123”

		*/
		
		System.out.print("Enter an Email: ");
		
		Scanner sc = new Scanner(System.in);
		String email = sc.next();

		String userName = "";

		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) != '@') {
				userName += email.charAt(i);
			} 
			else {
				break;
			}
		}

		System.out.println("Result: "+ userName);

		sc.close();
	}

}

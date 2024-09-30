package geek.java.string.programs;

import java.util.Scanner;

public class ReplaceLetterInOrginalString {

	public static void main(String[] args) {
		/*
			Question: Input a string from the user. Create a new string called 
			‘result’ in which you will replace the letter ‘e’ in the 
			 original string with letter ‘i’. 
			 Example : 
			 original = “eabcdef’ ; result = “iabcdif”
			 Original = “xyz” ; result = “xyz”

		*/
		
		System.out.print("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String userSring = sc.next();
		
		String result = " ";
		
		for(int i=0;i<userSring.length();i++) {
			result= userSring.replace('e','i');
		}
		
		System.out.println("Result: "+result);
		
		sc.close();
	}

}

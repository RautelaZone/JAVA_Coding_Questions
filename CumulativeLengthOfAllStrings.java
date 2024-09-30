package geek.java.string.programs;

import java.util.Scanner;

public class CumulativeLengthOfAllStrings {

	public static void main(String[] args) {
		/*
 			Question: Take an array of Strings input from the user & find the
  			cumulative(combined) length of all those strings.
 
		 */

		int cumulativeLength = 0;
		System.out.print("Enter the size of the array: ");

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		String[] arr = new String[size];

		System.out.println("Enter values of array: ");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.next();
			cumulativeLength += arr[i].length();
		}

		System.out.println("Cumulative length of all those strings: " + cumulativeLength);

		sc.close();
	}

}

package geek.java.common.programs;

import java.util.Scanner;

public class Factorial {

	public static void factorial(int n) {
		if (n < 0) {
			System.out.println("Invalid Number.");
		}
		int fact = 1;
		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.print("Factorial is: ");
		factorial(n);
	}

}

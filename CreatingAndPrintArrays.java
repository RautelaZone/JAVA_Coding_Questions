package geek.java.arrays.programs;

import java.util.Scanner;

public class CreatingAndPrintArrays {

	public static void main(String[] args) {

		System.out.println("Enter the size of the array: ");

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int[] numArray = new int[size];

		System.out.println("Enter the array elements: ");

		for (int i = 0; i < size; i++) {
			numArray[i] = sc.nextInt();
		}

		System.out.println("Arrays are:");

		for (int i = 0; i < size; i++) {
			System.out.print(numArray[i] + " ");
		}

		sc.close();
	}

}

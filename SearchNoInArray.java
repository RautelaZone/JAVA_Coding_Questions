package geek.java.arrays.programs;

import java.util.Scanner;

public class SearchNoInArray {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 1, 5, 7, 3, 8 };

		System.out.println("Enter the number you want to search in array: ");

		Scanner sc = new Scanner(System.in);
		int noToSearch = sc.nextInt();
		boolean flag = false;
		int i;
		sc.close();

		for (i = 0; i < arr.length; i++) {
			if (arr[i] == noToSearch) {
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("Index of " + noToSearch + " is: " + i);
		} else {
			System.out.println("Entered no " + noToSearch + " is not in the given array.");
		}

		
	}

}

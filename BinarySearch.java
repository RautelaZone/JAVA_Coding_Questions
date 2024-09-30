package geek.java.search.programs;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		/*
		 * Concept: Can be applied on sorted array only. Repeatedly dividing the search
		 * interval in half. YouTube: https://www.youtube.com/watch?v=7iE5xNOJET0&list=
		 * PLlhM4lkb2sEgrdfgTekidLWgTCvreR75X&index=2
		 */

		System.out.println("Enter the number you want to search in array: ");

		Scanner sc = new Scanner(System.in);
		int noToSearch = sc.nextInt();
		sc.close();

		int[] arr = { 1, 2, 4, 6, 7, 8, 10 };
		boolean flag = false;
		int temp = 0;

		int li = 0;
		int hi = arr.length - 1;
		int mi = (li + hi) / 2;

		while (li <= hi) {
			if (arr[mi] == noToSearch) {
				System.out.println("Element found at index: " + temp);
				flag = true;
				break;
			} else if (noToSearch > arr[mi]) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}		
		
		if(!flag) {
			System.out.println("Element Not Found.");
		}


	}
}

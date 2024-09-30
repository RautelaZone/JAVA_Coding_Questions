package geek.java.search.programs;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		/*
		  Concept: Sequential Search, one by one.
		  YouTube: https://www.youtube.com/watch?v=iGnrCiHPOCg&list=PLlhM4lkb2sEgrdfgTekidLWgTCvreR75X		  		
		 */
		
		System.out.println("Enter the number you want to search in array: ");

		Scanner sc = new Scanner(System.in);
		int noToSearch = sc.nextInt();
		sc.close();
		
		boolean flag = false;
		
		int[] arr = { 7, 8, 3, 1, 2 };
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==noToSearch) {
				System.out.println("Element found at index: "+i);
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("Element Not Found");
		}

	}

}

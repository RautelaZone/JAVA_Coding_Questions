package geek.java.common.programs;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int table = 0;
		sc.close();
		System.out.println("Table of "+n+" is: ");
		for (int i = 1; i <= 10; i++) {
			table = n*i;
			System.out.println(n+" x "+i+ " = "+ table);
		}

	}

}

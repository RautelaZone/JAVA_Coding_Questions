package geek.java.common.programs;

import java.util.Scanner;

public class CalculatorUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter first value.");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println("Please enter second value.");
		Scanner sc1 = new Scanner(System.in);
		int b = sc1.nextInt();
		
		System.out.println("Please enter an operation from +,-,* and /");
		Scanner sc2 = new Scanner(System.in);
		String operation = sc2.next();
		
		sc.close();
		sc1.close();
		sc2.close();
		
		switch(operation){
		case "+": System.out.println(a+b);
		break;
		
		case "-": System.out.println(a-b);
		break;
		
		case "*": System.out.println(a*b);
		break;
		
		case "/": System.out.println(a/b);
		break;
		
		default : System.out.println("Invalid Operation Selected...");
		}

	}

}

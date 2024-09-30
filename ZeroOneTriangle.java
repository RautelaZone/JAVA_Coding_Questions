package geek.java.patterns.programs;

public class ZeroOneTriangle {

	public static void main(String[] args) {
		/*
	       1
	       0 1
	       1 0 1
	       0 1 0 1
	       1 0 1 0 1	       
	       
		 */
		
		// Concept:  
		// YouTube: https://www.youtube.com/watch?v=GjHNGM7KN3w&list=PLfqMhTWNBTe0gqgFk-CUE-ktO5Cek1GdP&index=20
		
		int row = 5;
		
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {				
				if((i+j)%2==0) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}

	}

}

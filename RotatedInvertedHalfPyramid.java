package geek.java.patterns.programs;

public class RotatedInvertedHalfPyramid {

	public static void main(String[] args) {
		/*
		       *
		      **
		     *** 
		    ****
		     		  
		 */

		// Concept:
		// YouTube Link For Same:
		// https://www.youtube.com/watch?v=GjHNGM7KN3w&list=PLfqMhTWNBTe0gqgFk-CUE-ktO5Cek1GdP&index=20

		int row = 4;

		for(int i = 1;i <= row; i++) {
			for(int j = 1; j <= row-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}

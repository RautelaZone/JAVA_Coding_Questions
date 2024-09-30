package geek.java.patterns.programs;

public class InvertedHalfPyramid {

	public static void main(String[] args) {
		/*
		   *****
		   ****
		   *** 
		   **
		   * 		  
		 */

		// Concept:
		// YouTube Link For Same:
		// https://www.youtube.com/watch?v=GjHNGM7KN3w&list=PLfqMhTWNBTe0gqgFk-CUE-ktO5Cek1GdP&index=20

		int row = 5;
		int column = 5;

		for (int i = 1; i <= row; i++) {
			for (int j = column; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

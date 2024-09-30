package geek.java.patterns.programs;

public class HollowRectangle {

	public static void main(String[] args) {
		/*
	       *****
	       *   *
	       *   *
	       ***** 
		  
		 */
		
		// Concept: * is being printed when either i and j are initial i.e; 1 or max i.e' row for i and column for j
		// YouTube Link For Same: https://www.youtube.com/watch?v=GjHNGM7KN3w&list=PLfqMhTWNBTe0gqgFk-CUE-ktO5Cek1GdP&index=20

		int row = 4;
		int column = 5;

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if(i==1||j==1||i==row||j==column) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}

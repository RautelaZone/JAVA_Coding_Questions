package geek.java.patterns.programs;

public class FlyodTriangle {

	public static void main(String[] args) {
		/*
	       1
	       2 3
	       4 5 6
	       7 8 9 10
	       11 12 13 14 15 
	       
		 */
		
		// Concept:  
		// YouTube: https://www.youtube.com/watch?v=GjHNGM7KN3w&list=PLfqMhTWNBTe0gqgFk-CUE-ktO5Cek1GdP&index=20
		
		int row = 5;
		int counter = 1;
		
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {				
				System.out.print(counter+" ");
				counter++;
			}
			System.out.println();
		}

	}

}

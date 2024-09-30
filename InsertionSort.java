package geek.java.sorting.programs;

public class InsertionSort {

	public static void main(String[] args) {
		/*
		 
		  Concept: Like a card game, pick a card and place it to its correct position.
		  YouTube: https://www.youtube.com/watch?v=f-f50FjS_jA
		  
		 */
		
		int[] arr = { 7, 8, 3, 1, 2 };

		int temp, j;

		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i;

			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
		
		System.out.println("Arrays after Insertion Sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

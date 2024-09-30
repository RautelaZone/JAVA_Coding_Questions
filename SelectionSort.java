package geek.java.sorting.programs;

public class SelectionSort {

	public static void main(String[] args) {
		
		/*
		 Concept: Select the min and then swap
		 YouTube: https://www.youtube.com/watch?v=PkJIc5tBRUE&list=PLfqMhTWNBTe0gqgFk-CUE-ktO5Cek1GdP&index=9
		 Time Complexity: O(n^2)   
		 */
		 
		int[] arr = { 7, 8, 3, 1, 2 };

		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}

		System.out.println("Arrays after Selection Sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

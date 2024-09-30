package geek.java.sorting.programs;

public class BubbleSort {

	public static void main(String[] args) {
		
		/*
		 Concept: Compare adjacent elements and swap so that largest no
		 		  gets placed in last index.
		 YouTube: https://www.youtube.com/watch?v=v6hmmfIiKu4&list=PLlhM4lkb2sEgQ2nI2bsrKx5qIOAb7S7sc
		 Time Complexity: O(n^2)   
		 */
		 
		int[] arr = { 7, 8, 3, 1, 2 };
		boolean isSorted = true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSorted = false;	// watch YouTube for illustration
				}
			if(isSorted) {
				break;
			}
		}

		System.out.println("Arrays after Bubble Sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

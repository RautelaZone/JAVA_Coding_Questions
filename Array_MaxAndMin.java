package geek.java.arrays.programs;

public class MaxAndMin {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 1, 19, 5, 7, 3, 8 };

		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Max no is: " + max);
		System.out.println("Min no is: " + min);
	}

}

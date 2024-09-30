package geek.java.arrays.programs;

public class IsSortedArrayInAscOrDsc {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 7 };

		boolean isAscending = false;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				isAscending = true;
			}
			else {
				isAscending = false;
			}
		}
		if (isAscending) {
			System.out.println("Array is sorted in Ascendening Order.");
		} else {
			System.out.println("Array is not sorted in Ascendening Order.");
		}
	}

}

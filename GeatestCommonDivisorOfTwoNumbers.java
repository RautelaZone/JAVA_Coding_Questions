package geek.java.common.programs;

public class GeatestCommonDivisorOfTwoNumbers {

	public static void main(String[] args) {

		int n1 = 24;
		int n2 = 36;
		
//		while (n2 != 0) {
//            int temp = n2;
//            n2 = n1 % n2;
//            n1 = temp;
//        }
//		System.out.println("GCD is : " + n1);

		while (n1 != n2) {
			if (n1 > n2) {
				n1 = n1 - n2;
			} else {
				n2 = n2 - n1;
			}
		}
		System.out.println("GCD is : " + n2);

	}

}

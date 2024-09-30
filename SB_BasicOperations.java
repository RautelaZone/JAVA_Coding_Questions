package geek.java.stringbuilder.programs;

public class BasicOperations {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Tony");
		System.out.println(sb);
		
		System.out.println("--------- Set Operation ---------");
		sb.setCharAt(0,'H');
		System.out.println(sb);
		
		System.out.println("--------- Insert Operation ---------");
		sb.insert(0,'U');
		System.out.println(sb);
		
		System.out.println("--------- Delete Operation ---------");
		sb.delete(0, 1);
		System.out.println(sb);
		
		System.out.println("--------- Append Operation ---------");
		sb.append(" Kakkar");
		System.out.println(sb);
		
		System.out.println("--------- Length Operation ---------");
		System.out.println(sb.length());

	}

}

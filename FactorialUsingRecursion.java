package geek.java.common.programs;

public class FactorialUsingRecursion {
    int fact = 1;
    public int calFact(int no){
        if(no>1){
            fact = fact*no;
            calFact(no-1);
        }
        return fact;
    }

    public static void main(String[] args) {
        int no = 5;
        FactorialUsingRecursion obj = new FactorialUsingRecursion();
        int result = obj.calFact(no);
        System.out.println("Factorial of "+no+" is: "+ result);

    }
}

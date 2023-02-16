import java.util.Scanner;

public class Tester {
    public Tester(){
    }
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        System.out.println("Insert dividend: ");
        double i = in.nextDouble();

        System.out.println("Insert divisor: ");
        double j = in.nextDouble();

        if(j == 0) throw new Exception("Divisor can't be 0!!!");

        double quotient = i / j;
        System.out.println("Result: " + quotient);



    }
}

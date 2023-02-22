import java.util.Scanner;

public class Tester {
    public Tester(){
    }
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        while(true) {

            try {
                System.out.println("Insert dividend: ");
                int i = in.nextInt();

                System.out.println("Insert divisor: ");
                int j = in.nextInt();

                int result = i / j;

                System.out.println("Result: " + result);


            } catch (ArithmeticException e) {
                System.out.println("Divisor can't be 0!!!");
            }
        }



    }
}

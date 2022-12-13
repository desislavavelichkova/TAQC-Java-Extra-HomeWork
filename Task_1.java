import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        //1.Find the sum of all numbers from -5.5 to a with a step of h (the number a is entered from the keyboard).
        //Incoming data: a = -3, h = 0.5.
        //Output data: s = -25.5.

        Scanner s = new Scanner(System.in);
        System.out.print("a = ");
        double a = Double.parseDouble(s.next());
        System.out.print("h = ");
        double h = Double.parseDouble(s.next());

        double sum = 0;
        for (double i = -5.5; i <= a; i +=h) {
            sum += i;
        }
        System.out.println("s = "+sum);
    }
}

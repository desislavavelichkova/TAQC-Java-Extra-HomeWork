import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        // 3.Calculate the sum of 1! + 2! + 3! + ... + n !, n <10.
        //Incoming data: n = 3.
        //Output data: s = 9.

        Scanner s = new Scanner(System.in);
        System.out.print("n = ");
        int n = Integer.parseInt(s.next());
        getFactorial(n);
    }
    public static void getFactorial(int n){
        int fact = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            sum += fact;
        }
        System.out.println("s = " + sum);
    }
}

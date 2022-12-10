import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        //2.Processing the data while entering n integers from the keyboard, find their sum.
        //Incoming data: n = 5; 3, 6, 0, 2, 1.
        //Output data: s = 17.

        Scanner s = new Scanner(System.in);
        System.out.print("n = ");
        int n = Integer.parseInt(s.next());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Input number = ");
            int num = Integer.parseInt(s.next());
            sum += num;
        }
        System.out.println("s = "+sum);
    }
}

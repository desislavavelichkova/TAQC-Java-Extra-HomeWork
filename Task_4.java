import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        //4.Display the multiplication table by 7:
        //1 x 7 = 7;
        //2 x 7 = 14;
        //…
        //9 x 7 = 63.

        int number = 7;
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " x "+number+" = " + i*number);
        }

    }
}

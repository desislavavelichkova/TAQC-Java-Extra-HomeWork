import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        //5.A sequence of integers is entered from the keyboard.
        // Find the average value of all positive numbers
        // in the sequence until a number greater than the specified n is entered .

        Scanner s = new Scanner(System.in);
        System.out.print("Count of integers n = ");
        int n = Integer.parseInt(s.next());
        System.out.print("Write your number: ");
        int number = Integer.parseInt(s.next());
        int count = 0;
        int sum = 0;

        while (number <= n)
        {
            System.out.print("Write your number: ");
            if (number > 0){
                count++;
                sum += number;
            }
            number = Integer.parseInt(s.next());
        }

        double avg = (sum*0.1)/ (count*0.1);
        System.out.println("Average value: " + avg);
    }
}

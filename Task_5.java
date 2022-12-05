import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        //5.A sequence of integers is entered from the keyboard.
        // Find the average value of all positive numbers
        // in the sequence until a number greater than the specified n is entered .

        Scanner s = new Scanner(System.in);
        System.out.print("n = ");
        int n = Integer.parseInt(s.next());
        int number = Integer.parseInt(s.next());
        int count = 0;
        int sum = 0;

        while (true)
        {
            count ++;

            if (number < 0){
                count --;
            }
            else if (number > n){
                count--;
                break;
            }
            else if(number <= n && number >= 0){
                sum += number;
            }
            number = Integer.parseInt(s.next());
        }
        double avg = sum/count;
        System.out.println("Average value: " + avg);
    }
}

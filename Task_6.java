import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        //6.After starting training, the athlete ran n km on the first day.
        // On each of the following days, he increased the daily rate by 10% from the previous day's rate.
        // Determine: the number of days k 1 after the start of training, when the athlete will run more than 20 km per day;
        // the number of days k 2 after the start of training, when his total distance will be greater than 100 km.
        //Incoming data: n = 10.
        //Output data: k 1 = 9, k 2 = 8.

        Scanner s = new Scanner(System.in);
        System.out.print("n = ");
        double n = Double.parseDouble(s.next());
        int k1 = 2;
        int k2 = 2;
        double total = n;
        while (total < 100){
            n += n * 0.10;
            total += n;

            if (total < 100){
                k2++;
            }
            if (n < 20){
                k1++;
            }

        }
        System.out.println("k1= " + k1);
        System.out.println("k2= " + k2);
    }
}

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
        int k1 = 1; // the days, when the athlete will run more than 20 km per day;
        int k2 = 1; // days, when distance is lower than 100km
        double total = n;
        double lastDistace = 0;
        int day = 1;
        System.out.println("day #" + day + " today distance = "+ n + " total = " + total);
        while (total <= 100 ){
            day++;
            if (total <= 100){
                k2++;
            }
            if (n + lastDistace > 20){
                k1++;
            }
            double dayRate = n * 0.1;
            n = n + dayRate;
            total += n;
            lastDistace = n;
            System.out.println("day #" + day + " today distance = "+ (n + lastDistace) + " total = " + total);
        }
        if (n < 20)
        {
            k1++;
        }

        System.out.println("k1= " + k1);
        System.out.println("k2= " + k2);
    }
}

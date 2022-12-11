import java.util.Scanner;

public class Recurtion {
    public static void main(String[] args) {
        //1.Write a recursive function Sum to determine the sum of n numbers.
        //	Incoming data: n = 5 .
        //  Output data: Amount = 15 .
        Scanner s = new Scanner(System.in);
        System.out.print("Write the count of numbers to determine n = ");
        int n = Integer.parseInt(s.next());
        Sum(n);
    }
    public static void Sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        System.out.println("Amount = "+sum);
    }
}
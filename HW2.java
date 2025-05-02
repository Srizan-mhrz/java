// Create a method to convert a given number of days into years, months, and days
import java.util.Scanner;

public class HW2 {
    public static void convertDays(int days) {
        int years = days / 365;
        int months = (days % 365) / 30;
        int remainingDays = (days % 365) % 30;

        System.out.println(days + " days is approximately " + years + " years, " + months + " months, and " + remainingDays + " days.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int days = sc.nextInt();
        convertDays(days);
        sc.close();
    }
    
}

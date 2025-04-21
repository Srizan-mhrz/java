import java.util.Scanner;

public class task21 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number:");
        int num = sc.nextInt();
        int sum = 0;
        while (num != 0) {
            sum += num % 10; // Add the last digit to the sum
            num /= 10; // Remove the last digit from the number
        }
        System.out.println("The sum of digits is: " + sum);
        sc.close();
    }
    
}

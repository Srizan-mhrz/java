import java.util.Scanner;
public class task22 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number:");
        int num = sc.nextInt();
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10; // Build the reversed number
            num /= 10; // Remove the last digit from the number
        }
        System.out.println("The reversed number is: " + rev);
        sc.close();
    }
    
}

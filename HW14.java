// Write a method that returns the sum of squares of digits of a number
import java.util.Scanner;
public class HW14 {
    public static void sqSum(int n){
        int sum=0;
        while(n!=0){
            int dig=n%10;
            sum=sum+(dig*dig);
            n=n/10;
        }
        System.out.println("The sum of square of digit is :"+ sum);
        
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        sqSum(n);
        sc.close();
    }
}

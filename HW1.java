// Write a method to print all odd numbers from 1 to a given number n
import java.util.Scanner;
public class HW1 {
    public static void oddNum(int n)
    {
        
        for (int i=1 ; i<=n; i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        oddNum(n);
        sc.close();


    }
}
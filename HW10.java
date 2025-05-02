// Write a method to print all factors of a number
import java.util.Scanner;
public class HW10 {
    public static void fac(int n){
        System.out.println("The Factors of "+n+" are:");
        for(int i=1;i<=n;i++){
            if (n%i==0){
                System.out.print(i+",");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        fac(n);;
        sc.close();
    }
    
}

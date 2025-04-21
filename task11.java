import java.util.Scanner;
public class task11 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number:");
        int a = sc.nextInt();
        if (a%1==0 && a%a==0){
            System.out.println("number is prime");
        }
        else if (a%1==0 && a%a!=0){
            System.out.println("number is not prime");
        }
        else{
            System.out.println("number is not prime");
        }
        sc.close();
    }
    
}

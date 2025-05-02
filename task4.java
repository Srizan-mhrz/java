import java.util.Scanner;
public class task4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int a = sc.nextInt();
        if (a%5==0 && a%11==0){
         System.out.println("a is divisible by 5 and 11");
        }
         else if (a%5==0){
         System.out.println("a is divisible by 5 only");
        }
        else if (a%11==0){
        System.out.println("a is divisible by 11 only");
        }
        else {
        System.out.println("a is not divisible by 5 and 11");
        }
    sc.close();
 }
}
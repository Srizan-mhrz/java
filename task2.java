import java.util.Scanner;
public class task2 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("sum of two numbers is: "+(a+b));
        System.out.println("difference of two numbers is: "+(a-b)); 
        System.out.println("product of two numbers is: "+(a*b));
        System.out.println("division of two numbers is: "+(a/b));
        sc.close();
    }
    
                
}

import java.util.Scanner;
public class task6 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any number:");
        int a = sc.nextInt();
        if (a%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
        sc.close();

    }
    
}

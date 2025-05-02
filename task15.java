import java.util.Scanner;
public class task15 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number for the factorial:");
        int a = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=a;i++){
            fact = fact*i;
        }
        System.out.println("the factorial is"+fact);
        sc.close();
    }

    
}

import java.util.Scanner;
public class task20 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number:");
        int num = sc.nextInt();
        
        for (int i=1; i*i<=num; i++){
            if (i*i==num){
                System.out.println(num + " is a perfect square.");
                break;
            }
            if (i*i>num){
                System.out.println(num + " is not a perfect square.");
                break;
            }
            
        }
        sc.close();
    }
    
}

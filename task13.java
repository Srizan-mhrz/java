import java.util.Scanner;
public class task13 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int sum = 0;
           for(int i=1;i<=n;i++){
                sum= sum+i;
                               
            }
                System.out.println("the sum is"+sum);
                sc.close();
    
}
}

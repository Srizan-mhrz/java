import java.util.Scanner;
public class task22 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number:");
       int a= sc.nextInt();
       String s = Integer.toString(a);
         String sum = "";
         for (int i=s.length();i>=1;i--){
            Character c1= s.charAt(i-1);
        sum = sum + c1;
         }
         System.out.println(sum);
            sc.close();

    }
    
}

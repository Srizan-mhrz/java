import java.util.Scanner;
public class task11 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number:");
        int a = sc.nextInt();
        int k=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                k+=1;
            }
        }
        if (k==2){
            System.out.println("the number is prime");
        }else if (k==2){
            System.out.println("It is prime");
        }else if (k>2){
            System.out.println("It is composite");
        }
        
        sc.close();
    }
    
}

import java.util.Scanner;
public class task12 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("which multiplication table do you want to print?");
        int a = sc.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(a+"*"+i+"="+(a*i));
        }
        sc.close();

    }
    
}

import java.util.Scanner;
public class task10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year you want to check:");
        int year = sc.nextInt();
        if (year%4==0 && year%100!=0 || year%400==0)
        {
        System.out.println("year is leap year");
       }
        else {
        System.out.println("year is not leap year");
             }
        sc.close();
    }
    
}

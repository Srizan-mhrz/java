// Write a method to determine whether a number is a Harshad number or not

import java.util.Scanner;
public class HW3 {
    public static void harshad(int n){
        int ogNum=n;
        int digit=0,sum=0;
        while(n!=0){
            digit=n%10;
            sum+=digit;
            n=n/10;
        }
        if (ogNum%sum==0){
            System.out.println(ogNum+" is harshad number, as "+sum+"  is divisble by sum of digit");
        }else{
            System.out.println("Not a harshad number");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        harshad(n);
        sc.close();
    }
}

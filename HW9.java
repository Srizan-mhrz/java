// Create a method to find the sum of the first n natural numbers

import java.util.Scanner;

public class HW9 {
    public static int sumOfNaturalNo(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number n till where you want sum");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int ans=sumOfNaturalNo(n);
        System.out.println("sum of natural number till is "+ans);
    }
    
}

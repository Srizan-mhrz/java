// Write a method to check if a number is a Kaprekar number

import java.util.Scanner;
public class HW16 {
    public static void isKaprekar(int num) {
        boolean ans=false;

        int square = num * num;
        String squareStr = String.valueOf(square);
        int len = squareStr.length();
        for (int i = 0; i < len; i++) {
            String left = squareStr.substring(0, i);
            String right = squareStr.substring(i);

            int leftNum = (left.isEmpty()) ? 0 : Integer.parseInt(left);
            int rightNum = Integer.parseInt(right);

            if ((leftNum + rightNum) == num) {
                ans= true;
            }
        }
        if (num < 1){
            ans=false;
        } 
        if(ans){
            System.out.println(num + " is Kaprekar");
        }else{
            System.out.println("not kaprekar");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a number to find if it is krapekar");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        isKaprekar(n);
    }
}

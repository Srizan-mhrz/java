import java.util.Scanner;
public class task9 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter markd of 5 subjects:");
        int english = sc.nextInt();
        int nepali = sc.nextInt();
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int math = sc.nextInt();
        int total = english+nepali+physics+chemistry+math;
        float percentage = (total/500.0f)*100;
        System.out.println("total marks are: "+total);
        System.out.println("percentage is: "+percentage);
        if (percentage>=60){
            System.out.println("grade A");
        }
        else if (percentage>=50 && percentage<60){
            System.out.println("grade B");
        }
        else if (percentage>=40 && percentage<50){
            System.out.println("grade C");
        }
        else if (percentage>=33 && percentage<40){
            System.out.println("grade D");
        }
        else{
            System.out.println("grade F");
        }
        sc.close();
    }
    
}

import java.util.Scanner;
public class task5 {
public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter any three numbers:");
    int a = sc.nextInt();   
    int b = sc.nextInt();
    int c = sc.nextInt();
    if (a>b && a>c){
        System.out.println("a is largest number among a,b,c");
    }
    else if (b>a && b>c){
        System.out.println("b is largest number among a,b,c");
    }
    else if (c>a && c>b){
        System.out.println("c is largest number among a,b,c");
    }
    else{
        System.out.println("all numbers are equal");
    }
    sc.close();
    
}

    
}

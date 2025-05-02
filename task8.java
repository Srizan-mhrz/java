import java.util.Scanner;
public class task8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any alphabet");
        char ch = sc.next().charAt(0);
        if (ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
            System.out.println("it is vowel");
        }
        else if (ch >= 'a' && ch <= 'z'){
            System.out.println("it is consonant");
        }
        else {
            System.out.println("it is not alphabet");
        }
        sc.close();
    }
    
}

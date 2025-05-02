import java.util.Scanner;
public class task19 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any character:");
        char ch = Character.toLowerCase(sc.next().charAt(0));
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println(ch + " is a vowel.");
            break;
            
            default:
                System.out.println(ch + " is a consonant.");
        }
        sc.close();
    }
    
}

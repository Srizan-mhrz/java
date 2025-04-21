import java.util.Scanner;
// class ForLoop{
//         public static void main(String[]args){
//             // for(int i=1;i<=100;i++){
//             //     System.out.println(i);
//             // }
//             for(int a=1; a<11;a++){
//             for (int b=0; a>=b; b++){
//                 System.out.println(b);

//             }
//         }
             
            
//         }
// }

// class ForLoop{
//     public static void main(String[]args){
//        for(int i=1;i<=10;i++){
//         for(int j=1;j<=10;j++){
//             System.out.println(i+"*"+j+"="+(i*j));
//         }
//        } 
//     }
// }

// class ForLoop{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number");
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i=1;i<=n;i++){
//             sum= sum+i;
                       
//         }
//         System.out.println("the sum is"+sum);
//         sc.close();
//     }
// }


// class ForLoop{
//     public static void main(String[]args){
//         for(int i=1;i<=100;i++){
//             if (i%2==0){
//                 System.out.println(i);
//             }
//         }

//     }

// }

class ForLoop{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ente a string");
        String str= sc.next();
        int length= str.length();
        String rev ="";
        for(int i=length-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("the reverse string is:"+rev);
        
        sc.close();

    }
}
//IF ELSE STATEMENT
// import java.util.Scanner;

// public class week3 {
//     public static void main(String[] args) {
//         int a = 13;
//         int b = 5;
//         int c = 0;
//         if (a > b && a > c) {
//             System.out.println("a is the maximum number");
//         } else if (b > a && b > c) {
//             System.out.println("b is the maximum number");

//         } else {
//             System.out.println("c is the maximum number");
//         }

//     }
// }

// public class week3{
//     public static void main(String[] args){
//         int a=14;
//         if (a > 0){
//             System.out.println("a is positive numbet");

//         }
//         else if (a < 0){
//             System.out.println("a is negative number");

//         }
//         else {
//             System.out.println("a is zero");
//         }
//     }
// }

// public class week3 {
//     public static void main(String[]args){
//         int a=55;
//         if (a%5==0 && a%11==0){
//             System.out.println("a is divisible by 5 and 11");
//         }
//         else if (a%5==0){
//             System.out.println("a is divisible by 5 only");
//         }
//         else if (a%11==0){
//             System.out.println("a is divisible by 11 only");
//         }
//         else {
//             System.out.println("a is not divisible by 5 and 11");
//         }
//     }
// }

// public class week3 {
//     public static void main(String[] args){
//         int a=10;
//         if (a%2==0){
//             System.out.println("a is even number");
//         }
//         else {
//             System.out.println("a is odd number");
//         }
//     }
// }

// public class week3{
//     public static void main(String[]args){
//         int year=2000;
//         if (year%4==0 && year%100!=0 || year%400==0){
//             System.out.println("year is leap year");
//         }
//         else {
//             System.out.println("year is not leap year");
//         }
//     }
// }

// public class week3{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter any alphabet");
//         char ch = sc.next().charAt(0);
//         if (ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
//             System.out.println("it is vowel");
//         }
//         else if (ch >= 'a' && ch <= 'z'){
//             System.out.println("it is consonant");
//         }
//         else {
//             System.out.println("it is not alphabet");
//         }
//         sc.close();

//     }
// }
// SWITCH CASE STATEMENT
//  public class week3{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter 'A' 'B' 'C' 'D' OR 'F' for grade");
//         char grade = sc.next().charAt(0);
//         switch(grade){
//             case 'A':
//             System.out.println("your gpa id 4.0");
//             break;
//             case 'B':
//             System.out.println("your gpa is 3.0");
//             break;
//             case 'C':
//             System.out.println("your gpa is 2.0");
//             break;
//             case 'D':
//             System.out.println("your gpa is 1.0");
//             break;
//             case 'F':
//             System.out.println("your gpa is 0.0");
//             break;
//             default:
//             System.out.println("Invalid grade entered");
//             break;
            
//         }
//         sc.close();
//     }
    
//  }
// public class week3{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the first number:");
//         int a = sc.nextInt();
//         System.out.println("enter the second number:");
//         int b = sc.nextInt();
//         System.out.println("enter the operation(+,-,*,/):");
//         char op= sc.next().charAt(0);
//         switch (op){
//             case '+':
//             System.out.println("the sum of two numbers is:" + (a+b));
//             break;
//             case '-':
//             System.out.println("the difference of two numbers is:" + (a-b));
//             break;
//             case '*':
//             System.out.println("the product of two numbers is:" + (a*b));
//             break;
//             case '/':
//             if (b!=0){
//                 System.out.println("the division of two numbers is:" + (a/b));
//             }
//             else {
//                 System.out.println("division by zero is not allowed");
//             }
//             break;
//         }
//         sc.close();

//     }
// }
// public class week3{
//     public static void main(String[]args){
//         // int i=5;
//         // int sum = 6+ i++;
//         // System.out.println("sum is:" + sum);
//         // int k=5;
//         // int sum1 = 6 + ++k;
//         // System.out.println("sum1 is:" + sum1);
//         // int sum2 = 6+ i;
//         // System.out.println("sum1 is:" + sum2);

//         String name="my name";
//         String name1= new String("myname");
//         String name2=name+name1;
//         String name3= name.concat(name2);
//         char val=name.charAt(0);
//         System.out.println(name.length());
//         String value=name.substring(1,4);
//         System.out.println(value);
//         System.out.println(name.equals("my name"));
//         System.out.println(name.equalsIgnoreCase("My name"));
//         name.contains("Name");
//         name.startsWith("my");
//         name.endsWith("name");
//         name.indexOf("name");
//         name.lastIndexOf("name");
//         name.toLowerCase();
//         name.toUpperCase();
//         String val1= "Hello".trim();
//         name.replace("a","b");
//         String stringToSplit ="abc.def.ghi";
//         String[] seq=stringToSplit.split(".");
//         int number=1;
//         String numString=String.valueOf(number);


//     }
// }
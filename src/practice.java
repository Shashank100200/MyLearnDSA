import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


// convert all the upercase to lower and lower to upper
//public class practice {
//        public static void main(String[] args){
//                Scanner sc = new Scanner(System.in);
//
//                //taking input string
//                System.out.println("Enter the input :");
//                String inp = sc.next();
//
//                char[] array = inp.toCharArray();
//
//                for(int i=0;i<array.length;i++){
//                        char curr = array[i];
//                        if(Character.isUpperCase(curr)){
//                                array[i] = Character.toLowerCase(curr);
//                        }else if(Character.isLowerCase(curr)){
//                                array[i] = Character.toUpperCase(curr);
//                        }
//                }
//                System.out.println(new String(array));
//        }
//}

//public class practice{
//        public static void main(String[] args){
//                Scanner sc = new Scanner(System.in);
//                System.out.println("Enter inp :");
//
//                String inp = sc.next();
//                char[] array = inp.toCharArray();
//
//                Boolean isPalindrome = true;
//
//                for(int i=0;i<=array.length/2;i++){
//                        char curr = array[i];
//                        char curr2 = array[array.length-i-1];
//                                if(curr != curr2 ){
//                                        isPalindrome = false;
//                                        break;
//                                }
//                        }
//                if(isPalindrome){
//                        System.out.println("Palindrome");
//                }else{
//                        System.out.println("Not Palindrome");
//                }
//        }
//}

//Diagonal Differences
//import java.util.*;

//public class practice {
//
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        int t=in.nextInt();
//
//        while(t!=0){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//            int sum=a;
//            for(int j=0;j<n;j++){
//                sum+=b*Math.pow(2,j);
//                System.out.print(sum+" ");
//            }
//            System.out.println();
//            t--;
//        }
//        in.close();
//    }
//}

//1. Write a function to check if a number is prime.
//public class practice {
//    public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the numebr :");
//          int nu = sc.nextInt();
//
//          if(nu == 0 || nu == 1){
//            return;
//        }
//          boolean isPrime=true;
//          for(int i=2;i<nu;i++) {
//              if(nu%i==0){
//                  isPrime = false;
//              }
//          }
//              if(isPrime){
//                  System.out.println("prime");
//              }else{
//                  System.out.println("Not Prime");
//              }
//    }
//}

//2. Implement a function to find the factorial of a number.
//public class practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number :");
//        int num = sc.nextInt();
//
//        if (num == 0) {
//            return;
//        } else {
//            int fact = 1;
//            for (int i = 1; i <= num; i++) {
//                fact *= i;
//            }
//            System.out.println(fact);
//        }
//    }
//}

//3. Write a program to find the Fibonacci sequence up to a certain number of terms.
//public class practice {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number :");
//        int num = sc.nextInt();
//
//        if(num > 0){
//            int a=0,b=1,c;
//            System.out.print("Fibonacchi :"+a+","+b+",");
//            while(b<num){
//                c=a+b;
//                a=b;
//                b=c;
//                if(b<num){
//                    System.out.print(b+",");
//                }
//            }
//        }
//    }
//}

//4. Create a function to determine if a number is a palindrome.
//public class practice {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number :");
//        String num = sc.next();
//
//        char[] array=num.toCharArray();
//
//        boolean palindrom = true;
//        for(int i=0;i<=array.length/2;i++) {
//            char curr = array[i];
//            char cuur2 = array[array.length - i - 1];
//
//            if (curr != cuur2) {
//                palindrom = false;
//                break;
//            }
//        }
//            if(palindrom){
//                System.out.println("Palindrome");
//            }else{
//                System.out.println("Not Palindrome");
//            }
//        }
//    }

//5. Implement code to find the greatest common divisor (GCD) of two numbers.
public class practice{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a :");
        int a=sc.nextInt();
        System.out.println("Enter b :");
        int b=sc.nextInt();
        int i,j;
        int result = Math.min(a,b);
        if(result>0){
            for(i=result;i>=1;i--){
                if(a%i==0 && b%i==0){
                    System.out.println("HCF is :"+i);
                    break;
                }
            }
        }
    }
}
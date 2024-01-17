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
//public class practice{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a :");
//        int a=sc.nextInt();
//        System.out.println("Enter b :");
//        int b=sc.nextInt();
//        int i,j;
//        int result = Math.min(a,b);
//        if(result>0){
//            for(i=result;i>=1;i--){
//                if(a%i==0 && b%i==0){
//                    System.out.println("HCF is :"+i);
//                    break;
//                }
//            }
//        }
//    }
//}

import java.math.*;
//7. Create a program to check if a number is a perfect square.
//public class practice{
//    public static boolean perfectSquare(long num){
//        long root = (long)Math.sqrt(num);
//        return root*root == num;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number :");
//        long num = sc.nextLong();
//
//        if(perfectSquare(num)){
//            System.out.println("Is a Perfect Square");
//        }else{
//            System.out.println("Not a perfect square");
//        }
//    }
//}

//8. Implement a function to perform exponentiation without using the ** operator.
//public class practice {
//    public static int exp(int base,int pow){
//        int result=1;
//        for(int i=0;i<pow;i++){
//            result*=base;
//        }
//        return result;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter base :");
//        int base = sc.nextInt();
//        System.out.println("Enter exp :");
//        int pow = sc.nextInt();
//
//        System.out.println("The exponent of "+base+" "+"is :"+exp(base,pow));
//
////        System.out.println("Exponent of number is :"+Math.pow(a,b);
//    }
//}

//9. Write a program to convert a decimal number to binary.
//public class practice{
//    public static void BinaryToDecimal(int n){
//        int[] array = new int[1000];
//        int i=0;
//        while(n>0){
//            array[i]=n%2;
//            n=n/2;
//            i++;
//        }
//        for(int j=i-1;j>=0;j--){
//            System.out.print(array[j]+" ");
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number :");
//        int num = sc.nextInt();
//
//        BinaryToDecimal(num);
//    }
//}

//10. Create a function to convert a binary number to decimal.
public class practice{
    public static void BinaryToDecimal(String str){
        int deci_num = 0;
        int power = 0;
        int n = str.length();
        for(int i=n-1;i>=0;i--) {
            if (str.charAt(i) == '1') {
                deci_num += (int) Math.pow(2, power);
            }
            power++;
        }
        System.out.println(deci_num);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter binary number :");
        String str = sc.next();

        BinaryToDecimal(str);
    }
}






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
//public class practice{
//    public static void BinaryToDecimal(String str){
//        int deci_num = 0;
//        int power = 0;
//        int n = str.length();
//        for(int i=n-1;i>=0;i--) {
//            if (str.charAt(i) == '1') {
//                deci_num += (int) Math.pow(2, power);
//            }
//            power++;
//        }
//        System.out.println(deci_num);
//    }
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter binary number :");
//        String str = sc.next();
//
//        BinaryToDecimal(str);
//    }
//}

//OR
//public class practice{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the binary value :");
//        int num = sc.nextInt();
//
//        int base = 1;
//        int dec_val = 0;
//        while(num>0){
//            int last_num=num%10;
//            num=num/10;
//            dec_val=dec_val+last_num*base;
//            base=base*2;
//        }
//        System.out.print(dec_val);
//    }
//}

//11. Implement code to calculate the square root of a number.
//public class practice{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number :");
//        double num = sc.nextDouble();
//
//        System.out.println(Math.sqrt(num));
//    }
//}

//12. Write a function to generate the nth term of the geometric progression.
//13. Create a program to find the sum of digits of a given number.
//public class practice{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number :");
//        int num = sc.nextInt();
//
//        int sum=0;
//        while(num!=0){
//            sum+=num%10;
//            num=num/10;
//        }
//        System.out.println(sum);
//    }
//}

//14. Implement code to reverse a number.
//public class practice{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size :");
//        int size = sc.nextInt();
//
//        int[] array=new int[size];
//        for(int i=0;i<array.length;i++){
//            array[i] = sc.nextInt();
//        }
//        for(int j=array.length-1;j>=0;j--){
//            System.out.print(array[j]+" ");
//        }
//    }
//}

//OR
//public class practice{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number :");
//        int num = sc.nextInt();
//
//        int rev_num=0;
//        while(num>0){
//            rev_num=rev_num*10+num%10;
//            num=num/10;
//        }
//        System.out.println(rev_num);
//    }
//}

//15. Write a function to calculate the sum of natural numbers up to a given number
//public class practice {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number :");
//        int num = sc.nextInt();
//
//        int sum=0;
//        for(int i=1;i<=num;i++){
//            sum+=i;
//        }
//        System.out.print(sum);
//    }
//}

//17. Implement code to find the largest and smallest digit in a number.
//public class practice{
//    public static void main(String[] args){
//        int[] array={1,12,32,2,45,8};
//
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        for(int i=0;i<array.length;i++){
//            if(array[i] > max){
//                max = array[i];
//            }
//            if(array[i] < min){
//                min = array[i];
//            }
//        }
//        System.out.println("Max is :"+max);
//        System.out.println("Min is :"+min);
//    }
//}

//19. Create a program to find the next prime number after a given number.
//public class practice {
//    public static boolean prime(int num){
//        if(num <=1){
//            return false;
//        }
//        for(int i=2;i*i<=num;i++){
//            if(num%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static int nextPrime(int num){
//        int next = num + 1;
//        while(true){
//            if(prime(next)){
//                return next;
//            }
//            next++;
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number :");
//        int num = sc.nextInt();
//
//        System.out.println(nextPrime(num));
//    }
//}

//1 sum of each digit raised to the power of itself in a given number
//public class practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int num = sc.nextInt();
//
//        int originalNum = num;
//        int sum = 0;
//
//        while (num > 0) {
//            int digit = num % 10;
//            int power = digit;
//
//            if (power > 0) {
//                sum = sum + (int) Math.pow(digit, power);
//            }
//
//            num /= 10; // Update num by removing the last digit
//        }
//        System.out.println("The sum of digits raised to the power of themselves in " + originalNum + " is: " + sum);
//    }
//}

//2 check its armstrong
//public class practice {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number :");
//        int num = sc.nextInt();
//        int copyNum = num;
//        int exp = num%10;
//
//        int sum=0;
//        while(copyNum>0){
//            int digi = copyNum%10;
//            sum += Math.pow(digi,exp);
//            copyNum = copyNum/10;
//        }
//        if(sum == num){
//            System.out.println("Is an armstrong number");
//        }else{
//            System.out.println("Not an Armstrong number");
//        }
//    }
//}

// public class practice {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number :");
//         int num = sc.nextInt();
//
//         boolean isPrime = true;
//         for(int i=2;i<num;i++){
//             if(num%i==0){
//                 isPrime = false;
//             }
//         }
//         if(isPrime){
//             System.out.println("is prime");
//         }else{
//             System.out.println("not prime");
//         }
//     }
//}

//Write a program to find if a number is a power of 2 or not.
//Write a program to count the number of 1’s in a binary representation of the number.
//public class practice {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number :");
//        int num = sc.nextInt();
//
//        int count = 0;
//        while(num>0){
//            int rem = num%10;
//            if(rem==1){
//                count++;
//            }
//            num/=10;
//        }
//        System.out.println(count);
//    }
//}

public class practice {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 3, 7, 8};

        for (int i = 1; i <= array.length + 1; i++) {
            int j;
            for (j = 0; j < array.length; j++) {
                if (i == array[j]) {
                    break;
                }
            }
            if (j == array.length) {
                System.out.println(i);
            }
        }
    }
}
















//public class recusrsion {
//    public static void printNum(int n){
//        if(n == 0){
//            return;
//        }
//        System.out.println(n);
//        printNum(n-1);
//    }
//    public static void main(String[] args){
//        printNum(5);
//    }
//}

//public class recusrsion {
//    public static void printNum(int n){
//        if(n > 5){
//            return;
//        }
//        System.out.println(n);
//        printNum(n+1);
//    }
//    public static void main(String[] args){
//        printNum(1);
//    }
//}

//public class recusrsion {
//    public static void printNum(int i,int n,int sum){
//        if(i == n){
//            sum+=i;
//            System.out.println(sum);
//            return;
//        }
//        sum += i;
//        printNum(i+1,n,sum);
//    }
//    public static void main(String[] args){
//        printNum(1,5,0);
//    }
//}

//public class recusrsion {
//    public static void printNum(int n,int i,int fact){
//        if(i == n){
//            fact = fact*i;
//            System.out.println(fact);
//            return;
//        }
//        fact = fact*i;
//        printNum(n,i+1,fact);
//    }
//    public static void main(String[] args){
//        printNum(5,1,1);
//    }
//}

//public class recusrsion {
//    public static void printFib(int a,int b,int n){
//        if(n == 0){
//            return;
//        }
//       int c = a+b;
//       System.out.println(c);
//       printFib(b,c,n-1);
//    }
//    public static void main(String[] args){
//        int a = 0;
//        int b = 1;
//        System.out.println(a);
//        System.out.println(b);
//        int n = 8;
//        printFib(a,b,n-2);
//    }
//}

//public class recusrsion {
//    public static int calPow(int x,int n){
//        if(n == 0){
//            return 1;
//        }
//        if(x == 0){
//            return 0;
//        }
//       int pownm1 = calPow(x,n-1);
//       int pown = x * pownm1;
//       return pown;
//    }
//    public static void main(String[] args){
//        int x = 2,n = 5;
//        int inp = calPow(x,n);
//        System.out.println(inp);
//    }
//}

//1. Write a Java program to calculate the factorial of a number using recursion.
//public class recusrsion{
//    static int fact(int n){
//        if(n ==  0){
//            return 1;
//        }
//        int parans = fact(n-1);
//        return parans * n;
//    }
//    public static void main(String[] args){
//       int ans = fact(5);
//       System.out.println(ans);
//    }
//}

import java.util.Arrays;

//class Recursion1 {
//    public static void printFactorial(int a, int b, int n) {
//        if(n == 0) {
//            return;
//        }
//        System.out.println(a);
//        printFactorial(b, a+b, n-1);
//    }
//    public static void main(String args[]) {
//        printFactorial(0, 1, 5);
//    }
//}


//program to find sum of n number
//public class recusrsion {
//    static int sumOfn(int n){
//        if(n == 1){
//            return 1;
//        }
//        int sum = sumOfn(n-1);
//        return n + sum;
//    }
//
//    public static void main(String[] args) {
//        int ans = sumOfn(5);
//        System.out.println(ans);
//    }
//}

//2. Implement a recursive function to find the nth Fibonacci number.
//public class recusrsion {
//    static int fib(int n){
//        if(n == 1){
//            return 1;
//        }
//        if(n == 2){
//            return 1;
//        }
//        int fibans1 = fib(n-1);
//        int fibans2 = fib(n-2);
//        return fibans1 + fibans2;
//    }
//
//    public static void main(String[] args) {
//        int ans = fib(5);
//        System.out.println(ans);
//    }
//}

//6. Implement a recursive function to calculate the power of a number.
//public class recusrsion {
//    static int power(int x, int n){
//        if( x == 0){
//            return 0;
//        }
//        if(n == 0){
//            return 1;
//        }
//        int ans1 = power(x,n-1);
//        return x * ans1;
//    }
//
//    public static void main(String[] args) {
//        int ans = power(2,3);
//        System.out.println(ans);
//    }
//}


//public class recusrsion {
//    static int power(int x,int n){
//        if(x == 0){
//            return 0;
//        }
//        if(n == 0){
//            return 1;
//        }
//        int temp = power(x,n/2);
//        if(n%2 == 1){
//            return temp*temp*x;
//        }
//        return temp*temp;
//    }
//
//    public static void main(String[] args) {
//        int ans = power(2,5);
//        System.out.println(ans);
//    }
//}

//8. Implement a recursive function to check if a given string is a palindrome.
//public class recusrsion {
//    static boolean isPalindrome(String str){
//        if(str.length() == 0 || str.length() == 1){
//            return true;
//        }
//        if(str.charAt(0) == str.charAt(str.length()-1)){
//            return isPalindrome(str.substring(1,str.length()-1));
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        String str1 = "malayalam";
//        System.out.println(isPalindrome(str1));
//    }
//}

//Recursion function to reverse an array
//public class recusrsion {
//    public static void arrayHelper(int[] arr){
//        reverseArray(arr,0,arr.length-1);
//    }
//    public static void reverseArray(int[] arr,int start,int end){
//        if (start >= end) {
//            return;
//        }
//        int temp = arr[start];
//        arr[start] = arr[end];
//        arr[end] = temp;
//        reverseArray(arr,start+1,end-1);
//    }
//
//    public static void main(String[] args) {
//        int[] array={1,2,3,4,5};
//        arrayHelper(array);
//        System.out.println(java.util.Arrays.toString(array));
//    }
//}

//7. Write a program to reverse a number using recursion.
//public class recusrsion {
//    static int revNum(int num,int reversed){
//        if(num == 0){
//            return reversed;
//        }
//        int digi = num%10;
//        num /=10;
//        reversed=reversed*10+digi;
//        return revNum(num,reversed);
//    }
//
//    public static void main(String[] args){
//        int num = 1234;
//        int reversed = 0;
//        System.out.println(revNum(num,reversed));
//    }
//}

//7. Write a program to reverse a string using recursion.
public class recusrsion {
    static void rev(String str,int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        rev(str,idx-1);
    }

    public static void main(String[] args) {
        String str = "reva";
        rev(str,str.length()-1);
    }
}

//Tower of Hanoi
//public class recusrsion {
//    static void TowerOfHanoi(int n,String src,String helper,String dest){
//        if(n == 1){
//            System.out.println("Disk "+ n + " transferd from "+src+" to "+dest);
//            return;
//        }
//        TowerOfHanoi(n-1,src,dest,helper);
//        System.out.println("Disk "+ n + " transferd from "+src+" to "+dest);
//        TowerOfHanoi(n-1,helper,src,dest);
//    }
//
//    public static void main(String[] args) {
//        int n = 3;
//        TowerOfHanoi(n,"A","B","C");
//    }
//}












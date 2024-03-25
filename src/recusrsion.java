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
import java.util.HashSet;

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
//public class recusrsion {
//    static void rev(String str,int idx){
//        if(idx == 0){
//            System.out.println(str.charAt(idx));
//            return;
//        }
//        System.out.print(str.charAt(idx));
//        rev(str,idx-1);
//    }
//
//    public static void main(String[] args) {
//        String str = "reva";
//        rev(str,str.length()-1);
//    }
//}

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

//3. Write a recursive method to calculate the sum of digits of a given number.
//public class recusrsion {
//    static int sumOfDig(int n,int sum){
//        if(n == 0){
//            return sum;
//        }
//        int digi = n%10;
//        n = n/10;
//        sum = sum + digi;
//        return sumOfDig(n,sum);
//    }
//
//    public static void main(String[] args) {
//        int num = 1234;
//        System.out.println(sumOfDig(num,0));
//    }
//}

//write a program to find first and last position of the element
//public class recusrsion {
//    public static int first = -1;
//    public static int last = -1;
//
//    public static void findPos(String str,int idx,char ele){
//        if(idx == str.length()){
//            System.out.println(first);
//            System.out.println(last);
//            return;
//        }
//        char currChar = str.charAt(idx);
//        if(currChar == ele){
//            if(first == -1){
//                first = idx;
//            }
//            else{
//                last = idx;
//            }
//        }
//        findPos(str,idx + 1,ele);
//    }
//
//    public static void main(String[] args) {
//        String str = "abbaskjnaksjaskadf";
//        findPos(str,0,'a');
//    }
//}

//check array is arranged or not
//public class recusrsion {
//    public static void arrayhelper(int[] arr,int idx){
//        boolean ans = isArranged(arr,0);
//        System.out.println("isArranged :"+ans);
//    }
//    public static boolean isArranged(int[] arr,int idx){
//        if(idx > arr.length-1){
//            return true;
//        }
//        if(arr[idx] > arr[idx+1]){
//            return false;
//        }
//        return isArranged(arr,idx+1);
//    }
//
//    public static void main(String[] args) {
//        int[] array = {1,2,3,2,5};
//        arrayhelper(array,0);
//    }
//}

//public class recusrsion {
//    public static boolean isArranged(int[] arr,int idx){
//        if(idx > arr.length-1){
//            return false;
//        }
//        if(arr[idx] < arr[idx+1]){
//            return true;
//        }
//        return isArranged(arr,idx+1);
//    }
//
//    public static void main(String[] args) {
//        int[] array = {1,2,3,4,5};
//        isArranged(array,0);
//    }
//}

//public class recusrsion {
//    public static int[] kthOccurrence(int X, int[] arr, int[] query_values) {
//        int[] result = new int[query_values.length];
//        Arrays.fill(result, -1);
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == X) {
//                for (int j = 0; j < query_values.length; j++) {
//                    if (query_values[j] > 0) {
//                        query_values[j]--;
//                        if (query_values[j] == 0) {
//                            result[j] = i + 1; // 1-based index
//                        }
//                    }
//                }
//            }
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 20, 8, 8, 1, 2, 5, 8, 0};
//        int X = 8;
//        int[] query_values = {100, 4, 2};
//        int[] result = kthOccurrence(X, arr, query_values);
//        for (int i : result) {
//            System.out.print(i + " ");
//        }
//        // Output: -1 -1 5
//    }
//}

//check weather the given array is strictly sorted
//public class recusrsion {
//    public static boolean isSorted(int array[],int idx){
//        if(idx == array.length-1){
//            return true;
//        }
//        if(array[idx] <= array[idx+1]){
//            return isSorted(array,idx+1);
//        }else{
//            return false;
//        }
//    }
//
//    public static void main(String[] args) {
//        int array[] = {1,2,3,4};
//        System.out.println(isSorted(array,0));
//    }
//}

//public class recusrsion {
//    public static void moveX(String str,int idx,int count,String newStr){
//        if(idx == str.length()){
//            for(int i=0;i<=count;i++){
//                newStr += 'x';
//            }
//            System.out.println(newStr);
//            return;
//        }
//        char currChar = str.charAt(idx);
//        if(currChar == 'x'){
//            count++;
//            moveX(str,idx+1,count,newStr);
//        }else{
//            newStr += currChar;
//            moveX(str,idx+1,count,newStr);
//        }
//    }
//
//    public static void main(String[] args) {
//        String str = "abxbdxxc";
//        moveX(str,0,0,"");
//    }
//}

//to remove duplicates in a String
//public class recusrsion {
//    public static boolean[] map = new boolean[26];
//
//    public static void moveDup(String str,int idx,String newStr){
//        if(idx == str.length()){
//            System.out.println(newStr);
//            return;
//        }
//        char currChar = str.charAt(idx);
//        if(map[currChar - 'a']){
//            moveDup(str,idx+1,newStr);
//        }else{
//            newStr += currChar;
//            map[currChar - 'a'] = true;
//            moveDup(str,idx+1,newStr);                        //O(n)
//        }
//    }
//
//    public static void main(String[] args) {
//        String str = "aabccda";
//        moveDup(str,0,"");
//    }
//}


//to print subsequence of a string     its like number of possibilities of a given string
//public class recusrsion {
//    public static void subsequence(String str,int idx,String newStr){
//        if(idx == str.length()){
//            System.out.println(newStr);
//            return;
//        }
//        //the number which likes to print as a subsequence
//        char currChar = str.charAt(idx);
//        subsequence(str,idx+1,newStr+currChar);   // to revice this watch 18th lecture at 1:15:00
//
//        //the number which not likes to print as a subsquence
//        subsequence(str,idx+1,newStr);
//    }
//
//    public static void main(String[] args) {
//        String str = "abc";
//        subsequence(str,0,"");                 //TC = O(2^n)
//    }
//}

//to print unique subsequence of a string
public class recusrsion {
    public static void uniSubSeque(String str, int idx, String newStr, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newStr)){
                return;
            }else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(idx);
        uniSubSeque(str,idx+1,newStr+currChar,set);

        uniSubSeque(str,idx+1,newStr,set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();  //HashSet is like collections of unique elements and duplicate elements will not be there
        uniSubSeque(str,0,"",set);
    }
}




















import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
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
//        int fibo = fib(n-1) + fib(n-2);
//        return fibo;
//    }
//
//    public static void main(String[] args) {
//        int ans = fib(6);
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
//        int num = -1234;
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
//public class recusrsion {
//    public static void uniSubSeque(String str, int idx, String newStr, HashSet<String> set){
//        if(idx == str.length()){
//            if(set.contains(newStr)){
//                return;
//            }else{
//                System.out.println(newStr);
//                set.add(newStr);
//                return;
//            }
//        }
//        char currChar = str.charAt(idx);
//        uniSubSeque(str,idx+1,newStr+currChar,set);
//
//        uniSubSeque(str,idx+1,newStr,set);
//    }
//
//    public static void main(String[] args) {
//        String str = "aaa";
//        HashSet<String> set = new HashSet<>();  //HashSet is like collections of unique elements and duplicate elements will not be there
//        uniSubSeque(str,0,"",set);
//    }
//}

//to print possible combination of keypad numbers
//public class recusrsion {
//    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
//
//    public static void printCombi(String str,int idx,String combination){
//        if(idx == str.length()){
//            System.out.println(combination);
//            return;
//        }
//        char currChar = str.charAt(idx);
//        String mapping = keypad[currChar - '0'];
//
//        for(int i=0;i<mapping.length();i++){
//            printCombi(str,idx+1,combination+mapping.charAt(i));
//        }
//    }
//
//    public static void main(String[] args) {
//        String str = "23";
//        printCombi(str,0,"");                 //O(3^n)
//    }
//}

//to find permutation of a given string
//public class recusrsion {
//    public static void permu(String str,String permutation){
//        if(str.length() == 0){
//            System.out.println(permutation);
//            return;
//        }
//        for(int i=0;i<str.length();i++){
//            char currChar = str.charAt(i);
//            String newStr = str.substring(0,i) + str.substring(i+1);
//            permu(newStr,permutation+currChar);
//        }
//    }
//
//    public static void main(String[] args) {
//        String str = "abc";
//        permu(str,"");
//    }
//}

//Counting of paths in given matrix
//public class recusrsion {
//    public static int calPath(int i,int j,int m,int n){
//        if(i == m || j == n){
//            return 0;
//        }
//        if(i == m-1 && j == n-1){
//            return 1;
//        }
//        int downPath = calPath(i+1,j,m,n);
//
//        int rightPath = calPath(i,j+1,m,n);
//
//        return downPath+rightPath;
//    }
//
//    public static void main(String[] args) {
//        int m = 3;
//        int n = 3;
//        int ans = calPath(0,0,m,n);
//        System.out.println(ans);
//    }
//}

//permutation of given string
//public class recusrsion {
//    public static void printPermu(String str,String permu){
//        if(str.length() == 0){
//            System.out.println(permu);
//            return;
//        }
//
//        for(int i=0;i<str.length();i++){
//            char currChar = str.charAt(i);
//            String newStr = str.substring(0,i) + str.substring(i+1);  //not to repeate current charecter we used this
//            printPermu(newStr,permu+currChar);
//        }
//    }
//    public static void main(String[] args) {
//        String str = "ABC";
//        printPermu(str,"");              //O(n*n!)
//    }
//}

//Write a recursive method to calculate the sum of digits of a given number.
//public class recusrsion {
//    public static int calSum(int n){
//        if(n  == 0){
//            return 0;
//        }
//        return (n % 10 + calSum(n/10));
//    }
//
//    public static void main(String[] args) {
//        int ans = calSum(123456);
//        System.out.println(ans);
//    }
//}

//Write a Java program to find the GCD (Greatest Common Divisor) of two numbers using recursion.
//public class recusrsion {
//    public static int gcd(int a,int b){
//        if(a%b == 0){
//            return b;
//        }else{
//            return gcd(b,a%b);
//        }
//    }
//
//    public static void main(String[] args) {
//        int a = 12;
//        int b = 28;
//        int ans = gcd(a,b);
//        System.out.println(ans);
//    }
//}

//Implement a recursive function to calculate the power of a number
//public class recusrsion {
//    public static int exp(int base,int pow){
//        if(pow == 0){
//            return 1;
//        }
//        int result = 1;
//        result = base * exp(base,pow-1);
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int ans = exp(3,3);
//        System.out.println(ans);
//    }
//}

//Write a program to reverse a string using recursion
//public class recusrsion {
//    public static String StrRev(String wrd,int idx){
//        if(idx >= wrd.length()){
//            return "";
//        }
//        char ch = wrd.charAt(idx);
//        String newStr = StrRev(wrd,idx+1);
//        return newStr+ch;
//    }
//
//    public static void main(String[] args) {
//        String wrd = "reva";
//        String ans = StrRev(wrd,0);
//        System.out.println(ans);
//        }
//    }
//}

//Implement a recursive function to check if a given string is a palindrome
//public class recusrsion {
//    public static String StrRev(String wrd,int idx){
//        if(idx >= wrd.length()){
//            return "";
//        }
//        char ch = wrd.charAt(idx);
//        String newStr = StrRev(wrd,idx+1);
//        return newStr+ch;
//    }
//
//    public static void main(String[] args) {
//        String wrd = "reva";
//        String ans = StrRev(wrd,0);
////        System.out.println(ans);
//        if(ans.equals(wrd)){
//            System.out.println("Palindrome");
//        }else{
//            System.out.println("Not a palindrome");
//        }
//    }
//}

//Write a recursive function to find the sum of elements in an array.
//public class recusrsion {
//    public static int ArrSum(int[] arr,int idx){
//        if(arr.length == idx){
//            return 0;
//        }
//        int curr = arr[idx];
//        int sum = ArrSum(arr,idx+1);
//        return curr+sum;
//    }
//
//    public static void main(String[] args) {
//        int[] array = {1,2,3,4};
//        int ans = ArrSum(array,0);
//        System.out.println(ans);
//    }
//}

//11. Write a Java program to print the elements of an array using recursion.
//public class recusrsion {
//    public static void eleArr(int array[],int idx){
//        if(array.length == idx){
//            return;
//        }
//        System.out.println(array[idx]);
//        eleArr(array,idx+1);
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4};
//        eleArr(arr,0);
//    }
//}

//12. Implement a recursive function to find the maximum element in an array.
//public class recusrsion {
//    public static int maxEle(int array[],int idx){
//        if(array.length-1 == idx){
//            return array[idx];
//        }
//        int max = maxEle(array,idx+1);
//        if(array[idx] > max){
//            return array[idx];
//        }else{
//            return max;
//        }
//    }
//    public static void main(String[] args) {
//        int arr[] = {10,2,32,4};
//        int ans = maxEle(arr,0);
//        System.out.println(ans);
//    }
//}

//13. Write a program to find the factorial of a number using tail recursion.
//public class recusrsion{
//    static int fact(int n){
//        if(n ==  0){
//            return 1;
//        }
//        return fact(n-1) * n;
//    }
//    public static void main(String[] args){
//       int ans = fact(5);
//       System.out.println(ans);
//    }
//}

//14. Implement a recursive function to check if a given number is prime
//public class recusrsion {
//    public static boolean isPrime(int n,int i){
//        if(n == 1){
//            return false;
//        }
//        if(n ==2){
//            return true;
//        }
//        if(n%i == 0){
//            return false;
//        }
//        if(i*i > n){
//            return true;
//        }
//        return isPrime(n,i+1);
//    }
//    public static void main(String[] args) {
//        int num = 12;
//        if (isPrime(num,2)){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }
//    }
//}

//public class recusrsion {
//    public static boolean pow(int n){
//        if(n == 1 || n == 3){
//            return true;
//        }
//        if(n%3 != 0 || n == 0){
//            return false;
//        }
//        return pow(n/3);
//    }
//
//    public static void main(String[] args) {
//        int num=27;
//        if(pow(num)){
//            System.out.println("True");
//        }else{
//            System.out.println("False");
//        }
//    }
//}

//total count of path in given matrix
//public class recusrsion {
//    public static int countPaths(int i,int j,int m,int n){
//        if(i == m-1 || j == n-1){
//            return 1;
//        }
//        if(i == m || j == n){
//            return 0;
//        }
//        //down count
//        int downStep = countPaths(i+1,j,m,n);
//
//        //right count
//        int rightStep = countPaths(i,j+1,m,n);
//
//        return downStep+rightStep;
//    }
//
//    public static void main(String[] args) {
//        int totalPaths = countPaths(0,0,4,4);
//        System.out.println(totalPaths);
//    }
//}

//Placing tiles of size 1*m in floor of size n*m
//public class recusrsion {
//    public static int tilesWays(int n,int m){
//        if(n == m){
//            return 2;
//        }
//        if(n < m){
//            return 1;
//        }
//        int vertical = tilesWays(n-m,m);
//        int horrizontel = tilesWays(n-1,m);
//        return vertical + horrizontel;
//    }
//    public static void main(String[] args) {
//        System.out.println(tilesWays(4,2));
//    }
//}

//Total number of ways to invite people to party
//public class recusrsion {
//    public static int inviteWays(int n){
//        if(n <= 1){
//            return 1;
//        }
//        int way1 = inviteWays(n-1);
//        int way2 = (n-1) * inviteWays(n-2);
//
//        return way1 + way2;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(inviteWays(4));
//    }
//}

//public class recusrsion {
//    public static int searchEle(int[] array,int idx,int ele){
//        if(idx >= array.length){
//            return -1;
//        }
//        if(array[idx] == ele){
//            return idx;
//        }
//        return searchEle(array,idx+1,ele);
//    }
//
//    public static void main(String[] args) {
//        int[] array = {1,2,3,4,5};
//        int ans = searchEle(array,0,6);
//        System.out.println(ans);
//    }
//}

//public class recusrsion {
//    public static int digiSum(int n,int sum){
//        if(n == 0){
//            return sum;
//        }
//        return digiSum(n/10,sum+(n%10));
//    }
//    public static void main(String[] args) {
//        System.out.println(digiSum(12356,0));
//    }
//}


//public class recusrsion {
//    public static int fact(int n){
//        if(n == 0){
//            return 1;
//        }
//        int ans = n * fact(n-1);
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(fact(5));
//    }
//}


























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

public class practice{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter inp :");

                String inp = sc.next();
                char[] array = inp.toCharArray();

                Boolean isPalindrome = true;

                for(int i=0;i<=array.length/2;i++){
                        char curr = array[i];
                        char curr2 = array[array.length-i-1];
                                if(curr != curr2 ){
                                        isPalindrome = false;
                                        break;
                                }
                        }
                if(isPalindrome){
                        System.out.println("Palindrome");
                }else{
                        System.out.println("Not Palindrome");
                }
        }
}

//public class PalindromeCheck {
//
//    public static boolean isPalindrome(String s) {
//        int left = 0;
//        int right = s.length() - 1;
//
//        while (left < right) {
//            if (s.charAt(left) != s.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        String inputStr = "abba";
//
//        boolean result = isPalindrome(inputStr);
//
//        System.out.println(result);
//    }
//}

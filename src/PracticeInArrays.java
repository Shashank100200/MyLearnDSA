import java.util.*;
//1. Write an algorithm to find the sum of all elements in an array.
//public class PracticeInArrays {
//    public static void main(String[] args){
//        int[] array={1,3,5,7,9};
//
//        int sum=0;
//        for(int i=0;i<array.length;i++){
//            sum = sum + array[i];
//        }
//        System.out.println(sum);
//    }
//}


//2. Implement a function to reverse the elements of an array.
public class PracticeInArrays {
    public static void main(String[] args){
        int[] array={1,2,3,4,5};

        for(int i= array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
}


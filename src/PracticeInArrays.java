import java.util.*;
//1. Write an algorithm to find the sum of all elements in an array.
public class PracticeInArrays {
    public static void main(String[] args){
        int[] array={1,3,5,7,9};

        int sum=0;
        for(int i=0;i<array.length;i++){
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}

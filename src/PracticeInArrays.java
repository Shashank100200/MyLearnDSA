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
//public class PracticeInArrays {
//    public static void main(String[] args){
//        int[] array={1,2,3,4,5};
//
//        for(int i= array.length-1;i>=0;i--){
//            System.out.print(array[i]+" ");
//        }
//    }
//}

//3. Solve the problem of finding the maximum element in an array.
//public class PracticeInArrays {
//    public static void main(String[] args){
//        int[] array={1,5,8,3,2,4};
//
//        int max = array[0];
//        for(int i=0;i< array.length;i++){
//            if(array[i]>max){
//                max = array[i];
//            }
//        }
//        System.out.println("Max value is :"+max);
//    }
//}

//OR
//public class PracticeInArrays {
//    public static void main(String[] args){
//        int[] array={1,5,8,3,2,4};
//
//        int max = Integer.MIN_VALUE;
//
//        for(int i=0;i<array.length;i++){
//            if(array[i] > max){
//                max = array[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

//4. Write a program to remove duplicate elements from an array.
public class PracticeInArrays {
    public static void main(String[] args){
        int[] array = {11,22,22,1,3,3,4,11};

        for(int i=0;i<array.length;i++){
            boolean isDuplicate = false;
            for(int j=0;j<i;j++){
                if(array[i]==array[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                System.out.print(array[i]+" ");
            }
        }
    }
}
//Dry Run for above code
//Certainly! Let's do a step-by-step dry run of the given program:
//
//        1. **Initialization:**
//        - Array: [11, 22, 22, 1, 3, 3, 4, 11]
//        - Length of the array (n): 8
//
//        2. **Outer Loop (i=0):**
//        - Current element: 11
//        - Inner Loop:
//        - No previous elements to compare (j < i is false).
//        - Not a duplicate, print 11.
//
//        3. **Outer Loop (i=1):**
//        - Current element: 22
//        - Inner Loop:
//        - Previous elements: [11]
//        - No duplicate found.
//        - Not a duplicate, print 22.
//
//        4. **Outer Loop (i=2):**
//        - Current element: 22
//        - Inner Loop:
//        - Previous elements: [11, 22]
//        - Duplicate found, set `isDuplicate` to true and break inner loop.
//        - It is a duplicate, so nothing is printed.
//
//        5. **Outer Loop (i=3):**
//        - Current element: 1
//        - Inner Loop:
//        - Previous elements: [11, 22, 22]
//        - No duplicate found.
//        - Not a duplicate, print 1.
//
//        6. **Outer Loop (i=4):**
//        - Current element: 3
//        - Inner Loop:
//        - Previous elements: [11, 22, 22, 1]
//        - No duplicate found.
//        - Not a duplicate, print 3.
//
//        7. **Outer Loop (i=5):**
//        - Current element: 3
//        - Inner Loop:
//        - Previous elements: [11, 22, 22, 1, 3]
//        - Duplicate found, set `isDuplicate` to true and break inner loop.
//        - It is a duplicate, so nothing is printed.
//
//        8. **Outer Loop (i=6):**
//        - Current element: 4
//        - Inner Loop:
//        - Previous elements: [11, 22, 22, 1, 3, 3]
//        - No duplicate found.
//        - Not a duplicate, print 4.
//
//        9. **Outer Loop (i=7):**
//        - Current element: 11
//        - Inner Loop:
//        - Previous elements: [11, 22, 22, 1, 3, 3, 4]
//        - Duplicate found, set `isDuplicate` to true and break inner loop.
//        - It is a duplicate, so nothing is printed.
//
//        **Final Output:**
//        ```
//        11 22 1 3 4
//        ```
//
//        The program successfully removes duplicate elements from the array while maintaining the order of the original elements.


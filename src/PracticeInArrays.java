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
//public class PracticeInArrays {
//    public static void main(String[] args){
//        int[] array = {11,22,22,1,3,3,4,11};
//
//        for(int i=0;i<array.length;i++){
//            boolean isDuplicate = false;
//            for(int j=0;j<i;j++){
//                if(array[i]==array[j]){
//                    isDuplicate = true;
//                    break;
//                }
//            }
//            if(!isDuplicate){
//                System.out.print(array[i]+" ");
//            }
//        }
//    }
//}

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

//public class PracticeInArrays {
//    public static void main(String[] args){
//        boolean isDuplicate = false;
//
//        isDuplicate = true;
//
//        System.out.print(!isDuplicate);//here its giving false therefore in the above code the isDuplicate value are printing
//    }
//}

//5. Implement an algorithm to rotate the elements of an array to the left.
//public class PracticeInArrays {
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5};
//
//        int temp = arr[0];
//        for(int i=0;i< arr.length-1;i++){
//            arr[i] = arr[i+1];
//        }
//        arr[arr.length-1] = temp;
//
//        for(int i=0;i< arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
//    }
//}

//6. Second Largest Element in an Array without sorting
//public class PracticeInArrays {
//    public static void main(String[] args) {
//        int arr[] = {12,4,5,23,3,32,31};
//
//        int max = arr[0];
//        int secLarge = Integer.MIN_VALUE;
//
//        for(int i=0;i<arr.length;i++){
//            int curr = arr[i];
//            if(curr > max){
//                max = arr[i];
//            }
//        }
//        for(int i=0;i< arr.length;i++){
//            int curr1 = arr[i];
//            if(curr1 > secLarge && curr1 < max){
//                secLarge = arr[i];
//            }
//        }
//        System.out.println(secLarge);
//    }
//}


//  Check array is sorted or not
//public class PracticeInArrays {
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5};
//
//        int size = 0;
//        for(int i=0;i< arr.length-1;i++){
//            int curr = arr[i];
//            int curr2 = arr[i+1];
//
//            if(curr < curr2){
//                size++;
//            }
//        }
//        if(size == arr.length-1){
//            System.out.println("Sorted");
//        }else{
//            System.out.println("Not Sorted");
//        }
//    }
//}

//public class PracticeInArrays {
//    public static void main(String[] args) {
//        int[] arr = {1, 4, 3, 2, 6, 7};
//        System.out.println(minJumps(arr));
//    }
//
//    public static int minJumps(int[] arr) {
//        if (arr.length == 0 || arr[0] == 0) {
//            return -1;
//        }
//
//        int n = arr.length;
//        int jumps = 0; // Number of jumps made
//        int currentEnd = 0; // End of the range that we can reach with the current number of jumps
//        int farthest = 0; // Farthest point that can be reached
//
//        for (int i = 0; i < n - 1; i++) {
//            // Update the farthest point that can be reached
//            farthest = Math.max(farthest, i + arr[i]);
//
//            // If we have reached the end of the current range,
//            // we need to make another jump
//            if (i == currentEnd) {
//                jumps++;
//                currentEnd = farthest;
//
//                // If the current end is beyond or at the last element, we are done
//                if (currentEnd >= n - 1) {
//                    return jumps;
//                }
//            }
//        }
//
//        // If we exit the loop without having reached the end, return -1
//        return currentEnd >= n - 1 ? jumps : -1;
//    }
//}


//      Program to Check Array is Sorted
//class Solution {
//    public static boolean check(int[] nums) {
//        int count = 0;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i] > nums[(i+1)%nums.length]){
//                count++;
//            }
//            if(count > 1){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {3,4,5,1,2};
//        System.out.println(check(arr));
//    }
//}


//                  Left Rotate of an Array By One
public class PracticeInArrays {
    public static void rotateByOne(int arr[]){

        int temp = arr[0];
        for(int i=0;i< arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        for(int i=0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        rotateByOne(array);
    }
}





import java.util.*;
//public class BubbleSort {
//    public static void main(String[] args) {
//        int arr[] = {5,4,3,2,1};
//
//        for(int i=0;i< arr.length;i++){
//            for(int j=0;j< arr.length-i-1;j++){
//                if(arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        for(int i=0;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }
//    }
//}


//Bubble sort recursive method
public class BubbleSort {
    public static void checkSort(int arr[],int size){
        if(size == arr.length-1){
            return;
        }
        if(arr[size] > arr[size+1]){
            int temp = arr[size];
            arr[size] = arr[size+1];
            arr[size+1] = temp;
        }
        checkSort(arr,size+1);
    }

    public static void bubbleSort(int arr[]) {
        // Iterate over the array
        for (int i = 0; i < arr.length - 1; i++) {
            // Perform a single pass of bubble sort
            checkSort(arr, 0);
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,7,3,1,2};
        bubbleSort(arr);
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

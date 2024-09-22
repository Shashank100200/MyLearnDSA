import java.util.*;
//public class InsertionSort {
//    public static void main(String[] args) {
//        int arr[] = {5,4,3,2,1};
//
//        for(int i=1;i< arr.length;i++){
//            int curr = arr[i];
//            int j = i-1;
//            while(j >= 0 && curr < arr[j]){
//                arr[j + 1] = arr[j];
//                j--;
//            }
//            arr[j+1] = curr;
//        }
//        for(int i=0;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }
//    }
//}


//                                                    OR
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr= {13,46,24,52,20,9};

        for(int i=0;i< arr.length;i++){
            int j=i;
            while(j > 0 && arr[j-1] > arr[j]){
                arr[j - 1] = arr[j-1] + arr[j];
                arr[j] = arr[j-1] - arr[j];
                arr[j-1] = arr[j-1] - arr[j];
                j--;
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
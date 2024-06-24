import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int smallest = i;
            for(int j=i+1;j<n;j++){   //2
                if(arr[j] < arr[smallest]){
                    smallest = arr[j];
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

import java.util.*;
//public class MergeSort {
//    public static void divide(int arr[],int si,int ei){
//        if(si >= ei){
//            return;
//        }
//        int mid = si + (ei - si)/2;
//        divide(arr,si,mid);
//        divide(arr,mid+1,ei);
//        concquor(arr,si,mid,ei);
//    }
//    public static void concquor(int arr[],int si,int mid,int ei){
//        int merged[] = new int[ei - si +1];
//        int idx1 = si;
//        int idx2 = mid+1;
//        int x = 0;
//        while(idx1 <= mid && idx2 <= ei){
//            if(arr[idx1] <= arr[idx2]){
//                merged[x++] = merged[idx1++];
//            }else{
//                merged[x++] = merged[idx2++];
//            }
//        }
//        while(idx1 <= mid){
//            merged[x++] = merged[idx1++];
//        }
//        while(idx2 <= ei){
//            merged[x++] = merged[idx2++];
//        }
//        for(int i=0,j=si;i<merged.length;i++,j++){
//            arr[j] = merged[i];
//        }
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {5,4,3,2,1};
//        int n = arr.length;
//        divide(arr,0,n-1);
//
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//}

import java.util.*;

//public class MergeSort {
//    public static void divide(int arr[], int si, int ei) {
//        if (si >= ei) {
//            return;
//        }
//        int mid = si + (ei - si) / 2;
//        divide(arr, si, mid);
//        divide(arr, mid + 1, ei);
//        conquer(arr, si, mid, ei);
//    }
//
//    public static void conquer(int arr[], int si, int mid, int ei) {
//        int merged[] = new int[ei - si + 1];
//        int idx1 = si;
//        int idx2 = mid + 1;
//        int x = 0;
//
//        while (idx1 <= mid && idx2 <= ei) {
//            if (arr[idx1] <= arr[idx2]) {
//                merged[x++] = arr[idx1++];
//            } else {
//                merged[x++] = arr[idx2++];
//            }
//        }
//        while (idx1 <= mid) {
//            merged[x++] = arr[idx1++];
//        }
//        while (idx2 <= ei) {
//            merged[x++] = arr[idx2++];
//        }
//        for (int i = 0, j = si; i < merged.length; i++, j++) {
//            arr[j] = merged[i];
//        }
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {5, 4, 3, 2, 1};
//        int n = arr.length;
//        divide(arr, 0, n - 1);
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//}


public class MergeSort {
    private static void merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left<=mid && right <= high){
            if(arr[left] <= arr[right]){
                list.add(arr[left]);
                left++;
            }else{
                list.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            list.add(arr[left]);
            left++;
        }
        while(right <= high){
            list.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            arr[i] = list.get(i-low);
        }
    }
    public static void divide(int[] arr,int low,int high){
        if(low >= high){
            return;
        }
        int mid = (low+high)/2;
        divide(arr,low,mid);
        divide(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    public static void main(String[] args) {
        int[] arr = {13,45,24,52,20,9};
        MergeSort.divide(arr,0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

import java.util.*;
public class quickSort {
    public static int partition(List<Integer> list,int low,int high){
        int i= low;
        int j = high;
        int pivote = list.get(low);

        while(i < j){
            while(list.get(i) <= pivote && i <= high-1){
                i++;
            }
            while(list.get(j) > pivote && j >= low+1){
                j--;
            }
            if(i < j){
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j,temp);
            }
        }
        list.set(low, list.get(j));
        list.set(j,pivote);
        return j;
    }
    public static void qs(List<Integer> list,int low,int high){
        if(low < high){
            int pIndex = partition(list,low,high);
            qs(list,low,pIndex-1);
            qs(list,pIndex+1,high);
        }
    }
    public static List<Integer> sort(List<Integer> list){
        qs(list,0,list.size()-1);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(13);
        arr.add(46);
        arr.add(24);
        arr.add(52);
        arr.add(20);
        arr.add(9);

        quickSort.sort(arr);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}


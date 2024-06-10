import java.lang.reflect.Array;
import java.util.*;
//public class ArrayListProg {
//    public static void main(String[] args) {
//        //ArrayList Implementation
//        ArrayList<Integer> list = new ArrayList<Integer>();
//
//        //Adding of an element
//        list.add(0);
//        list.add(2);
//        list.add(6);
//
//        System.out.println(list);
//
//        int ele = list.get(0);
//        System.out.println(ele);
//
//        //adding new ele into list
//        list.add(2,4);
//        System.out.println(list);
//
//        //Setting an element
//        list.set(0,1);
//        System.out.println(list);
//
//        //deleting of an element
//        list.remove(1);
//        System.out.println(list);
//
//        //size
//        System.out.println(list.size());
//
//        //loop
//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i));
//        }
//
//        //sorting --> Collections contains sorting packages in AL
//        Collections.sort(list);
//        System.out.println(list);
//    }
//}

//create an ArrayList to store integer
public class ArrayListProg {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.set(4,100);
        System.out.println(list.size());
        Collections.sort(list);
        list.clear();

        list.add(2,25);
        list.remove(3);

        boolean present = true;
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
            if(list.get(i) != 30){
                present = false;
            }
//            System.out.print(list.get(i)+" ");
        }
        if(present){
            System.out.println("present");
        }else{
            System.out.println("NP");
        }
    }
}
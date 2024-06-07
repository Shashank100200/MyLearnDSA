import java.util.*;
public class ArrayListProg {
    public static void main(String[] args) {
        //ArrayList Implementation
        ArrayList<Integer> list = new ArrayList<Integer>();

        //Adding of an element
        list.add(0);
        list.add(2);
        list.add(6);

        System.out.println(list);

        int ele = list.get(0);
        System.out.println(ele);

        //adding new ele into list
        list.add(2,4);
        System.out.println(list);

        //Setting an element
        list.set(0,1);
        System.out.println(list);

        //deleting of an element
        list.remove(1);
        System.out.println(list);

        //size
        System.out.println(list.size());

        //loop
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }

        //sorting --> Collections contains sorting packages in AL
        Collections.sort(list);
        System.out.println(list);
    }
}

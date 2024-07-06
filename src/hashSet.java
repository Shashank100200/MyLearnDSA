import java.util.HashSet;
import java.util.Iterator;
public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);

        set.remove(2);                           //O(1)
        System.out.println(set.contains(3));        //O(1)
        System.out.println(set.size());

        set.add(0);
        System.out.println(set);

        Iterator it = set.iterator();                //Iterator is the function used to iterate the set

        while(it.hasNext()){                        //Till iterator has next hadNext function helps to iterate
            System.out.println(it.next());          //And it.next() helps to print the  element in set
        }

        if(!set.isEmpty()){
            System.out.println("Not Empty");
        }

        set.clear();
        System.out.println(set);
    }
}

import java.util.*;

//Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.

public class PracticeInLL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);

        int ans = -1;

        for(int i=0;i<list.size();i++){
            int curr = list.get(i);
            if(curr == 7){
                ans = i;
                break;
            }
        }
        if(ans == -1){
            System.out.println("Ele not found");
        }else{
            System.out.println("ele found at index :"+ans);
        }
    }
}

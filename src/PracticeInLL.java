import java.util.*;

//Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.

//public class PracticeInLL {
//    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<Integer>();
//
//        list.add(1);
//        list.add(5);
//        list.add(7);
//        list.add(3);
//        list.add(8);
//        list.add(2);
//        list.add(3);
//
//        int ans = -1;
//
//        for(int i=0;i<list.size();i++){
//            int curr = list.get(i);
//            if(curr == 7){
//                ans = i;
//                break;
//            }
//        }
//        if(ans == -1){
//            System.out.println("Ele not found");
//        }else{
//            System.out.println("ele found at index :"+ans);
//        }
//    }
//}

//Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.
//public class PracticeInLL {
//    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<Integer>();
//
//        list.add(22);
//        list.add(25);
//        list.add(13);
//        list.add(27);
//        list.add(21);
//        list.add(100);
//        list.add(14);
//
//        for(int i=0;i<list.size();i++){
//            int curr = list.get(i);
//
//            if(curr > 25){
//                list.remove(i);
//            }
//        }
//        System.out.println(list);
//        System.out.println(list.size());
//    }
//}

//5.To delete ele in LL from last

public class PracticeInLL {

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        // First step: Determine if there is a cycle
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                // Cycle detected
                ListNode check = head;
                while (check != slow) {
                    check = check.next;
                    slow = slow.next;
                }
                return check; // The start of the cycle
            }
        }
        return null; // No cycle
    }

    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Create a cycle for testing

        PracticeInLL solution = new PracticeInLL();
        ListNode cycleStart = solution.detectCycle(head);

        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}




















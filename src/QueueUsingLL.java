import java.util.*;
//public class QueueUsingLL {
//    class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            next = null;
//        }
//    }
//
//    public class Queue {
//        public static Node head = null;
//        public static Node tail = null;
//
//        public static boolean isEmpty() {
//            return head == null && tail == null;
//        }
//
//        public void add(int data) {
//            Node newNode = new Node(data);
//            if (isEmpty()) {
//                head = tail = newNode;
//            }
//            tail.next = newNode;
//            tail = newNode;
//        }
//
//        public static int remove() {
//            if (isEmpty()) {
//                System.out.println("Empty");
//                return -1;
//            }
//            int front = head.data;
//            if (head == tail) {
//                tail = null;
//            }
//            head = head.next;
//            return front;
//        }
//
//        public static int peek() {
//            if (isEmpty()) {
//                System.out.println("Empty");
//                return -1;
//            }
//            return head.data;
//        }
//
//        public static void main(String[] args) {
//            Queue q = new Queue();
//            q.add(1);
//            q.add(2);
//            q.add(3);
//            q.add(4);
//
//            while(!q.isEmpty()){
//                System.out.println(q.peek());
//                q.remove();
//            }
//        }
//    }
//}

public class QueueUsingLL {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
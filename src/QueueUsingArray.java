import java.util.*;
//public class QueueUsingArray {
//    static class Queue{
//        static int size;
//        static int array[];
//        static int rear = -1;
//
//        Queue(int n){
//            this.size = n;
//            array = new int[n];
//        }
//        public static boolean isEmpty(){
//            return rear == -1;
//        }
//        public static boolean isFull(){
//            return rear == size-1;
//        }
//
//        // O(1)
//        public static void add(int data){
//            if(isFull()){
//                System.out.println("Overflow");
//                return;
//            }
//
//            rear++;
//            array[rear] = data;
//        }
//
//
//        // O(n)
//        public static int remove(){
//            if(isEmpty()){
//                return -1;
//            }
//            int front = array[0];
//            for(int i=0;i < rear;i++){
//                array[i] = array[i+1];
//            }
//            rear--;
//            return front;
//        }
//
//        //O(1)
//        public static int peek(){
//            if(isEmpty()){
//                System.out.println("Empty");
//                return -1;
//            }
//            return array[0];
//        }
//    }
//
//    public static void main(String[] args) {
//        Queue q = new Queue(5);
//
//        q.add(1);
//        q.add(2);
//        q.add(3);
//
//        while(!q.isEmpty()){
//            System.out.println(q.peek());
//            q.remove();
//        }
//
//    }
//}

//Circular queue using array

public class QueueUsingArray {
    static class Queue{
        static int array[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n){
            this.size = n;
            array = new int[n];
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear + 1)%size == front;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("S is Full");
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            array[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            int result = array[front];
            if(rear == front){
                rear = front = -1;
            }else {
                front = (front + 1) % size;
            }
            return result;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return array[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

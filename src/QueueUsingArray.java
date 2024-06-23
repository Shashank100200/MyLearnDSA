import java.util.*;
public class QueueUsingArray {
    static class Queue{
        static int size;
        static int array[];
        static int rear = -1;

        Queue(int n){
            this.size = n;
            array = new int[n];
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static boolean isFull(){
            return rear == size-1;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Overflow");
                return;
            }

            rear++;
            array[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int front = array[0];
            for(int i=0;i < rear;i++){
                array[i] = array[i+1];
            }
            rear--;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return array[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

//        System.out.println(q.remove());
//        System.out.println(q.peek());
    }
}

import java.util.*;
public class stackUsingAL {
    static class Stack{
        public static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

//public class stackUsingAL {
//        public static void main(String[] args) {
//            Stack<Integer> s = new Stack<>();
//            s.push(1);
//            s.push(2);
//            s.push(3);
//            s.push(4);
//
//            while(!s.isEmpty()){
//                System.out.println(s.peek());
//                s.pop();
//            }
//        }
//}


//push the ele at the bottom of the stack

//public class stackUsingAL {
//    public static void pushAtBottom(int data,Stack<Integer> s){
//        if(s.isEmpty()){
//            s.push(data);
//            return;
//        }
//        int top = s.pop();
//        pushAtBottom(data,s);
//        s.push(top);
//    }
//
//    public static void main(String[] args) {
//        Stack<Integer> s = new Stack<>();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//
//        pushAtBottom(4,s);
//
//        while(!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }
//    }
//}


//to insert the element at the bottom of a stack
//Reverse an element in an array

//public class stackUsingAL {
//    public static void pushAtBottom(int data,Stack<Integer> s){
//        if(s.isEmpty()){
//            s.push(data);
//            return;
//        }
//        int top = s.pop();
//        pushAtBottom(data,s);
//        s.push(top);
//    }
//
//    public static void reverse(Stack<Integer> s){
//        if(s.isEmpty()){
//            return;
//        }
//        int top = s.pop();
//        reverse(s);
//        pushAtBottom(top,s);
//    }
//
//    public static void main(String[] args) {
//        Stack<Integer> s = new Stack<>();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//
//        reverse(s);
//
//        while(!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }
//    }
//}


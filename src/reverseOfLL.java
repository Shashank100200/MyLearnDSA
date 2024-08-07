import java.util.*;
public class reverseOfLL {
    Node head;  // Declairation of head
    private int size;

    reverseOfLL(){
        this.size = 0;
    }
    class Node{  // Creating class
        String data;  //variables of the class
        Node next;

        Node(String data){            //Constructor
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //adding the element to LL at first
    public void addFirst(String data){
        Node newNode= new Node(data);  //Creating new node
        if(head == null){              //Checking weather LL is empty
            head = newNode;            //if empty assigning new node as head
            return;
        }                              //else
        newNode.next = head;           //linking next of new node to current node(1st node) where head is pointing
        head = newNode;                //Making new node as a head
    }

    //adding the ele to LL at last
    public void addLast(String data){
        Node newNode = new Node(data); //Creating new node
        if(head == null){              //Checking weather LL is empty
            head = newNode;            //if empty assigning new node as head
            return;
        }                              //else
        Node currNode = head;          //creating currNode named variable which acts like pointer to traverse assining as head to it
        while(currNode.next != null){  //traversing till it reaches the null
            currNode = currNode.next;  //making it traverse where we use currNode.next
        }
        currNode.next = newNode;       //after it reaches the last node assigning its next to new node
        newNode.next = null;
    }

    //to print the ele of the list
    public void printList(){
        if(head == null){              //Checking weather the LL is empty
            System.out.println("Empty List"); //printing empty if list is empty
            return;
        }                               //else
        Node lastNode = head;           //creating currNode named variable which acts like pointer to traverse assining as head to it
        while(lastNode != null){
            System.out.print(lastNode.data+"->"); // printing each element while traverse
            lastNode = lastNode.next;   //making it traverse where we use lastNode.next
        }
        System.out.println("Null");     //printing null node (last node)
    }

//    deleting the ele at first
    public void deleteFirst(){
        if(head == null){               //Checking weather the LL is empty
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;               //meaking 2nd node as head where 1st node is lost now there fore the node is deleted
    }

//    deleting the ele at the last
    public void deleteLast(){
        if(head == null){               //Checking weather the LL is empty
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){          //head.next == null -> lastnode = null ,then null.next means lastnode.next will get error
            head = null;                //to avoid this we will satisfy this corner case
            return;
        }

        Node lastnode = head.next;      //creating variable lastnode as head.next
        Node seclasnode = head;         //and seclast as head

        while(lastnode.next != null){   //till lastnode != null
            lastnode = lastnode.next;   //it will traverse
            seclasnode = seclasnode.next; //and the seclast will also traverse till lastnode will reach last node and seclast will be at last but one node
        }
        seclasnode.next = null;         //linking seclasnode next to null
    }

    public void reverseInterate(){
        if(head == null || head.next == null){
            return;
        }

        Node currNode = head.next;
        Node prevNode = head;

        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

//    public void swapInterate(String data){
//
//        Node dummy = new Node(data);
//        dummy.next = head;
//        Node point = dummy;
//
//        while(point.next != null && point.next.next != null){
//            Node swap1 = point.next;
//            Node swap2 = point.next.next;
//
//            swap1.next = swap2.next;
//            swap2.next = swap1;
//
//            point.next = swap2;
//            point = swap1;
//        }
//    }


    
    //Using Collections frameworks

    public static Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        reverseOfLL list = new reverseOfLL();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("It");
        list.addLast("Reva");
        list.addLast("University");
        list.printList();

        list.reverseInterate();
        list.printList();
//        list.reverseInterate();
//        list.printList();
//        list.head = reverseRecursive(list.head);
//        list.printList();
//        list.printList();
    }
}
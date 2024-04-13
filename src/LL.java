import java.util.*;
public class LL {
    Node head;  // Declairation of head
    class Node{  // Creating class
        String data;  //variables of the class
        Node next;

        Node(String data){   //Constructor
            this.data = data;
            this.next = null;
        }
    }

    //adding the element of LL at first
    public void addFirst(String data){
        Node newNode= new Node(data);  //Creating new node
        if(head == null){              //Checking weather LL is empty
            head = newNode;            //if empty assigning new node as head
            return;
        }                              //else
        newNode.next = head;           //linking next of new node to current node(1st node) where head is pointing
        head = newNode;                //Making new node as a head
    }
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
    }
    public void printList(){
        if(head == null){              //Creating new node
            System.out.println("Empty List"); //printing empty if list is empty
            return;
        }                               //else
        Node lastNode = head;           //creating currNode named variable which acts like pointer to traverse assining as head to it
        while(lastNode.next != null){
            System.out.print(lastNode.data+"->"); // printing each element while traverse
            lastNode = lastNode.next;   //making it traverse where we use lastNode.next
        }
        System.out.println("Null");     //printing null node (last node)
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("It");
        list.printList();
        list.addLast("Reva");
        list.addLast("University");
        list.printList();
    }
}

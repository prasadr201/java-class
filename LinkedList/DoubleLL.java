//contain 3 part -> data, prev node refrence , next node refrence
import java.util.*;
public class DoubleLL{

    public class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //add first
    public void addFirst(int data){

        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.prev = null;
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //remove first
    public void remove(){
        if(head == null){
            System.out.println("empty");
        }

        head = head.next;
        head.prev = null;
        size--;
    }

    //print
    public void print(){
        if(head == null){
            System.out.println("null");
            return;
        }
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLL dll = new DoubleLL();
        dll.print();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println(dll.size);
        dll.remove();
        dll.print();

        System.out.println(dll.size);

    }
}
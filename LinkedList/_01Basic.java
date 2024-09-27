import java.util.*;

public class _01Basic {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size ;

    // add first
    public void addFirst(int data) {
        // 1. create node
        Node newNode = new Node(data);
        size++;

        // if ll is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // 2. take reference of next node in new node
        newNode.next = head;

        // 3. make new node as head
        head = newNode;
    }

    // add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.next = null;
        tail = newNode;
    }

    //add specific position
    public void addidx(int pos, int data){
        Node newNode = new Node(data);
        size++;

        if(pos == 0){
            addFirst(data);
            return;
        }

        Node temp = head;
        int i = 0;
        
        while(i < pos-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    //remove first
    public void removeFirst(){
        if(head == null){
            System.out.println("ll empty");
            return;
        }

        head = head.next;
        size--;
    }

    //remove last
    public void removeLast(){
        if(head == null){
            System.out.println("ll empty");
            return;
        }

        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }

        tail = temp;
        temp.next = null;
        size--;
    }


    //remove sp index
    public void removeidx(int pos){
        Node temp = head;
        int i=0;

        while(i < pos-1){
            temp = temp.next;
            i++;
        }

        temp.next = temp.next.next;
        size--;
    }


    public void print() {
        if (head == null) {
            System.out.println("null");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        // create an object of _01Basic, not LinkedList
        _01Basic ll = new _01Basic();

        ll.print(); // this should print "null" because the list is empty

        ll.addFirst(2);
        // ll.print();
        ll.addFirst(1);
        // ll.print();
        ll.addLast(3);
        // ll.print();
        ll.addLast(4);
        // this should print the linked list
        ll.addidx(1, 5);
        ll.print();
        System.out.println("size = " + ll.size);
        // ll.removeFirst();
        // ll.print(); 
        // System.out.println("size = " + ll.size);
        // ll.removeLast();
        // ll.print(); 
        // System.out.println("size = " + ll.size);
        ll.removeidx(2);
        ll.print(); 
        System.out.println("size = " + ll.size);
    }
}

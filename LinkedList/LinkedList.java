package LinkedList;

// CREATING LINKED LIST CLASS WHICH WILL HAVE ALL THE DATA MEMBERS AND MEMBER FUNCTIONS TO PERFORM MANY OPPERATIONS ON LINKED LIST

public class LinkedList {

    // CREATING A PRIVATE NODE CLASS WHICH WILL BE USED TO CREATE AND MANAGE THE
    // NODES
    private class Node {
        private int data; // IT WILL STORE THE DATA OF THE NODE
        private Node next; // IT WILL BE A POINTER TO THE NEXT NODE INITIALLY NULL

        // CONSTRUCTOR FOR INITIALIZING THE NODE CLASS WHEN THE OPJECT IS CREATED
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }


    // CREATING POINTERS HEAD AND TAIL TO POINT TO THE FIRST AND LAST NODE OF THE
    // LINKED LIST RESPECTIVELY

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public int sizeOfLinkedList() {
        return size;
    }

    // IMPORTANT METHODS USED IN LINKED LIST

    // 1. addFirst : THIS METHOD IS USED TO ADD NEW NODES ON THE LEFT SIDE OF THE
    // EXISTING HEAD NODE

    public void addFirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = head;
            size += 1;
        } else {
            newnode.next = head;
            head = newnode;
            size += 1;
        }

    }

    // 2. addLast : THIS METHOD IS USED TO ADD NODES TO THE RIGHT SIDE OF THE
    // EXISTING TAIL NODE

    public void addLast(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            tail = head;
            size += 1;
        } else {
            tail.next = newnode;
            tail = newnode;
            size += 1;
        }
    }

    // 3. removeLast : THIS METHOD IS USED TO REMOVE THE LAST NODE OF THE LINKED
    // LIST
    public void removeLast() {
        Node temp = head;

        if (head == tail) {
            head = null;
            tail = null;
        }

        else {
            while (temp != null) {
                if (temp.next == tail) {
                    temp.next = null;
                    tail = temp;
                    break;
                }
                temp = temp.next;
            }

        }

    }

    // 4. removeFirst : THIS METHOD IS USED TO REMOVE THE FIRST NODE OF THE LINKED
    // LIST

    public void removeFirst() {
        // Node temp = head.next;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
    }

    // 5. Display : THIS METHOD IS USED TO DISPLAY ALL THE DATA CONTAINED IN THE
    // LINKED LIST
    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            System.out.print("->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

}

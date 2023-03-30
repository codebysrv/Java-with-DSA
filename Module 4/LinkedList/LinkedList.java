package LinkedList;

public class LinkedList {

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // public LinkedList() {
    // size = 0;
    // }

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public int sizeOfLinkedList() {
        return size;
    }

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

    /**
     * 
     */
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

    public void removeFirst() {
        // Node temp = head.next;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
    }

    /**
     * 
     */
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

package Assignment_2;

class LinkedList {
    Node head;

    public void insertAtPos(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Invalid position.");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Invalid position.");
            return;
        }
        current.next = current.next.next;
    }


    public void deleteAfterNode(int data) {
        if (head == null || head.next == null) {
            System.out.println("List is empty or has only one node.");
            return;
        }
        Node current = head;
        while (current.data != data && current.next != null) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Node not found.");
            return;
        }
        current.next = current.next.next;
    }

    public boolean searchNode(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void viewList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    
    class Stack {
        Node top;

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }

        public int pop() {
            if (top == null) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int data = top.data;
            top = top.next;
            return data;
        }

        public int peek() {
            if (top == null) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return top.data;
        }
    }
}
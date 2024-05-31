package Assignment_2;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Test the operations
        list.insertAtPos(10, 1);
        list.insertAtPos(20, 2);
        list.insertAtPos(30, 3);
        list.viewList();

        list.deleteAtPosition(2);
        list.viewList();

        list.deleteAfterNode(10);
        list.viewList();

        System.out.println(list.searchNode(20));
        System.out.println(list.searchNode(40));

        LinkedList.Stack stack = list.new Stack();
        stack.push(40);
        stack.push(50);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
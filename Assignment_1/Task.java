package Assignment_1;

class Task {
    private String title;
    private String description;
    private boolean completed;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public void markCompleted() {
        this.completed = true;
    }
}

class Node {
    Task task;
    Node next;

    public Node(Task task) {
        this.task = task;
        this.next = null;
    }
}

class ToDoList {
    private Node head;

    public ToDoList() {
        this.head = null;
    }

    public void addToDo(Task task) {
        Node newNode = new Node(task);

        // If the list is empty, set the new node as the head
        if (this.head == null) {
            this.head = newNode;
            return;
        }

        // Traverse to the end of the list and add the new node
        Node current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void markToDoAsCompleted(String title) {
        // Traverse the list to find the task with the given title
        Node current = this.head;
        while (current != null) {
            if (current.task.getTitle().equals(title)) {
                current.task.markCompleted();
                System.out.println("Task '" + title + "' marked as completed.");
                return;
            }
            current = current.next;
        }
        System.out.println("Task '" + title + "' not found in the to-do list.");
    }

    public void viewToDoList() {
        // Traverse the list and display each task
        Node current = this.head;
        System.out.println("To-Do List:");
        while (current != null) {
            System.out.println("- " + current.task.getTitle() + ": " + current.task.getDescription() + " [" + (current.task.isCompleted() ? "Completed" : "Incomplete") + "]");
            current = current.next;
        }
    }
}


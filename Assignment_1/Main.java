package Assignment_1;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        // Add tasks to the to-do list
        toDoList.addToDo(new Task("Finish project report", "Complete the final project report by the end of the week."));
        toDoList.addToDo(new Task("Grocery shopping", "Buy milk, eggs, and bread."));
        toDoList.addToDo(new Task("Call mom", "Remember to call mom on her birthday."));


        toDoList.markToDoAsCompleted("Grocery shopping");


        toDoList.viewToDoList();
    }
}
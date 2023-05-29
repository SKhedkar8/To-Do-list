import java.util.*;

public class ToDoList {

    private ArrayList<String> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(String task) {
        tasks.remove(task);
    }

    public void viewTasks() {
        for (String task : tasks) {
            System.out.println(task);
        }
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        toDoList.addTask("Buy groceries");
        toDoList.addTask("Clean the house");
        toDoList.addTask("Do the laundry");

        toDoList.viewTasks();

        System.out.println("Enter the task you want to remove: ");
        Scanner scanner = new Scanner(System.in);
        String taskToRemove = scanner.nextLine();

        toDoList.removeTask(taskToRemove);

        toDoList.viewTasks();
    }
}

import java.util.LinkedList;

/**
 * Class representing a todo list.
 * TodoList object should aggregate TodoItem objects.
 */
public class TodoList {

    private LinkedList<TodoItem> todoList = new LinkedList<TodoItem>();

    public TodoList() {
        this.todoList = todoList;
    }

    public LinkedList<TodoItem> getTodoList() {
        return this.todoList;
    }

    public void addItemToTheList(TodoItem task) {
        todoList.add(task);
    }

    public void deleteCompleteTasks() {

        for (TodoItem task : todoList) {
            if (task.getIsDone() == true) {
                todoList.remove(task);
            }
        }
    }

    public void showAllTasks() {

        int counter = 1;

        for (TodoItem task : todoList) {

            if (task.getIsDone() == false) {
                System.out.println(counter + ". [---] " + task.getTaskName());
                counter++;
            }
            else {
                System.out.println(counter + ". [+++] " + task.getTaskName());
                counter++;
            }
        }
    }

    public void markTaskAsResolved(String taskName) {

        for (TodoItem task : todoList) {

            if ((task.getTaskName()).equals(taskName)) {
                task.setIsDone();
            }

            else {
                System.out.println("There is no task like that, try again.\n");
            }

        }
    }

}

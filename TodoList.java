import java.util.LinkedList;

/**
 * Class representing a todo list.
 * TodoList object should aggregate TodoItem objects.
 */
public class TodoList{

    private LinkedList<TodoItem> todoList = new LinkedList<TodoItem>();

    public TodoList() {
        this.todList = todoList
    }

    public void addItemToTheList(TodoItem task) {
        todoList.add(task)
    }

    public void deleteCompleteTasks() {
    }

    public void showAllTasks() {

        int counter = 1;

        for (TodoItem task : todoList) {

            if (task.isDone == true) {

                System.out.println(counter + ". [---] " + task.getTaskName());
                counter++;
            }
            else {
                System.out.println(counter) ". [+++] " + task.getTaskName();
                counter++;
            }
        }
    }

}

/**
 * Class representing a single todo item.
 *
 */
public class TodoItem {

    private String taskName;
    private boolean isDone;

    public TodoItem(String taskName) {
        this.taskName = taskName;
        this.isDone = false;
    }

    public void setIsDone() {
        this.isDone = true;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public boolean getIsDone() {
        return this.isDone;
    }
}

import java.util.Scanner;
/**
 * Class representing the TodoApp application.
 * It is the main entry point for this program.
 */
public class App {

    private static Scanner input = new Scanner(System.in);
    private static TodoList taskList = new TodoList();

  public static void main(String[] args) {

      String userChoice = "";

      while(!userChoice.equals("YES")) {

          printMenu();
          userChoice = input.nextLine();

          if (userChoice.equals("1")) {
            printList();
          }

          else if(userChoice.equals("2")) {
            addItem();
          }

          else if(userChoice.equals("3")) {

            markAsResolved();
          }

          else if(userChoice.equals("4")) {
            taskList.deleteCompleteTasks();
          }

      }
  }

  public static void printList() {

      if ((taskList.getTodoList()).isEmpty()) {
          System.out.println("Task list is empty, add some piece of shit :)\n");
      }

      else {
          taskList.showAllTasks();
          System.out.println();
      }
  }

  public static void addItem() {

      System.out.println("Enter task name: ");
      String taskName = input.nextLine();
      System.out.println();

      TodoItem task = new TodoItem(taskName);

      taskList.addItemToTheList(task);
  }

  public static void markAsResolved() {
      System.out.println("Enter task name to mark as done: ");
      String taskName = input.nextLine();
      taskList.markTaskAsResolved(taskName);
      System.out.println();
  }

  public static void printMenu() {
      System.out.println("Choice option: \n" +
                         "1. Show all tasks.\n" +
                         "2. Add new task\n" +
                         "3. Marking a task as resolved\n" +
                         "4. Delete all complete taskas.\n" +
                         "Press YES - exit.\n");
  }
}

import java.util.Scanner;

/**
 * Class representing the TodoApp application.
 * It is the main entry point for this program.
 */
public class App{
  public static void main(String[] args) {

      String userChoice = "";
      Scanner input = new Scanner(System.in);

      while(!userChoice.equals("YES")) {

          printMenu();
          userChoice = input.next();

          if (userChoice.equals("1") {

          }
          else if(userChoice.equals("2")) {

          }
          else if(userChoice.equals("3") {

          }
          else if(userChoice.equals("4") {

          }

      }
  }

  public static void printMenu() {
      System.out.println("Choice option: \n" +
                         "1. Show all tasks.\n" +
                         "2. Add new task\n" +
                         "3. Marking a task as resolved\n" +
                         "4. Delete all complete taskas.\n")
  }
}

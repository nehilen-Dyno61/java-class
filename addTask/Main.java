import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void addTask(ArrayList<String> taskList, String task) { // function to add task
    taskList.add(task); // adds the task to the taskList (list of tasks) 
    
    }

    public static void printTask(ArrayList<String> taskList) { // now only one for calling within the printTask to print task
    for (String task : taskList) {
        System.out.println(task);
    }
  }

  public static void main(String[] args) {
    ArrayList<String> taskList = new ArrayList<>();

    addTask(taskList, "Sleeping for an hour"); // add this to list
    addTask(taskList, "Go for a jog"); // and another to list

    printTask(taskList); // make a call to the function so it prints one at a time by for each loop
  }
}

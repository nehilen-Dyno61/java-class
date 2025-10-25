import java.util.ArrayList;

public class Main {   
    public static void main(String[] args) {
        // make an arraylist for tasks
        ArrayList<String> tasks = new ArrayList<String>();

        // add some tasks
        tasks.add("do homework");
        tasks.add("clean room"); 
        tasks.add("feed dog");

        // show original 
        System.out.println("before changes: " + tasks);

        // call editTask 
        editTask(tasks, 1, "clean garage");

        
        System.out.println("after editing: " + tasks);

        // call deleteTask to remove a task
        deleteTask(tasks, 0);

        
        System.out.println("after deleting: " + tasks);
    }


    public static void editTask(ArrayList<String> list, int index, String newTask) {
        list.remove(index);
        list.add(index, newTask);
    }

    
    public static void deleteTask(ArrayList<String> list, int index) {
        // remove the task at the given index
        list.remove(index);
    }
}
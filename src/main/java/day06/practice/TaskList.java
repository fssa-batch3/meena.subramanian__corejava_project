package day06.practice;

import java.util.ArrayList;


public class TaskList {
	 public static void main(String[] args) {
		 ArrayList<Task> tasks = new ArrayList<>();
	        tasks.add(new Task("Cleaning House", 0));
	        tasks.add(new Task("Washing Clothes", 0));
	        tasks.add(new Task("Moping the floor", 0));

	        boolean exists = findTaskByName("Moping the floor", tasks);
	        System.out.println("Task Status: " + exists);
	    }

	    public static boolean findTaskByName(String name, ArrayList<Task> tasks) {
	        for (Task task : tasks) {
	            if (task.getTaskName().equals(name)) {
	                return true;
	            }
	        }
	        return false;
	    }
}
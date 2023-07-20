package day09.practice;

import java.util.*;

public class SortByDeadLine {

	public static void main(String[] args) {
		
		Task task1 = new Task(3, "Coding", "2022-10-22", 0);
		Task task2 = new Task(5, "Product Design", "2022-10-01",4);
		Task task3 = new Task(1, "Software Design", "2022-10-07",5);
		Task task4 = new Task(3, "Coding", "2022-10-22",6);
		
		
		List<Task> tasks = new ArrayList<>();
		tasks.add(task1);
		tasks.add(task2);
		tasks.add(task3);
		tasks.add(task4);

		
		Collections.sort(tasks, Comparator.comparing(Task::getDeadline).thenComparing(Task::getPriority));
		
		 for (Task task : tasks) {
	            System.out.println(task.getId() + "," + task.getName() + "," + task.getDeadline() + "," + task.getPriority());
	        }
		

	}
	
}

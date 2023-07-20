package day09.practice;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;


public class Task implements Comparable<Task>{

	private int id;
	private String name;
	private LocalDate deadLine;
	private int priority;
	
	public Task(int id, String name, String deadLine, int priority) {
		
		this.id = id;
		this.name = name;
		
		try {
            this.deadLine = LocalDate.parse(deadLine);
            
        } catch (DateTimeParseException e) {
            System.out.println("Error: Invalid deadline format. Please use the format 'YYYY-MM-DD'");
        }
		
		this.priority = priority;
	}
	
	
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDeadline() {
		return deadLine;
	}
	

	public int getPriority() {
		return priority;
	}
	
	@Override
	public int compareTo(Task t) {

//		if (this.getPriority() == t.getPriority()) {
//			return 0;
//		} else {
//			if (this.deadLine.isBefore(getDeadline())) {
//				return 1;
//			} else {
//				return -1;
//			}
//			
//		}
		
		return this.deadLine.compareTo(t.getDeadline());
	}

	@Override
	public String toString() {
		return "Task [Id=" + id + ", Task name=" + name + ", DeadLine=" + deadLine + ", Priority=" + priority + "]";
	}


}

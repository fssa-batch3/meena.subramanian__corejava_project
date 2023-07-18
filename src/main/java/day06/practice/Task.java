package day06.practice;

public class Task {

	private String taskName;
	private int priority;

	public Task(String taskName, int priority) {
		this.taskName = taskName;
		this.priority = priority;
	}

	public String getTaskName() {
		return taskName;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

}

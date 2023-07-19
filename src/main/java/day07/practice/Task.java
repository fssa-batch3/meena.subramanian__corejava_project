package day07.practice;

public class Task {
	private int id;
	private String name;
	private String deadline;
	
	public String getName() {
		return name;
	}

	public String getDeadline() {
		return deadline;
	}
	
	public Task (String name, String deadLine) {
		
		this.name = name;
		this.deadline = deadLine;
	}
	
	 @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Task task = (Task) obj;
	        return name.equals(task.name) && deadline.equals(task.deadline);
	    }

	    @Override
	    public int hashCode() {
	        return 31 * name.hashCode() + deadline.hashCode();
	    }
	    
		@Override
		public String toString() {
			return "Task [name=" + name + ", deadline=" + deadline + "]";
		}
	
}
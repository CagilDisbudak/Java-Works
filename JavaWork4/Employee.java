import java.util.ArrayList;

public class Employee extends Person{

	
	private String role;
	private ArrayList<Task> tasks = new ArrayList<Task>();

	public Employee (String name, int id, String role){
	super(role, id);
	this.role = role;
	tasks.add(null);
	}
	public void addTask(Task t) {
		tasks.add(t);	
	}
	public void displayTasks() {
		for (int i = 0; i < tasks.size(); i++) {
		      System.out.println(tasks.get(i));
		    }
      
	}
	public void displayUnfinishedTasks() {
		
		for (int i = 0; i < tasks.size(); i++) {
			if(tasks.get(i).getfinished() == false) 
			{
		      System.out.println(tasks.get(i));
		    }
		}

	}
	public void removeDuplicateTasks() {
		for (int x = 0; x < tasks.size(); x++) 
		for (int i = 0; i < tasks.size(); i++) {
			  if(tasks.get(x).Equals(tasks.get(i))) {
				  tasks.remove(i);
			  }
		      System.out.println("All Duplicated Tasks Removed");
		    
		}
      
	}
	
	
	
}

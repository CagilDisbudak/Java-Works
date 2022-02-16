
public class Task{
	
	public Task(DueDate date, int cost, boolean finished) {
	  
		this.cost = cost;
		this.finished = finished;
		DueDate due_date = new DueDate(date.Getday(), date.Getmonth(),date.Getyear());
		
		
	}
    public int getcost() {
    	return cost;
    }
    public boolean getfinished() {
    	return finished;
    }
    

	private DueDate due_date;
	private int cost;
	private boolean finished;

	public void ToString(){

	}
	public boolean Equals(Task m) {
		if(m.due_date.Equals(this.due_date) == true && m.cost == cost && m.finished == finished) {
			return true;
		}
		return false;
	}
}

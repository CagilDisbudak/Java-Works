
public class DueDate {
 
	private int day;
	private int month;
	private int year;
	
	DueDate(int d, int m, int y){
		day = d;
		month = m;
		year = y;
	}
	public int Getday() {
	return day;	
	}
	public int Getmonth() {
		return month;	
		}
	public int Getyear() {
		return year;	
		}
	public boolean Equals(DueDate m) {
		if(m.day == day && m.month == month && m.year == year) {
			return true;
		}
		return false;
	}
}

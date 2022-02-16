package c1711022;

public class Resident {
    
	private String name;
	private String lastname;
	
	Resident() {
		name = "";
		lastname = "";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public void PrintResident()
	{
		System.out.println("Name " + name);
		System.out.println("Lastname :" + lastname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

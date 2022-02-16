import java.util.Scanner;

public class Person {
	private String name;
	private int id;

	public Person (String name, int id){
	this.name = name;
	this.id = id;
	}
	public int getId() {
		return id;
	}
	public static void main(String[] args) {
				
		Scanner s = new Scanner(System.in);
		int x = 0;
		System.out.print("Number of Employees that you want to add: ");
		x = s.nextInt();
		Employee [] Emp = new Employee[x];
		for (int i = 0; i < x ; i++) {
			System.out.print("Enter name and id and role: ");
			
			Emp[i] = new Employee(s.next(),s.nextInt(),s.next());
		}
		
		
		System.out.print("Number of Customer  that you want to add: ");
		x = s.nextInt();
		Customer [] Cst = new Customer[x];
		for (int i = 0; i < x ; i++) {
			System.out.print("Enter name and id");
			
			Cst[i] = new Customer(s.next(),s.nextInt());
		}
		
		
		
		
		
		System.out.print("Enter how many tasks to get done:  ");
		x = s.nextInt();
		Task [] tsk = new Task[x];
		
		int cost;
		String k;
		boolean cont;
		for (int i = 0; i < x ; i++) {
			System.out.print("DueDate");
			DueDate dt = new DueDate(s.nextInt(),s.nextInt(),s.nextInt());
			System.out.print("Cost : ");
			cost = s.nextInt();
			System.out.print("Finished : ");
			k = s.next();
			if(k == "false") {
				cont = false;
			}
			else 
			cont = true;
;			tsk[i] = new Task(dt,cost,cont);
		}
		
		  int temp1;
		  int temp2;
		  int temp3;
		for (int i = 0; i < Emp.length ; i++) {
			System.out.print("Choose employee id to assign task " + i + "and customer id:");
			temp1 = s.nextInt();
			temp2 = s.nextInt();

			for(int y = 0 ; y <= Cst.length ; y++) {
				if(temp2 == Cst[y].getId()) {
					for(int l = 0 ; l <= Emp.length ; l++) {
						if(temp1 == Emp[l].getId()) {
							Cst[y].requestJob(Emp[l], tsk[i]);
						}
					} 
				}
				
			}
			
		}
		s.close();
	}
}


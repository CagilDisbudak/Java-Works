
public class Customer extends Person{
	public Customer(String name, int id){
		super(name, id);
		}

		public void requestJob (Employee a, Task t)
		{
            a.addTask(t);
		}
}

package c1711022;

public class Home {
    private Room room1;
    private Room room2;
    private Resident person;
    private int totalm2;
    
    Home(){
    	
    	person = new Resident();
    	room1 = new Room();
    	room2 = new Room();
    }
    Home(Home obj){
    	this.person = obj.person;
    	this.room1 = obj.room1;
    	this.room2 = obj.room2;
    	this.totalm2 = obj.totalm2;	
    }
    
   void AddResident(Resident person) 
   {
	   if(this.person.getName() == "")
	   {
			 this.person.setName(person.getName());
			 this.person.setLastname(person.getLastname());

	   }

   }
   public int getTotalm2() 
    {
       return (totalm2);	
    }
   public void calculateTotalM2() {
    	totalm2 = room1.getM2() + room2.getM2();
    }
    
	public static void main(String[] args) {

						     
	}

}

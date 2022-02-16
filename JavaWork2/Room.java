package c1711022;


public class Room {
     private int m2;
     private String balcony;
      
	public int getM2() {
		return m2;
	}



	public void setM2(int m2) {
		this.m2 = m2;
	}



	public String getBalcony() {
		return balcony;
	}



	public void setBalcony(String balcony) {
		this.balcony = balcony;
	}
    
	public void printRoom()	{
		System.out.println("M^2 : " + m2);
		System.out.println("Balcony :" + balcony);
		
	}
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

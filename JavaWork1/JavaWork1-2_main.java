package c1711022;

import java.util.Scanner;

public class c1711022_question2_main {

	public static void main(String[] args) {

		
		c1711022_question2_vehicle vehicle = new c1711022_question2_vehicle();
		Scanner myObj = new Scanner(System.in);

		System.out.print(" Enter vehicle type, time entering parking lot, time leaving parking lot: ");		
        vehicle.Type = myObj.next().charAt(0);
        vehicle.entertime = myObj.nextDouble();
        vehicle.leavetime = myObj.nextDouble();

         double kalan;  		
		if(vehicle.Type == 'C') {
			
			kalan = vehicle.leavetime - vehicle.entertime;
			if(kalan > 3.0) {
				kalan = kalan - 3;
				vehicle.price = kalan * 1.5;
			}
			
			
		}
		else if(vehicle.Type == 'B') {
			
			kalan = vehicle.leavetime - vehicle.entertime;
            
			if(kalan - 2 > 2.0) {
				
				vehicle.price = 2;
				kalan = kalan - 2;
				vehicle.price =  vehicle.price + kalan * 2.3;
			}
			else if (kalan - 2 < 2.0) {
				
				vehicle.price =  kalan * 1.0;
			}
			
			
			
		}
		
		System.out.print(vehicle.toString());	
		
		
	

	}

}

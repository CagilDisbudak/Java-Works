package c1711022;

import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class c1711022_question3 {

	public static void main(String[] args) {

		String klme;
        int sum = 0;
		System.out.print("Enter your letters : ");		
		Scanner myObj = new Scanner(System.in);
		klme = myObj.nextLine();
		char temp;
		System.out.print("Result : ");		

		for (int j = 0; j < klme.length();) {
           temp = klme.charAt(j);
            
			for (int i = j ; i < klme.length(); i++) {
				
				if(klme.charAt(i) == temp)
				{
					sum++;
				}
				else if (klme.charAt(i) != temp)
				{
					break;
				}
				
			}
			j = j + sum;
			System.out.print(sum + " ");
			sum = 0;
				

		}
		myObj.close();
	}

}

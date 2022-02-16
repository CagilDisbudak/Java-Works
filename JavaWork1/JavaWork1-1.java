package c1711022;

import java.util.Scanner;

public class c1711022_question1 {

	public static void main(String[] args) {
		
		String wch;
		Scanner myObj = new Scanner(System.in);
		Scanner get = new Scanner(System.in);

		System.out.print(" Left to Rigth For(L) or Rigth to Left for (R) : ");		
		wch = get.next();
		
		int []arr = new int[10];


		for(int i = 0; i < 10 ; i++){
		arr[i]= myObj.nextInt();
		}
		
		int i = 0;			
		if(wch.equals("L")) 
		{
		
			for(int k = i+1 ; k < 10 ; k++)
			{
			arr[k] = arr[i] + arr[k];
			i++;
			}


			for(i = 0; i < 10 ; i++)
			System.out.print(" " + arr[i]);
		}
		else if(wch.equals("R"))
		{
			for(int k = 8 ; k >= 0 ; k--)
			{
			arr[k] = arr[k+1] + arr[k];

			}

			for(i = 0; i < 10 ; i++)
			System.out.print(" " + arr[i]);
			
			
			
		}
     
		myObj.close();
        get.close();
	}

}

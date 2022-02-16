import java.util.EmptyStackException;
import java.util.Scanner;

public class Calculator {
     
     private int []arr1;
     private int []arr2;
     private int length;
     public Calculator(int a) {
    	 length = a;
    	 arr1 = new int [length]; 
    	 arr2 = new int [length];
    	 
     }
	public static void Calculate(Calculator obj, char c) 
{
		int number;
		Scanner scan = new Scanner(System.in);
	
		if(obj.arr1.length != obj.arr2.length ) {
			throw new EmptyStackException();
		}
		

		System.out.println("Choose Operation : ");
		
	
	 if(c == '+')
	{
		for(int i = 0; i<= obj.arr1.length ; i++ )
		{
			number = obj.arr1[i] + obj.arr2[i];
			System.out.print(number + " " );
		}
	}
	else if(c == '-')
	{
		for(int i = 0; i<= obj.arr1.length ; i++ )
		{
			number = obj.arr1[i] - obj.arr2[i];
			System.out.print(number + " " );
		}
	}
	else if(c == '*')
	{
		for(int i = 0; i<= obj.arr1.length ; i++ )
		{
			number = obj.arr1[i] * obj.arr2[i];
			System.out.print(number + " " );
		}
	}
	else if(c == '/')
	{
		for(int i = 0; i<= obj.arr1.length ; i++ )
		{
		try {
			number = obj.arr1[i] / obj.arr2[i];
			System.out.print(number + " ");
		}
		catch(ArithmeticException e)
		{
			number = obj.arr1[i];
		}
		}
	}
			
   
	scan.close();	
}
	


	
	
	public static void inputArr1(Calculator obj) {	
		
        Scanner sc = new Scanner(System.in);
        int number;
        int leng;
		
        System.out.print("Length : ");
        leng = sc.nextInt();
         
        
        for (int i = 0; i <+ leng; i++)
            
     {
		try {			
			number = sc.nextInt() ;//Integer.parseInt(sc.next());
			obj.arr1[i] = number;
        }
		 catch (NumberFormatException e) {
			 
             // Print the message if exception occured
             System.out.println("NumberFormatException occured");
         }
		catch (IndexOutOfBoundsException e) {
            System.out.println("\nException caught Out Of Bounds");
        }
		
     }
		sc.close();

	}
	
	
	
	public static void inputArr2(Calculator obj) {
    	
	   	 Scanner s = new Scanner(System.in);
	        int number;
	        int lengt;
			
	        System.out.print("Length : ");
	        lengt = s.nextInt();
	         
	        
	        for (int i = 0; i <= lengt; i++)
	            
	     {
			try {			
				number = Integer.parseInt(s.next());
				obj.arr2[i] = number;
	        }
			 catch (NumberFormatException e) {
				 
	             // Print the message if exception occured
	             System.out.println("NumberFormatException occured");
	         }
			catch (IndexOutOfBoundsException e) {
	            System.out.println("\nException caught Out Of Bounds");
	        }
			
	     }
			s.close();
			
			
			
		}
	
	
	
	
	

    
    
    
    
    
    
    
    
    
    
	public int[] getArr1() {
		return arr1;
	}
	public void setArr1(int[] arr1) {
		this.arr1 = arr1;
	}
	public int[] getArr2() {
		return arr2;
	}
	public void setArr2(int[] arr2) {
		this.arr2 = arr2;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
	
		
		
		Calculator a = new Calculator(4) ;
		
		
		Scanner c = new Scanner(System.in);
		inputArr1(a);
	//	inputArr2(a);
		String str;
		    for(;;) 
           {
		    	System.out.print("Choose Opertion : ");
		    	str = c.nextLine();
		    	if(str == "exit") 
		    	{
		    		break;
		        }
		      Calculate(a,str.charAt(0));
		
           }	
		    c.close();
	}

}

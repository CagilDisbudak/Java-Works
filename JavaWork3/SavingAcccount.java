import java.util.Scanner;

public class SavingAcccount extends BankAccount {

private double interestRate;
	
	public void addInterest()
	{    
		System.out.println("Interest value for SavingAccount");
		Scanner x = new Scanner(System.in);	
		double xy = x.nextDouble();
		interestRate = xy;
		x.close();
	}
}

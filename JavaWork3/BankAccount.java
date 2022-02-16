import java.util.Scanner;
public class BankAccount {
   
	private double balance;
	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
    
	BankAccount(){
		balance = 0.0;
	}
    
	BankAccount(double mny){
		balance = mny ;
	}
    public void withdraw(double mny) {
    
    System.out.println("Balance : " + getBalance());  
    
    setBalance(getBalance() - mny);
     
    System.out.println("Balance : " + getBalance());  
    }
    public void deposit(double mny) {
    	System.out.println("Balance : " + getBalance());  
        
        setBalance(getBalance() + mny);
         
        System.out.println("Balance : " + getBalance());  
    	
    }
    public void transfer(double mny, BankAccount act) {
    	setBalance(getBalance() - mny);
    	act.setBalance(act.getBalance() + mny);
    }

    
    
    
	public static void main(String[] args) {
	SavingAcccount [] Acc = new SavingAcccount[2];
	Acc[0] = new SavingAcccount();
	Acc[1] = new SavingAcccount();
	CheckingAccount Chck1 = new CheckingAccount(500);
	Scanner myObj = new Scanner(System.in);	
	int x;
for(;;) {
	System.out.println("Choose operation: ");
	System.out.print("1-deposit 2-withdraw 3-transfer 4-exit: ");
	x = myObj.nextInt();
	if(x == 1) {	
		System.out.print("Enter the Account type and number to deposit money from: ");
		 String Type = myObj.next();  
			System.out.print("Enter amount of money to deposit:  ");
			Double Number1 = myObj.nextDouble();
	      if(Type.charAt(0) == 's')
	      {
	          Acc[Integer.valueOf(Type.charAt(1))].deposit(Number1);

	      }
	      else if(Type.charAt(0) == 'c') {
	    	  Chck1.deposit(Number1);
	      }
		
		
	}
	
	else if(x == 2) {
		System.out.print("Enter the Account type and number to withdraw money from: ");
		  String Type = myObj.next();  
			System.out.print("Enter amount of money to withdraw:  ");
			Double Number1 = myObj.nextDouble();
	      if(Type.charAt(0) == 's')
	      {
	          Acc[Integer.valueOf(Type.charAt(1))].withdraw(Number1);

	      }
	      else if(Type.charAt(0) == 'c') {
	    	  Chck1.withdraw(Number1);
	      }
		
	}
	
	else if(x == 3) {
		
	      System.out.print("Enter the Account type and number to transfer money from: ");
		  String Type = myObj.next();  
		  System.out.print("Enter the Account type and number to transfer : ");
		  String Type1 = myObj.next();
	      System.out.print("Enter amount of money to transfer:");
	      int tut = myObj.nextInt();
	      if(Type.charAt(0) == 's')
	      {
	          Acc[Type.charAt(1)].transfer(tut, Chck1);

	      }
	      //Integer.valueOf(Type.charAt(1))
	      else if(Type.charAt(0) == 'c') {
	    	  Chck1.deductFees();
	    
	    	  Chck1.transfer(tut, Acc[Integer.valueOf("" + Type1.charAt(1))]);
	      }
	
	}
	
	else if(x == 4) {
		
		
		System.out.println("Saving 1 = " + Acc[0].getBalance());
		System.out.println("Saving 2 = " + Acc[1].getBalance());
		System.out.println("Check A. = " + Chck1.getBalance());
	
		break;
	}
	
  }
myObj.close();
 }

	
	
		
}






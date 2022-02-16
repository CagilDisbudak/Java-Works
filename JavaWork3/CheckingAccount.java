
public class CheckingAccount extends BankAccount{
	
	private static final int FREE_TRANSACTIONS = 1;
	private static final int   TRANSACTION_FEE = 3;
	private int transactionCount;
	CheckingAccount(double mny) {
		super(mny);
	}
	
	public void deductFees() {
    int  last = TRANSACTION_FEE * (transactionCount - FREE_TRANSACTIONS);
    super.setBalance(super.getBalance() - last);    
	}
	
	@Override
	  public void withdraw(double mny) {
	    
	    System.out.println("Balance : " + super.getBalance());  
	    
	    setBalance(getBalance() - mny);
	     
	    System.out.println("Balance : " + getBalance());  
	    }
	
	@Override
	public void deposit(double mny) {
    	System.out.println("Balance : " + getBalance());  
       
        setBalance(getBalance() + mny);
         
        System.out.println("Balance : " + getBalance());  
    	
    }
	
} 
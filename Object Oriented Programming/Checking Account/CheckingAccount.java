package lab;

public class CheckingAccount extends BankAccount {
	
	public int transactionCount;
	
	public CheckingAccount()
	{
		super();
		transactionCount = 0;
	}
	
	public CheckingAccount (double initBalance)
	{
		super(initBalance);
		transactionCount = 0;
		
	}
	
	public void deductFees()
	{
		double total = 0;
		if(transactionCount > 3)
		{
			total = (transactionCount - 3)*2.0;
			super.withdraw(total);
		}
		transactionCount = 0;
	}
	
	public void deposit(double amount)
	{
		super.deposit(amount);
		transactionCount++;
	}
	public void withdraw(double amount)
	{
		super.withdraw(amount);
		transactionCount++;
	}
	


}

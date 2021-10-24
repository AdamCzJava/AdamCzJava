package Lab3;

public class SavingsAccount {

	private static int SavingsAccount = 0;
	private int savingAccountNumber;
	private static double annualInterestRate = 0.0;
	private double savingsBalance;
	private double balanceOfTheAccount;
	
	public SavingsAccount ()
	{
		SavingsAccount ++;
		savingAccountNumber = SavingsAccount;
		setsavingsBalance(0.0);
	}
	public void setsavingsBalance(double save)
	{
		savingsBalance = save;
	}
	public double getsavingsBalance ()
	{
		
		return  savingsBalance ;
	}
	public void calculateMonthlyInterest() 
	{
		double interest;
		interest = (savingsBalance * annualInterestRate) / 12;
		savingsBalance += interest;
	}
	public static int getSavingsAccount() 
	{
		return SavingsAccount;
	}
	public int getsavingAccountNum ()
	{
		return savingAccountNumber;
	}
	public static double getannualInterestRate ()
	{
		return annualInterestRate;
	}
	public double getbalanceOfTheAccount ()
	{
		return balanceOfTheAccount;
	}
	public void setannualInterestRate (double rate)
	{
		annualInterestRate = rate;
	}
		
}

package Lab3;
import java.util.ArrayList;
public class BankCustomer {

	private String name;
	private String address;
	private ArrayList<SavingsAccount> accounts;
	private int numberOfTheAccounts;
	

	public BankCustomer (String firstName, String currentAddress )
	{
		setname(firstName);
		setaddress(currentAddress);
        accounts = new ArrayList<SavingsAccount>();
        numberOfTheAccounts = 0;
	}
	public void setname (String firstName)
	{
		name =  firstName;
	}
	public void setaddress (String currentAddress)
	{
		address = currentAddress;
	}
	public String getname ()
	{
		return name;
	}
	public String getaddress ()
	{
		return address;
	}
	public void addAccount ( SavingsAccount imput )
	{
		
		if( numberOfTheAccounts < 3 ) 
		{
			accounts.add(imput);
			numberOfTheAccounts++;
		}
		else
			{
				System.out.println("The number of the bank accounts is not valid");
			}
	}
	public double balance ()
	{
		double store = 0.0;
		int i;
		for(i = 0; i < accounts.size();i++)
		{
			store = accounts.get(i).getsavingsBalance() + store;
			
		}
		return store;
	}
	public  String toString() 
	{
		int i;
		String result="";
		 for(i= 0 ; i < accounts.size(); i++)
		 {
			
		 result += "\nThe name of the account " + accounts.get(i).getsavingAccountNum();
		 result += "\nThe balance of the accounts " + accounts.get(i).getsavingsBalance();
		 }
		 return result;
	}

}
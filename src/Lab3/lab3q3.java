package Lab3;
public class lab3q3 {

	public static void main(String[] args) {
		
		BankCustomer cus1 = new BankCustomer ("Adam","Portlaoise");
		BankCustomer cus2 = new BankCustomer ("Tom","Carlow");
		
		
		SavingsAccount acoun1 = new SavingsAccount ();
		SavingsAccount acoun2 = new SavingsAccount ();
		SavingsAccount acoun3 = new SavingsAccount ();
		
		
		cus1.addAccount(acoun1);
		cus1.addAccount(acoun2);
		cus1.addAccount(acoun3);
		
		
		acoun1.setsavingsBalance(2000);
		acoun2.setsavingsBalance(3000);
		acoun3.setsavingsBalance(5000);
		System.out.println(cus1.balance());
		System.out.println(cus1.toString());
		
		System.out.println("--------------------------");
		
		cus2.addAccount(acoun1);
		cus2.addAccount(acoun2);
		cus2.addAccount(acoun3);
		
		
		acoun1.setsavingsBalance(2000);
		acoun2.setsavingsBalance(2000);
		acoun3.setsavingsBalance(5000);
		System.out.println(cus2.balance());
		System.out.println(cus2.toString());
	}

}

package Lab3;

public class lab3aq2{

		public static void main(String[] args) {
			
			SavingsAccount saver1 = new SavingsAccount ();
			SavingsAccount saver2 = new SavingsAccount ();
			saver1.setsavingsBalance(2000.0);
			saver2.setsavingsBalance(3000.0);

			System.out.println(" The account number " + saver1.getsavingAccountNum() + " has a balance " + saver1.getsavingsBalance());
			System.out.println(" The account number " + saver2.getsavingAccountNum() + " has a balance " + saver2.getsavingsBalance());
			saver1.setannualInterestRate(0.04);
			saver2.setannualInterestRate(0.05);
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
			System.out.println(" The account number " + saver1.getsavingAccountNum() + " has a balance " + saver1.getsavingsBalance());
			System.out.println(" The account number " + saver2.getsavingAccountNum() + " has a balance " + saver2.getsavingsBalance());
		}

	}


package lab4;

public class SavingAccount extends Account
{
	 public SavingAccount(long accNum, double balance, Person accHolder) {
			super(accNum, balance, accHolder);
			// TODO Auto-generated constructor stub
		}

		final double MIN_BALANCE=1000;
		 
		//-----------methods-------

		@Override
		public void withdraw(double amount) {
			//System.out.println("-------------------------");
			//super.withdraw(amount);
			//System.out.println(getBalance());
			if(super.getBalance()>MIN_BALANCE)
			{ //System.out.println("inside savings");
				super.withdraw(amount);
				System.out.println("Balance is: "+super.getBalance());
			}
			else
			{
				System.out.println("Cannot withdraw. Low Minimum Balance");
			}
		
		}
		
	}




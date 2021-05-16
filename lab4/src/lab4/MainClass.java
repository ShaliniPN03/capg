package lab4;

public class MainClass
{
	public static void main(String[] args) {
		int sAccNum=101;
		int cAccNum=101;
		MainClass app=new MainClass();
		
		System.out.println("-----smith account--------");
		Person smith=new Person();
		smith.setAge(20f);
		Account acc=new Account(sAccNum++, 2000, smith);
		app.doBankOperations(acc);
		
		System.out.println("---------kathy savings account--------");
		Person kathy=new Person();
		kathy.setAge(30f);
		SavingAccount savings=new SavingAccount(sAccNum++, 3000, kathy);
		app.doBankOperations(savings);
		
		System.out.println("---------kathy current account--------");
		//Person kathy=new Person();
		kathy.setAge(30f);
		CurrentAccount current=new CurrentAccount(cAccNum++, 3000, kathy);
		app.doBankOperations(current);
		app.doBankOperations(current);
		
		
	
		
		
	}
	
	public void doBankOperations(Account a)
	{
		if( a instanceof SavingAccount) {
			SavingAccount savings = (SavingAccount) a;
			savings.withdraw(2000);
			
		}
		
		else if(a instanceof CurrentAccount) {
			CurrentAccount current = (CurrentAccount) a;
			current.withdraw(2000);
		}
		
		else
		{
			a.deposit(2000);
			System.out.println("Updated balance:  "+a.getBalanceMethod());
		}
	


		
	}

}

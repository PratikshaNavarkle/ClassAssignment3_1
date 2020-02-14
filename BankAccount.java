//BankAccount,TestBAnkAccount,NagativeAmountException,InsufficientFunds

public class BankAccount
{
	int accNo;
	String custName;
	String accType;
	float balance;
	float sum=0;
	float sub=0;

	public BankAccount(int accNo, String custName, String accType, float balance) {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		this.balance = balance;
	}

	float deposite(float amt)
	{
		if(amt<0)
		{
			try
			{
				throw new NegativeAmountException();
			}
			catch(NegativeAmountException e)
			{
				System.out.println(e);
			}
		}
		else
		{

			sum=balance+amt;
		}
		return sum;
	}

	/*void withdraw(float amt)
	{
		if(accType=="savings" && balance<1000)
		{
			try
			{
				throw new InsufficientFundsException();
			}
			catch(InsufficientFundsException e)
			{
				System.out.println(e);
			}
		}

		else if(accType=="current" && balance<5000)
		{
			try
			{
				throw new InsufficientFundsException();
			}
			catch(InsufficientFundsException e)
			{
				System.out.println(e);
			}
		}

		else if(amt<0)
		{
			try
			{
				throw new NegativeAmountException();
			}
			catch(NegativeAmountException e)
			{
				System.out.println(e);
			}
		}

		else
		{
			
			sub=balance-amt;
			System.out.println("Withdrawal is sucessful");
			System.out.println("Available Account balance after withdrawal is:"+sub);
		}
		//return sub;
	}*/
	
	 float withdraw(float amt) throws Exception
	{
		//try
		//{
			if(accType.equals("current") && balance<5000 || accType.equals("savings") && balance<1000)
		
		 {
				try
				{
					throw new InsufficientFundsException();
				}
				catch(InsufficientFundsException e)
				{
					System.out.println(e);
					throw e;
				}
				/*if(amt<0)
				{
					try
					{
					throw new NegativeAmountException();
					}
					catch(NegativeAmountException e)
					{
						System.out.println(e);
						throw e;
					}
				}*/
				
			}
			else
			{
				sub=balance-amt;
				//System.out.println("Withdraw is successful");
				//System.out.println("After withdrawal balance is"+sub);
				
			}
			return sub;
			
		}


	/*	catch(Exception e)
		{
			System.out.println(""+e);
		}*/

	



	public float getBalance() 
	{
		return balance;
	}


}

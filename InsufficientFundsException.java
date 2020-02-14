//BankAccount,TestBAnkAccount,NagativeAmountException,InsufficientFunds
public class InsufficientFundsException extends Exception 
{
	public String toString()
	{
		return "Balance is insufficient";
	}
}

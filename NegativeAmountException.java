//BankAccount,TestBAnkAccount,NagativeAmountException,InsufficientFunds

public class NegativeAmountException extends Exception
{
	public String toString()
	{
		return "Amount is negative";
	}
}

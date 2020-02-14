//BankAccount,TestBAnkAccount,NagativeAmountException,InsufficientFunds

import java.util.*;
public class TestBankAccount
{
	public static void main(String[] args)
	{
		int ch;
		float a=0;
		int amt=0;
		String type="";
		int bal=0;
		String name="";
		int acno=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your account number:");
		acno=sc.nextInt();
		System.out.println("Enter your name:");
		name=sc.next();
		System.out.println("Enter account type savings/current");
		type=sc.next();
		System.out.println("Enter Account balance");
		bal=sc.nextInt();
		do
		{
		
			BankAccount b=new BankAccount(acno,name,type,bal);
			System.out.println("1.Deposite  2.Withdraw  3.Balance");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter amount to deposite:");
				amt=sc.nextInt();
				a=b.deposite(amt);
				System.out.println("Deposite is Successful");
				System.out.println("After deposite balance is:"+b.sum);
				
			break;
			
			case 2:
				
				System.out.println("Enter amount to withdraw:");
				amt=sc.nextInt();
				try {
					
					a=b.withdraw(amt);
					System.out.println("amt"+amt);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Withdrawal is sucessful");
				System.out.println("Available Account balance after withdrawal is:"+b.sub);
				
			break;
			
			case 3:
				System.out.println("Account balance is:"+a);
				//System.out.println("Account balance is:"+b.getBalance());
				
			break;
			}
			System.out.println("Do you want to continue? If yes, press 1");
			ch=sc.nextInt();
			
		}while(ch==1);
	}
}

//CalculateAverage,IllegalArgument

import java.util.*;
public class CalcAverage
{
	public static double avgFirstN() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=0;
		int sum=0;
		float avg=0;

		System.out.println("Enter any number");
		n=sc.nextInt();
		try
		{
			if(n<=0)
			{
				throw new IllegalArgumentException();
			}
			else
			{
				for(int i=0;i<=n;i++)
				{
					sum=sum+i;
				}
				avg=sum/n;
				System.out.println("Average of " +n+ " values:"+avg);
			}

		}

		catch(IllegalArgumentException e)
		{
			System.out.println(e);
			throw e;
		}
		return avg;

	}
	
	public static void main(String[] args)
	{
		
		System.out.println("WELCOME!!!");
		try
		{
		avgFirstN();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		System.out.println("Thank You...");
	}
}

//Number,TestNumber,DivideByzeroException

public class Number
{

	int firstNumber;
	int secondNumber;
	double result;
	public Number(int firstNumber, int secondNumber)
	{
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	public double add()
	{
		result=firstNumber+secondNumber;
		System.out.println("Result of Addition is:"+result);
		return result;
	}
	
	public double sub()
	{
		result=firstNumber-secondNumber;
		return result;
	}
	
	public double mul()
	{
		result=firstNumber*secondNumber;
		return result;
	}
	
	public double div()
	{
		try
		{
		if(firstNumber==0 || secondNumber==0)
		{
			throw new DivideByZeoException();
		}
		else
		result=firstNumber/secondNumber;
		System.out.println("Result of Division is:"+result);
		return result;
		}
		catch(Exception e)
		{
			System.out.println(""+e);
		}
		return result;
	}
	
}

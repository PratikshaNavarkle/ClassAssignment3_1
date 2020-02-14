//Emp,TestEmp,LowSalException

public class LowSalException extends Exception 
{
	public String toString()
	{
		return "Salary is below 500 rs";
	}
}

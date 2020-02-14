//Emp,TestEmp,LowSalException
public class Emp 
{
	int empId;
	String empName;
	String designation;
	double basic;
	double hra;
	
	public Emp(int empId,String empName,String designation,double basic)
	{
		this.empId=empId;
		this.empName=empName;
		this.designation=designation;
		this.basic=basic;
	}
	
	public void printDET()
	{
		System.out.println("Employee id is:"+empId);
		System.out.println("Employee name is:"+empName);
		System.out.println("Employee designation is:"+designation);
		System.out.println("Employee basic salary is is:"+basic);
		System.out.println("Employee HRA salary is:"+hra);
		
	}
	
	public  double calculateHRA()
	{
		if(basic<500)
		{
			try
			{
				throw new LowSalException();
			}
			catch(LowSalException e)
			{
				System.out.println(e);
			}
		}
		else if(designation.equalsIgnoreCase("Manager"))
		{
			hra=basic+(basic/100*10);
			printDET();
		//	System.out.println(hra);

		}
		
		else if(designation.equalsIgnoreCase("Officer"))
		{
			hra=basic+(basic/100*12);
			printDET();
			//System.out.println(hra);

		}
		
		else if(designation.equalsIgnoreCase("Clerk"))
		{
			hra=basic+(basic/100*5);
			printDET();
			//System.out.println(hra);
		}
		else
			System.out.println("Invalid designation");
				return hra;
	}
}

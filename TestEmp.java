//Emp,TestEmp,LowSalException

import java.util.*;
public class TestEmp 
{
	public static void main(String[] args)
	{
		int empId;
		String empName;
		String designation;
		double basic;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee Id:");
		empId=sc.nextInt();
		System.out.println("Enter employee Name:");
		empName=sc.next();
		System.out.println("Enter employee Designation:");
		designation=sc.next();
		System.out.println("Enter employee basic salary:");
		basic=sc.nextInt();
		
		Emp e=new Emp(empId,empName,designation,basic);
		e.calculateHRA();
	}
}

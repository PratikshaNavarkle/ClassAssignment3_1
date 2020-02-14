//userTrail,TestUserTrail,IllegalValueException

import java.util.Scanner;

public class TestUserTrail 
{

	public static void main(String[] args)
	{
		int v1,v2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values of v1 and v2");
		v1=sc.nextInt();
		v2=sc.nextInt();
		
		UserTrail u=new UserTrail(v1,v2);
		u.show();
	}

}

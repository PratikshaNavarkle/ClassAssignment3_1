//userTrail,TestUserTrail,IllegalValueException

import java.util.*;
public class UserTrail 

{
	int val1=0;
	int val2=0;



	public UserTrail(int val1, int val2) {
		super();
		this.val1 = val1;
		this.val2 = val2;
	}



	public boolean show()
	{
		//boolean b1=true;
		//boolean b2=false;

		if(val1<0 && val2<0)
		{
			try{
				throw new IllegalValueException();}
			catch(IllegalValueException e)
			{
				System.out.println(e);
			}
			return false;
		}
		//else
		System.out.println("true");
		return true;


	}
}

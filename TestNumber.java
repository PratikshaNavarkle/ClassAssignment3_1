//Number,TestNumber,DivideByzeroException

import java.util.*;

public class TestNumber {

	public static void main(String[] args)
	{
		int a=0;
		int b=0;
		
		
		Scanner sc=new Scanner(System.in);
		int ch=0;
		
		do
		{
			System.out.println("1. Addition  2.Subtraction  3.Multiplication  4.Division");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			
			System.out.println("Enter 2 numbers:");
			a=sc.nextInt();
			b=sc.nextInt();
			Number n=new Number(a,b);
			switch(ch)
			{
			case 1:
				n.add();
				//System.out.println("Result of addition is:"+n.result);
				break;
				
			case 2:
				n.sub();
				System.out.println("Result of Subtraction is:"+n.result);
				break;
				
			case 3:
				n.mul();
				System.out.println("Result of multiplication is:"+n.result);
				break;
				
			case 4:
				n.div();
				//System.out.println("Result of Division is:"+n.result);

}
			System.out.println("Do you want to continue if yess press 1");
			ch=sc.nextInt();
		}while(ch==1);

	}

}

package pack1;
import java.util.*;
public class Cal {
	
		
		 int add(int a,int b)
		{
			return a+b;
		}
		 int sub(int a,int b)
		{
			return a-b;
		}
		 int div(int a,int b)
		{
			return a/b;
		}
		 int mul(int a,int b)
			{
				return a*b;
			}
		
	    public static void main(String args[])
	    {
	    	Scanner sc=new Scanner(System.in);
	    	Cal c=new Cal();
	    	int a,b;
	    	System.out.println("enter 2 integers");
	    	a=sc.nextInt();
	    	b=sc.nextInt();
	    	System.out.println("enter the operator u want to calulate");
	        char ch = sc.next().charAt(0); 
	    	if(ch=='+')
	    	{
		    	System.out.println("ADDITION: "+c.add(a,b));

	    	}
	    	else if(ch=='-')
	    	{
		    	System.out.println("SUBTRACTION: "+c.sub(a,b));

	    	}
	    	else if(ch=='/')
	    	{
		    	System.out.println("DIVISION: "+c.div(a,b));

	    	}
	    	else if (ch=='*')
	    	{
		    	System.out.println("MULTIPLICATION: "+c.mul(a,b));

	    	}
	    	else
	    	{
		    	System.out.println("enter another operator");

	    	}	

	    }
	    

	}

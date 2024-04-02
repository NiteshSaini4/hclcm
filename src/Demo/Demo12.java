package Demo;

import java.io.FileInputStream;

public class Demo12 
{
	public static void main(String[] args) 
	{
		int age=16;
		try
		{
			if(age<18)
			{
				throw new StudentAgeException("you are not e for v");//jvm
			}
			else
			{
				System.out.println("you are  eligibl for vote");
			}
		}
		catch(StudentAgeException e)
		{
			e.printStackTrace();
		}
		System.out.println("rest of the code");
		
	}

}



 
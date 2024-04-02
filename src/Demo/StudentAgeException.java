package Demo;

public class StudentAgeException extends RuntimeException
{
	public StudentAgeException(String s1)
	{
		super(s1);//"you are not e for v"
	}

}
//throw.......keywords
//  new StudentAgeException("you are not e for v")
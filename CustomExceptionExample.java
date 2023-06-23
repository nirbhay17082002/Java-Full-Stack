class InvalidAgeException extends Exception
{
	String exceptionmessage="Invalid Age Exception";
	public InvalidAgeException(String msg)
	{
		super(msg);
	}
}

public class CustomExceptionExample
{
	public void ageValidate(int age)throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Invalid Age");
		}
		else
		{
			System.out.println("Welcome for Vote..");
		}
	}
	public static void main(String[] args)throws InvalidAgeException
	{
		CustomExceptionExample cee=new CustomExceptionExample();
		cee.ageValidate(15);
	}
}
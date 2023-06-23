public class ThrowKeywordExample
{
	public void validateAge(int age)
	{
		try
		{
			if(age<18)
			{
				throw new NullPointerException("Invalid Age");
			}
			else
			{
				System.out.println("Welcome to voter List");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args)
	{
		ThrowKeywordExample tke=new ThrowKeywordExample();
		tke.validateAge(15);
	}
}
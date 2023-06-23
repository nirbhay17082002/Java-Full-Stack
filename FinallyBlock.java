public class FinallyBlock
{
	public static void main(String[] args)
	{
		try
		{
			int a=5;
			int b=0;
			int res=a/b;
			System.out.println("Hello Try block.");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e);
			System.out.println(e
		}
		finally
		{
			System.out.println("Hello finally block.");//atleast finally block will be executed. It doesn't depend on try and catch.
		}
	}
}
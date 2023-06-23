public class MultipleCatchExample
{
	public static void main(String[] args)
	{
		try
		{
			String str=null;
			int len=str.length();//NullPointerException
			
			int a=5;
			int b=0;
			int res=a/b;//ArithmaticException
			
			System.out.println("Hello try block.");
		}
		catch(NullPointerException np)
		{
			System.out.println("Catch block of Null Pointer invoked");
			System.out.println(np);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
			System.out.println("Catch block Arithmetic invoked");
		}
	}
}
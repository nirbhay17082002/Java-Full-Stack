class oddException extends Exception
{
	public oddException(String msg)
	{
		super(msg);
	}
}
public class OddEvenCheck
{
	public void oddvalidate(int n)throws oddException
	{
		if(n%2==0)
		{
			throw new oddException("not odd");
		}
		else
		{
			System.out.println("odd one");
		}
	}
	public static void main(String[] args)throws oddException
	{
		OddEvenCheck oec=new OddEvenCheck();
		oec.oddvalidate(26);
		oec.oddvalidate(37);
	}
}
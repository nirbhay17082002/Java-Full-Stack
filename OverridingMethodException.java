class Student
{
	void fun()
	{
		System.out.println("Parent is invoked");
	}
}

public class OverridingMethodException extends Student
{
	void fun()throws NullPointerException
	{
		System.out.println("Child is invoked");
	}
	
	public static void main(String[] args)
	{
		OverridingMethodException ovt=new OverridingMethodException();
		ovt.fun();
	}
}
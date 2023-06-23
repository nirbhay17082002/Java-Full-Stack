abstract class Printable 
{
	String university="LPU";
	Printable()
	{
		System.out.println("Default Consttructor in abstract class.");
	}
	abstract void message();
	public void cube(int num)
	{
		System.out.println("Cube of "+num+":"+(num*num*num));
	}
}
//public class AbstractClassExample extends Printable
public class AbstractClassExample
{
	/*public void message()//Overriding message() from abstract class Printable
	{
		System.out.println("Invoked Abstarct Method message()");
	}*/
	public static void main(String[] args)
	{
		//Printable p= new Printable();
		//p.cube(5);
		/*Printable p=new AbstractClassExample();
		p.cube(5);
		System.out.println("University Name :"+p.university);
		p.message();*/
		
		/*AbstractClassExample ace=new AbstractClassExample();
		ace.cube(6);
		System.out.println("University Name :"+ace.university);
		ace.message();*/
		
		Printable p=new Printable()
		{
			System.out.println("Anonymous method");
		};
		p.message();
	}
}
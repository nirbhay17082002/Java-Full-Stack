abstract class Vehicle
{
	abstract void changeGear();
	abstract void run();
	abstract void blowHorn();	
}

class Car extends Vehicle
{
	public void changeGear()
	{
		System.out.println("Change gear");
	}
	public void run()
	{
		System.out.println("Start Car");
	}
	public void blowHorn()
	{
		System.out.println("Blow Horn");
	}
}
class Bike extends Vehicle
{
	public void changeGear()
	{
		System.out.println("Change gear");
	}
	public void run()
	{
		System.out.println("Start Bike");
	}
	
	public void blowHorn()
	{
		System.out.println("Blow Horn");
	}
}


public class Test1
{
	public static void main(String[] args)
	{
		Vehicle v=new Car();
		 v.run();
		 v.blowHorn();
		 v.changeGear();

		v=new Bike();
		 v.run();
		 v.blowHorn();
		 v.changeGear();

	}
}
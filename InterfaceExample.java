interface Drawable
{
	int side=10;//static constanct data menber
	abstract void draw();
	void show();
}
class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("Draw Rectangle");
	}
	public void show()
	{
		System.out.println("Show Rectangle");
	}
}
public class InterfaceExample
{
	public static void main(String[] args)
	{
		Drawable d= new Rectangle();
		d.draw();
		d.show();
		System.out.println("Size :"+d.side);
	}
}
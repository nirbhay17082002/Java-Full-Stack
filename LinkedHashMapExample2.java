import java.util.*;
class Product
{
	int pid;
	String pname;
	double price;
	Product(int pid,String pname,double price)
	{
		this.pid=pid;
		this.pname=pname;
		this.price=price;
	}
}
public class LinkedHashMapExample2
{
	public LinkedHashMap<Integer,Product> getProductDetails(int noOfProduct)
	{
		LinkedHashMap<Integer,Product> lhm=new LinkedHashMap<>();
		Scanner input=new Scanner(System.in);
		for(int i=0;i<noOfProduct;i++)
		{
			System.out.println("Enter Product id:");
			int pid=input.nextInt();

			System.out.println("Enter Product Name:");
			input.nextLine();
			String pname=input.nextLine();

			System.out.println("Enter Product Price:");
			double price=input.nextDouble();

			Product p=new Product(pid,pname,price);
			lhm.put(pid,p);
		}
	return lhm;
	}
	public static void main(String[] args)
	{
		LinkedHashMapExample2 obj=new LinkedHashMapExample2();
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter number of product:");
		int numOfProduct=scan.nextInt();

		LinkedHashMap<Integer,Product> lhm=new LinkedHashMap<>();
		
		lhm=obj.getProductDetails(numOfProduct);

		for(Map.Entry m:lhm.entrySet())
		{
			int key=(int)m.getKey();
			Product p=(Product)m.getValue();
			System.out.println(key+" :"+p.pname+" ,Price :"+p.price);
		}
		
		
	}
}
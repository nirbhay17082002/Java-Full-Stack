import java.util.*;
public class LinkedHashMapExample
{
	public static void main(String[] args)
	{
		LinkedHashMap<Integer,String> ihm=new LinkedHashMap<>();
		ihm.put(1,"Apple");
		ihm.put(2,"Mango");
		ihm.put(3,"Banana");
		ihm.put(4,"Litchi");
		
		System.out.println(ihm);
		
		System.out.println("Only keys :"+ihm.keySet());
		System.out.println("Only values :"+ihm.values());
		System.out.println("Key and Value :"+ihm.entrySet());
		
		String replacedValue=ihm.replace(2,"Orange");
		System.out.println("After Replacement of mango to orange :"+ihm.entrySet());
		System.out.println("Replaced Value :"+replacedValue);
	}
}
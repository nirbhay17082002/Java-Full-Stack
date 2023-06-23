import java.util.*;
public class SortArrayList
{
	public static void main(String[] args)
	{
		Integer[] arr={20,10,4,45,67,86,65,43,642,354,543,556};
		ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(arr));
		System.out.println(list1);
		
		Collections.sort(list1);//sorting arraylist in ascending order
		System.out.println(list1);
		
		Iterator<Integer> it=list1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		
		System.out.println(list1);
		
		for(Integer ele:list1)
		{
			System.out.println(ele);
		}
		
		System.out.println("Printing data with ListIterator in inverse order:");
		ListIterator<Integer> itr=list1.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Printing data with ListIterator in reverse order:");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
		Collections.sort(list1);
		System.out.println("Printing data ascending order:");
		System.out.println(list1);
		
		Collections.reverse(list1);
		System.out.println("Printing data descending order:");
		System.out.println(list1);
		
		list1.set(1,100);
		System.out.println("Printing data adter modify the 543 to 100 :");
		System.out.println(list1);
	}
}
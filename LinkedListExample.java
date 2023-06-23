import java.util.*;
public class LinkedListExample
{
	public static void main(String[] args)
	{
		LinkedList<String> linkedlist1=new LinkedList<>();
		linkedlist1.add("Interview");
		linkedlist1.add("H");
		linkedlist1.add("aaj");
		linkedlist1.add("mera");
		linkedlist1.add("kya lgta");
		linkedlist1.add("h");
		linkedlist1.add("ho jaiga");
		linkedlist1.add("aree ho jaaiga");
		
		System.out.println("Liked List Data :");
		System.out.println(linkedlist1);
		
		linkedlist1.add(0,"ho");//add element at first position using index number
		System.out.println(linkedlist1);
		
		linkedlist1.addFirst("ready");//add element at first position in linkedlist
		System.out.println(linkedlist1);

		linkedlist1.addLast("Selected");//add element at last position using in linkedlist
		System.out.println(linkedlist1);
		
		ListIterator itr=linkedlist1.listIterator();
		System.out.println("Printing data in inverse order");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		Iterator<String> itr1=linkedlist1.descendingIterator();
		System.out.println("Printing data in reverse order");
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		//System.out.println("Printing data in reverse order");
		while(itr.hasNext())
		{
			StringBuilder sb=new StringBuilder();
			sb.append(itr.next());
			sb.reverse();
			itr.set(sb.toString());
		}
		
		System.out.println("Printing data in reverse order");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
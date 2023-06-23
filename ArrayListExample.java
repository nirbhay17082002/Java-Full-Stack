import java.util.*;
public class ArrayListExample
{
	public static void main(String[] args)
	{
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(10);
		
		System.out.println(list);
		//insert an element after 20
		list.add(3,50);
		System.out.println(list);
		
		//combine one list to another list this is known as union
		List<Integer> list2=new ArrayList<>();
		list2.add(100);
		list2.add(200);
		
		list2.addAll(list);
		System.out.println("After combined list2 :");
		System.out.println(list2);
		
		//find the intersection between list and list2
		list2.retainAll(list);
		System.out.println("After retainAll list2 :");
		System.out.println(list2);
		
		int lastElement=list2.get(list2.size()-1);
		System.out.println("Last element from list2 :"+lastElement);
		
		int firstElement=list2.get(0);
		System.out.println("first element from list2 :"+firstElement);
		
		int ele=list2.get(3);
		System.out.println("3 index's Element from list2 :"+ele);
		
		list2.remove(list2.size()-1);// t remove last element
		System.out.println(list2);
		
		list2.clear();
		System.out.println(list2);
	}
}
package test;

import java.util.ArrayList;
import java.util.Collections;

public class test2 {

	public static void main(String[] args) {

		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(9);
		ArrayList list2 = new ArrayList(list1.subList(1, 3));
		System.out.println(list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		System.out.println(list1);
		System.out.println(list2);
		
		
		System.out.println(list1.containsAll(list2));
	}

}

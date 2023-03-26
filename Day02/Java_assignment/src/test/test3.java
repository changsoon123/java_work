package test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class test3 {

	public static void main(String[] args) {

		Queue g = new LinkedList();
	
		
		int[] arr = {0,1,2,3,4};
		int[] arr2 = {10,11,12,13,14,5,6,7,8};
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		System.out.println(Arrays.toString(arr2));
		
		List list = Arrays.asList(new Integer[] {1,2,3,4,5});
		
	}

}

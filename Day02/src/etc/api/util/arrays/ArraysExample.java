package etc.api.util.arrays;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {

		/*
		 *  배열의 복사 
		 *  
		 *  
		 */
		
		char[] arr = {'J','A','V','A'};
		
		char[] arr2 = Arrays.copyOf(arr, arr.length);
		
		char[] arr3 = Arrays.copyOfRange(arr, 1, 3);
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		//배열의 탐색: binarySearch(배열, 검색할 값)
		//전제 조건: 반드시 정렬이 선행되어야 한다.
		
		int[] numbers = { 999,3,5,10202,1,11,2};
		System.out.println("5의 위치: " + Arrays.binarySearch(numbers, 1));
		//2진 탐색, 배열을 반으로 나눔. 배열의 길이부터 구함.
		
		//배열의 정렬
		int[] nums = {42, 11, 35, 88, 34, 100};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		//배열 내부 요소가 동일한지의 여부를 확인
		//arrays 자체 메서드. object것은 아님
		System.out.println(Arrays.equals(numbers, nums));
		
		
	}

}

package basic.array;

import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		int[][] arr2= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
		
//		int[][][] arr3 = {{{1,2,3},{4,5,6}},{{12,34,56},{78,91,23}},{{100,101,102},{103,104,105}}};
		
		/*
		 * 2차원 배열
		 * 배열 안에 배열이 존재하는 형태를 2차원 배열이라고 합니다.
		 * 실제 배열에는 배열의 주소값이 들어가게 됩니다.
		 * 
		 * 
		 */
		
		System.out.println(arr2.length);
		System.out.println(Arrays.toString(arr2[0]));
		System.out.println(arr2[0][0]);
		System.out.println(Arrays.deepToString(arr2));
		
		System.out.println("---------------");
		
		//빈 2차원 배열 만들기
		int[][] arr3 = new int[3][4];
		System.out.println(Arrays.deepToString(arr3));
		arr3[1][2] = 50;
		arr3[2][1] = 70;
		
		
		for(int[] i:arr3) {
			for(int k:i) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
	}

}

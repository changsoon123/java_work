package basic.array;

import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		
		int[] arr= {1,3,5,7,9,11,13};
		
//		arr[3] = arr[4];
//		arr[4] = arr[5];
//		arr[5] = arr[6];
		
		
		//삭제되는 값을 기준으로 뒤에 있는 값을 한칸씩 앞으로 땡기는 작업
		//추후에 생성될 새 배열에 값을 그대로 대입하기 편하게 대입하려고 하는 작업.
		
		for(int i=3; i<arr.length-1;i++) {
			
			arr[i] = arr[i+1];
		}
		
		//기존의 배열보다 크기가 하나 작은 새 배열 생성
		
		int[] tmp = new int[arr.length-1];
		//원본 배열의 값을 새 배열에 인덱스 맞춰서 그대로 대입하기
		tmp[0] = arr[0];
		tmp[1] = arr[1];
		tmp[2] = arr[2];

		for(int j=0;j<tmp.length;j++) {
			tmp[j] = arr[j];
			
		}
		
		int[] temp = Arrays.copyOf(arr, 6);
		int[] temp1 = Arrays.copyOfRange(arr,3,5);
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(tmp));
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(temp1));
		
		
		arr = tmp; // temp 배열의 주소값을 arr에게 넘긴다.
		
		tmp = null; // 주소값을 지워서 메모리에서 temp는 자동 소멸되게 합니다.
		
		System.out.println(Arrays.toString(arr));
		
		//stack 과 heap
		// 배열의 주소값은 stack에 쌓이고 heap에는 배열의 값들이 저장
		//
		//
		
		
	}

}

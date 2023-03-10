package etc.api.util.arrays;

import java.util.Arrays;

//import oop.obj_arr.Score;

public class ArraysQuiz {

	public static String solution(String[] participant,String[] comStrings) {
		
		/*
        - 참가한 사람의 이름이 담긴 배열 participant와
        완주한 사람의 이름이 담긴 배열 completion이 주어질 때
        완주하지 못한 선수의 이름을 return하는 solution 함수를 완성하세요.
        */
//		
		String s = "";
//		ArraysQuiz[] a = new ArraysQuiz[participant.length];
		Arrays.sort(participant);
		Arrays.sort(comStrings);
		if(comStrings.length==participant.length ) {
			System.out.println("모두 완주했습니다!!");
			
		}
		
		
		for(int i=0;i<participant.length;i++) {
			int a = Arrays.binarySearch(comStrings, participant[i]);
		
			if(a<0){
			
			s += participant[i] + " ";
			
			}
		}
		return s;
	}
	public static void main(String[] args) {

		String[] participant = {"홍길동","김길동","김철수","최철수","박영희"};
		String[] completion = {"홍길동"};
		System.out.println(solution(participant,completion));
		
	}

}

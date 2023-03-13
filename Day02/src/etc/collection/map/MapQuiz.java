package etc.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz {

	public static void main(String[] args) {

		  /*
        1. engKor이라는 이름으로 Map을 생성해 주세요.
         이 Map은 key로 영단어, value로 한글 뜻을 삽입할 겁니다.
         
        2. 사용자에게 영단어를 입력받아서, 이미 Map에 존재하는 단어라면
         다시 입력받으세요. (이미 존재한다는 메세지 출력)
         영단어 입력창에 '그만' 이라고 입력하면 입력을 종료해 주세요.
         
        3. 영단어 입력 후에는 한글 뜻을 입력받아서 Map에 삽입해 주세요.
        
        4. 입력이 종료되면, 반복문을 이용해서 
        영단어 : 뜻
        영단어 : 뜻
        영단어 : 뜻.... 형태로 입력받은 영단어와 뜻을 모두 출력해 주세요.
        */
       
		Map<String,String> engKor = new HashMap<>(); 
		Scanner sc = new Scanner(System.in);
//		engKor.put("멍멍이", "김철수");
//		engKor.put("야옹이", "홍길동");
//		engKor.put("짹짹이", "박영희");

		while(true) {
			System.out.println("영단어 입력창: (그만을 입력하면 종료됩니다)");
			String ssc = sc.next();
			if(ssc.equals("그만")) {
				
				break;
			}
			System.out.println("한글 뜻 입력창: ");
			String ssc1 = sc.next();
			
			if(!engKor.containsKey(ssc)) {
				engKor.put(ssc, ssc1);
			
			} else {
				System.out.println("이미 존재하는 영어 단어입니다.");
			}
			
			Set<String> keys =  engKor.keySet();
			
			for(String k:keys) {
				System.out.println(k + " : " + engKor.get(k));
				
			}
		
		
		}
		
		Set<String> keys =  engKor.keySet();
		for(String k:keys) {
			System.out.println(k + " : " + engKor.get(k));
			
		}
		
		sc.close();
	}

}

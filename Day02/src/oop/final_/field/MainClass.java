package oop.final_.field;

public class MainClass {

	public static void main(String[] args) {
		
		Person kim = new Person("김철수");
//		kim.nation= "미국"; final은 변경 불가
//		kim.name = "김마이클"; 객체 생성과 동시에 초기화를 해서 final 변수는 변경 불가
		kim.age = 30;
		
		Person park = new Person("박영희");
//		park.nation = "영국"; (x)
//		park.name = "영국"; (x)
		
		
	}

}

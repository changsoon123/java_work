package etc.api.lang.Math;

public class MathQuiz {

	static void page(int i) {
		int d = (int)Math.ceil(i/10.0);
		System.out.println(d);
	}
	
	public static void main(String[] args) {

	page(11);
		/*
		 * 1~10이 전달되면 1이 반환되고,
		 * 11~20이 전달되면 2가 반환되고,
		 * 21~30이 전달되면 3이 반환되고...
		 * 이러한 로직을 수행하는 static 메서드 page를 선언해 보세요.
		 */
	}

}

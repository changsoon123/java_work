package etc.api.lang;

public class MathExample {

	public static void main(String[] args) {

		//올림
		double i = Math.ceil(1.1);
		System.out.println(i);
		
		//내림
		double d = Math.floor(1.5);
		System.out.println(d);
		
		//반올림
		double p = Math.round(3.141231231*1000)*0.001;
		System.out.println(p);
		
		//제곱
		double d3 = Math.pow(3, 3);
		System.out.println(d3);
		
		//최대값
		int max = Math.max(2, 10);
		System.out.println(max);
		
		//최소값
		int min = Math.min(24, 33);
		System.out.println(min);
		
	}

}

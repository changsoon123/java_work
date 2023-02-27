package basic.loop;

public class ForQuiz {

	public static void main(String[] args) {
		
		/*
		 * 2~19까지의 난수를 생성하셔서 구구단을 출력해 보세요.(for)
		 * 19행까지 출력하세요.
		 */
		
		int nu =(int)(Math.random()*18)+2;
		
		for(int i=1;i<=19;i++) {
		
			
			System.out.printf("%d * %d = %d\n",nu,i,nu*i);
			
		}
		
		System.out.println("***구구단 " + nu + "단***");
		
		System.out.println("----------------------");
		
		
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i*j);
			}
		}
	}

}

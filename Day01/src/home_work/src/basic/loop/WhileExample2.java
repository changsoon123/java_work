package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {
		
		//48~150 사이의 정수 중 8의 배수만 가로로 출력해 보세요.
		
		
		int a = 48;
		int b = 0;
		
		while(a>=48 && a<=150) {
			
			if(a%8==0) {
				System.out.print(a+" ");
				
			}
			a++;
		}
		
		System.out.println();
		
		//1~100까지의 정수 중 4의 배수이면서 
		//8의 배수는 아닌 수를 가로로 출력해 보세요.
		
		int c = 1;
		int d = 0;
		
		while(c>=1 && c<=100) {
			
			if(c%4==0 && c%8 != 0) {
				System.out.print(c+" ");
				
			}
			
			c++;
		}
		
		System.out.println();
		//1~30000까지 정수 중 258의 배수의 개수를 출력
		
		int e = 1;
		int f = 0;
		
		while(e>=1 && e<=30000) {
			
			if(e%258==0) {
				f++; 
				
			}
			
			e++;
			
		}
		
		System.out.print(f+" ");
		
		//1000의 약수의 개수를 구하세요.
		//1부터 1000까지 하나씩 올려가면서 1000이랑 나눠보세요.
		//그랬을 때 나누어 떨어지는 애가 약수입니다.
		
		System.out.println();
		int g = 1;
		int h = 0;
		int sum = 0;
		
		while(g<=1000) {
			
		 if(1000%g==0) {
			 h++;
			 sum += g;
		 }
		 
			g++;
		}
		System.out.println("총합:" + h);
		System.out.println("약수들의 합:" + sum);
		
	}

}

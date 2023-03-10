package etc.api.lang.wrapper;

import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {

		while(true) {
		
			Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요.");
		String ssc = sc.next();
		
		try {
			
		if(ssc.charAt(6) =='-') {
			
			if(ssc.length() == 14) {
				
				System.out.println("통과가 되니?");
				
				if(ssc.charAt(7) == '1') {
					
					String aaa = ssc.substring(0,2);
					String aab = ssc.substring(2,4);
					String aac = ssc.substring(4,6);
					
					if(ssc.charAt(0)!='0') {
					int aad = Integer.parseInt(aaa);
					int aae= 2024-(1900+aad);
					System.out.println("주민등록번호: " + ssc);
					System.out.println("19"+aaa+"년"+aab+"월"+aac+"일"+aae+"세"+"남자");
					break;
					} else if(ssc.charAt(0)=='0') {
						int aad = Integer.parseInt(aaa);
						int aae = 24-aad;
						System.out.println("주민등록번호: " + ssc);
						System.out.println("19"+aaa+"년"+aab+"월"+aac+"일"+aae+"세"+"남자");
						break;
					}
					
				} else if(ssc.charAt(7) == '2'){
					String aaa = ssc.substring(0,2);
					String aab = ssc.substring(2,4);
					String aac = ssc.substring(4,6);
					
					if(ssc.charAt(0)!='0') {
					int aad = Integer.parseInt(aaa);
					int aae= 2024-(1900+aad);
					System.out.println("주민등록번호: " + ssc);
					System.out.println("19"+aaa+"년"+aab+"월"+aac+"일"+aae+"세"+"여자");
					break;
					} else if(ssc.charAt(0)=='0') {
						int aad = Integer.parseInt(aaa);
						int aae = 24-aad;
						System.out.println("주민등록번호: " + ssc);
						System.out.println("19"+aaa+"년"+aab+"월"+aac+"일"+aae+"세"+"여자");
						break;
					}
					
				} else if(ssc.charAt(7) == '3') {
					String aaa = ssc.substring(0,2);
					String aab = ssc.substring(2,4);
					String aac = ssc.substring(4,6);
					
					if(ssc.charAt(0)!='0') {
					int aad = Integer.parseInt(aaa);
					int aae= 2024-(1900+aad);
					System.out.println("주민등록번호: " + ssc);
					System.out.println("19"+aaa+"년"+aab+"월"+aac+"일"+aae+"세"+"남자");
					break;
					} else if(ssc.charAt(0)=='0') {
						int aad = Integer.parseInt(aaa);
						int aae = 24-aad;
						System.out.println("주민등록번호: " + ssc);
						System.out.println("19"+aaa+"년"+aab+"월"+aac+"일"+aae+"세"+"남자");
						break;
					}
					
					
				} else if(ssc.charAt(7) == '4') {
					String aaa = ssc.substring(0,2);
					String aab = ssc.substring(2,4);
					String aac = ssc.substring(4,6);
					
					if(ssc.charAt(0)!='0') {
					int aad = Integer.parseInt(aaa);
					int aae= 2024-(1900+aad);
					System.out.println("주민등록번호: " + ssc);
					System.out.println("19"+aaa+"년"+aab+"월"+aac+"일"+aae+"세"+"여자");
					break;
					} else if(ssc.charAt(0)=='0') {
						int aad = Integer.parseInt(aaa);
						int aae = 24-aad;
						System.out.println("주민등록번호: " + ssc);
						System.out.println("19"+aaa+"년"+aab+"월"+aac+"일"+aae+"세"+"여자");
						break;
					}
					
					
				} else {
					System.out.println("똑바로 입력하세요 11");
					continue;
				}
				
			} else {
				System.out.println("똑바로 입력하세요22");
				continue;
			}
			
			
		} else {
			System.out.println("13자리를 입력해주세요.");
			continue;
		} }catch(Exception e) {
			System.out.println("똑바로 입력하세요.33");
			continue;
		}
		
		sc.close();
		}
	}

}

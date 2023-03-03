package oop.constructor;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone basic = new Phone();
		basic.showSpec();
		
		Phone basic2 = new Phone("basic 2");
		basic2.showSpec();
		
		Phone iPone14 = new Phone("eee");
		iPone14.color="검정";
		iPone14.showSpec();
		
		Phone ppp1 = new Phone("eee","2222");
		ppp1.showSpec();
		
//		basic.model = "폴더폰";
//		basic.color = "회색";
//		basic.price = 20000;
//		basic.showSpec();
//		
//		Phone basic2 = new Phone();
//		basic2.model = "폴더폰";
//		
	}

}

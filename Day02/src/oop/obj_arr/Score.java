package oop.obj_arr;

public class Score extends ScoreMain{

	/*
    - 이름, 국어, 영어, 수학, 총점, 평균(double)을
     담을 수 있는 객체를 디자인하세요.
     
    - 학생의 모든 정보를 한 눈에 확인할 수 있게
     scoreInfo() 메서드를 선언해 주세요.
     메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.
     
    - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
    */
	
	
	String name;
	private int a;
	private int b;
	private int c;
	private int result;
	private double avr;
	
	public void scoreInfo(ScoreMain sc) {
		
		System.out.println("이름: " + this.name);
		System.out.println("국어 점수: " + this.a);
		System.out.println("영어 점수: " + this.b);
		System.out.println("수학 점수: " + this.c);
		System.out.println("총점: " + this.result);
		System.out.println("평균: " + this.avr);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public double getAvr() {
		return avr;
	}

	public void setAvr(double avr) {
		this.avr = avr;
	}
	
	
	
}

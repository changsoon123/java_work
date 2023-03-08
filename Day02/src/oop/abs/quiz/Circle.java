package oop.abs.quiz;

public class Circle extends Shape {


	
	public Circle(String name,double a) {
		super(name,a);
		
	}





		double getArea() {
		
			return getA()*getA()*Math.PI;
		}
	
	
	
}

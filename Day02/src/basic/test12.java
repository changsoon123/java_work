package basic;

import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		
		
		Dancer d1 = new Dancer();
		Person p1 = (Person) d1;
		
		System.out.println("Person? " + (p1 instanceof Person));
		System.out.println("Dancer? " + (p1 instanceof Dancer));
		System.out.println("Actor?  " + (p1 instanceof Actor));
	
		
	}

}

class Person { 	}

class Dancer extends Person {    }

class Actor extends Person {    }
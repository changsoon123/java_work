package oop.constructor;

public class Person {
	String name;
	int age;
	int k;
	
	Person(String d,int dd,int ddd){
		name = d;
		age = dd;
		k = ddd;
	}
	
	
	void info(){
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("키: "+ k);
		
	}

}

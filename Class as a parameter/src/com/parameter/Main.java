package com.parameter;

class Student{
	
	void subjectStudent() {
		System.out.println("Maths");
	}
} 

class Addition{
	void add(Student S) {
		
		S.subjectStudent();
		System.out.println("Addition");
		
	}
}

public class Main {
	public static void main(String[] args) {
		
		Addition a = new Addition();
		a.add(new Student());
	}

}

package main;

import productandbuilder.Student;

public class MainMethod {
	public static void main(String[] args) {
		Student student = new Student.StudentBuilder().setFirstName("Sang 2").setLastName("Nguyen").build();
		
		System.out.println(student);
	}
}

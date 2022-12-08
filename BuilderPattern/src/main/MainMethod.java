package main;

import builder.StudentBuilder;
import concretebuilder.StudentConcreteBuilder;

public class MainMethod {
	public static void main(String[] args) {
		StudentBuilder builder = new StudentConcreteBuilder().setFirstName("Sang").setLastName("Nguyen");
		
		System.out.println(builder.build());
	}
}

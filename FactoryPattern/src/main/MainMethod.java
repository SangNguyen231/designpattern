package main;

import factory.CarFactory;

public class MainMethod {
	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		carFactory.viewCar("HONDA");
	}
}

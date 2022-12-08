package main;

import component.Coffee;
import concreatecomponent.DefaultCoffee;
import concreatecomponenta.MilkCoffee;

public class MainMethod {
	public static void main(String[] args) {
		Coffee coffee = new MilkCoffee(new DefaultCoffee());
		System.out.println(coffee.getPrice());
	}
}

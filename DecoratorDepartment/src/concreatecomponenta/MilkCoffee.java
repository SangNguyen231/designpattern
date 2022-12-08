package concreatecomponenta;

import component.Coffee;
import decorator.CoffeeDecorator;

public class MilkCoffee extends CoffeeDecorator{

	public MilkCoffee(Coffee coffee) {
		super(coffee);
	}
	
	public int getPrice() {
		return super.getPrice() + 5000;
	}

}

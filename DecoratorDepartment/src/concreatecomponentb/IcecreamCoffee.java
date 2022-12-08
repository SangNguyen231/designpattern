package concreatecomponentb;

import component.Coffee;
import decorator.CoffeeDecorator;

public class IcecreamCoffee extends CoffeeDecorator{

	public IcecreamCoffee(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}

	public int getPrice() {
		return super.getPrice() + 5000;
	}
	
}

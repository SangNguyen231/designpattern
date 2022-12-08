package concreatecomponent;

import component.Coffee;

public class DefaultCoffee implements Coffee{

	@Override
	public int getPrice() {
		return 5000;
	}

}

package app;

import carinterface.Car;
import carinterface.CarHonda;
import carinterface.CarNexus;
import carinterface.CarToyota;

public class Client {
	
	public void viewCar(String carType) {
		Car car;
		if(carType.equalsIgnoreCase("HONDA")) {
			car = new CarHonda();
			car.createBanhXe().getModel();
			car.createBanhXe().getName();
			car.createCuaXe().getModel();
			car.createCuaXe().getName();
		}else if(carType.equalsIgnoreCase("NEXUS")) {
			car = new CarNexus();
			car.createBanhXe().getModel();
			car.createBanhXe().getName();
			car.createCuaXe().getModel();
			car.createCuaXe().getName();
		}else if(carType.equalsIgnoreCase("TOYOTA")) {
			car = new CarToyota();
			car.createBanhXe().getModel();
			car.createBanhXe().getName();
			car.createCuaXe().getModel();
			car.createCuaXe().getName();
		}
	}
}

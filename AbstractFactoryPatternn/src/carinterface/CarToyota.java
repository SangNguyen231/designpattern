package carinterface;

import banhxe.BanhXe;
import banhxe.BanhXeToyota;
import cuaxe.CuaXe;
import cuaxe.CuaXeToyota;

public class CarToyota implements Car{
	@Override
	public BanhXe createBanhXe() {
		return new BanhXeToyota();
	}

	@Override
	public CuaXe createCuaXe() {
		return new CuaXeToyota();
	}
}

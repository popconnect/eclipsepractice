package Poly;

class Vehicle {
	private int curX, curY;

	public void reportPosition() {
		System.out.printf("현재 위치: (%d, %d)%n", curX, curY);
	}

	public void addFuel() {
		System.out.println("모든 운송 수단은 연료가 필요");
	}
}

class DieselSIV extends Vehicle {
	@Override
	public void addFuel() {
		System.out.println("주유소에서 급유");
	}
}

class ElectricCar extends Vehicle {
	@Override
	public void addFuel() {
		System.out.println("급속 충전");
	}
}

class HorseCart extends Vehicle{}

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle[] vehicles = { new DieselSIV(), new ElectricCar() };
		for (Vehicle v : vehicles) {
			v.addFuel();
			v.reportPosition();
		}
	}
}

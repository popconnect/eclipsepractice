package poly1;

public class VehicleMain {
	public static void main(String[] args) {
		
		Vehicle[] vehicle = {new DieselSUV(),new ElectricCar()};
		for(Vehicle v:vehicle) {
			v.addFuel();
			v.reportPosition();
		}
	}
}

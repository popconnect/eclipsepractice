package poly1;

public abstract class Vehicle {
	private int curX;
	private int curY;

	public void reportPosition() {
		System.out.printf("현재 위치 : (%d,%d)%n",curX,curY );
	}
	public abstract void addFuel() ;
}

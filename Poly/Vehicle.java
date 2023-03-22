package Poly;

public class Vehicle {
	private int curX, curY;
	
	public void reportPosition() {
		System.out.printf("현재 위치: (%d, %d)%n", curX, curY);
	}
	
	public void addFual() {
		System.out.printf("주유소에서 급유");
	}
}

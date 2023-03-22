package UtilEx01.src;

public class Phone {
	String number;

	public Phone(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "전화 번호: " + this.number;
	}
}

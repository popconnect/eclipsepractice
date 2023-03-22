package PolyEx01;

class UserInfo {
	String name = "홍길동";
	public String toString() {
		return "이름 :" + this.name;
	}
}

class MemberInfo extends UserInfo {
	String grade = "정회원";
	public String toString() {
		return super.toString() + ", 등급: " + grade ;
	}
}

public class PrintObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object m = new MemberInfo();
		System.out.println("객체 정보 : " + m);
	}

}


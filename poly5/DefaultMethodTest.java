package poly5;

interface DefaultMethodInterface {
	void abstractMethod();
	
	default void defaultMethod() {
		System.out.println(" 이것은 기본 메서드입니다 ");
	}
}

public class DefaultMethodTest implements DefaultMethodInterface{
	
	public void abstractMethod() {
		System.out.println("자식에서 반드시 재정의 필요");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethodInterface dmt = new DefaultMethodTest();
		dmt.abstractMethod();
		dmt.defaultMethod();
	}

}

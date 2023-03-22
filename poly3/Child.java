package poly3;

public class Child implements InterA, InterB {

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("methodB 호출");
	}

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("methodA 호출");
	}

}

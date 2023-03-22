package poly4;

public class Child extends Parent implements InterB {

	@Override
	public void methodA() {
		System.out.println("Child MethodAAAAAA");
	}

	@Override
	public void methodB() {
		System.out.println("Child MethodBBBBB");
		
	}
	
	@Override
	public void methodC() {
		System.out.println("Child methodC() CC");
	}

	

}

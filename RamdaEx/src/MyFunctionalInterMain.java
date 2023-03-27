

public class MyFunctionalInterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyfunctionalInter() {
			public void method() {
				System.out.println("method 호출");
			}
		}.method();
		
		MyfunctionalInter f = new MyfunctionalInter() {
			public void method() {
				System.out.println("method 호출");
			}
		};
		
		f.method();
		
		MyfunctionalInter f1 = () -> {
			System.out.println("method");
		};
		f1.method();
		
		MyfunctionalInter f2 
			= () -> System.out.println("method 호출");
	}

}

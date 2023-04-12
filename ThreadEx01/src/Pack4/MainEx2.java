package Pack4;

public class MainEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread( () -> {
				for (int i = 1; i <= 10; i++ ) {
					System.out.println("Go : " + i);
				
			}
		});
		
		Thread t2 = new Thread( () -> {
				for (int i = 1; i <= 10; i++ ) {
					System.out.println("Come : " + i);
				
			}
		});
		System.out.println("시작");
		t1.start();
		t2.start();
		System.out.println("끝");
	}

}

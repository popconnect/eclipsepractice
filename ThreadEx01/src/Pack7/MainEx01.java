package Pack7;

public class MainEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Gugudan(2));
		Thread t2 = new Thread(new Gugudan(4));
		
		System.out.println("시작");
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("끝");
		
	}

}

package Pack2;

public class Go extends Thread {
	public void run() {
		//Thread 처리할 작업 지정
		for (int i = 1; i <= 10; i++ ) {
			System.out.println("go : " + i);
		}
	}
}

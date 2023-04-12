package Pack5;

public class MyThreadEx01 extends Thread {
	public void run() {
		
		System.out.println(this.getName() + "[쓰레드시작]");
		
		for ( int i = 0 ; i <= 300; i++) {
			System.out.print( "-" );
			for (int x = 0; x <10_000_000; x++) {
			}
		}
		System.out.println();
	}
}

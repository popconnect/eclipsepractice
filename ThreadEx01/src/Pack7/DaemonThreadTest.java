package Pack7;

public class DaemonThreadTest {
	static class SaveDaemon extends Thread{
		public SaveDaemon() {
			this.setDaemon(true);
		}
		
		public void run() {
			while(true) {
				try {
					Thread.sleep(1000 * 5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("자동저장함");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread daemon = new SaveDaemon();
		daemon.start();
		
		for(int i = 0 ; i < 20; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("작업중..." + i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("main over");
	}

}

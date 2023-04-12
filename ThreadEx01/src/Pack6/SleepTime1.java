package Pack6;

import java.time.LocalTime;
import java.util.Timer;

public class SleepTime1 {
	static class Timer extends Thread {
		public void run() {
			for(int i=0; i<9999; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("쨰깍:" + LocalTime.now().getHour() + "시" + LocalTime.now().getMinute() + "분" + LocalTime.now().getSecond() + "초" );
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer = new Timer();
		
		timer.start();
	}

}

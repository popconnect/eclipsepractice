package Pack6;


import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class JoinTest {
	
	static class GuguThread extends Thread {
		private int dan;
		String[] result = new String[9];
		
		public GuguThread(int dan) {
			// TODO Auto-generated constructor stub
			this.dan = dan;
		}
		
		public void run() {
			for (int i = 1; i <= 9; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.print(dan + "단완료\t");
		} 

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<GuguThread> gugus = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			GuguThread gugu = new GuguThread(i);
			gugus.add(gugu);
			gugu.start();
		}
		
		for (GuguThread gugu : gugus) {
			try {
				gugu.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("\n 구구단출력");
		for (GuguThread gugu : gugus) {
			System.out.println(Arrays.toString(gugu.result));
		}
	}

}

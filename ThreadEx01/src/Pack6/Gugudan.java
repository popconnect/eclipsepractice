package Pack6;

public class Gugudan implements Runnable {
	private int dan;
		
	public Gugudan(int dan) {
		this.dan = dan;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		for(int i=1; i<=9; i++) {
			System.out.printf("%s X %s = %s%n", dan, i, (dan * i));
		}
	}

}

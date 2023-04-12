package Pack8;

public class Account {
	private int balance = 1000;
	
	
	public synchronized int getBalance() {
		return balance;
	}
	
	//인출 Method
	public synchronized void withdraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000);
				balance -= money;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("잔고가 없습니다.");
		}
	}
}

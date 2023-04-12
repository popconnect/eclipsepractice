package Pack8;

//인출
public class Client implements Runnable {
	
	private Account accout;
	
	public Client(Account accout) {
		this.accout = accout;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(accout.getBalance() > 0) {
			
			int money = (int)(Math.random() * 3 + 1) * 100;
			accout.withdraw(money);
			System.out.println("통장 잔고 : " + accout.getBalance());
		}
	}
}

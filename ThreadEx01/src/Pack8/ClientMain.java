package Pack8;

public class ClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		Thread t1 = new Thread(new Client(account));
		Thread t2 = new Thread(new Client(account));
		
		t1.start();
		t2.start();
	}

}

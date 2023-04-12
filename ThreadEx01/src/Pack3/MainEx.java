package Pack3;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Go g = new Go();
		Come c = new Come();
		
		Thread t1 = new Thread(g);
		Thread t2 = new Thread(c);
		
		System.out.println("Start");
		t1.start();
		t2.start();
		System.out.println("End");
		
		
	}

}

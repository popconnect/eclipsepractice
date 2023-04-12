package Pack2;

public class MainEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Come c = new Come();
		Go g = new Go();
		//Thread 실행
		c.start();
		g.start();
	}

}

package Pack5;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadEx01 t1 = new MyThreadEx01();
		MyThreadEx02 t2 = new MyThreadEx02();
		
		System.out.println(t1.getPriority());
		t1.setPriority(7);
		System.out.println("시작");
		t1.start();
		t2.start();
		System.out.println("끝");
		
	}

}

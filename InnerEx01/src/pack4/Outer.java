package pack4;

public class Outer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = 100;
		new InnerB() {
			
			@Override
			public void viewInner() {
				// TODO Auto-generated method stub
				System.out.println(x);
				System.out.println(y);
			}
		}.viewInner();
	}
}

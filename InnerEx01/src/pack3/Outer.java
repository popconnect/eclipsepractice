package pack3;

public class Outer {
	public void viewOuter() {
		int x = 100;
		
		class Inner {
			private int y1 = 100;
			public int y2 = 100;
			
			public void viewInner() {
				System.out.println(x);
				System.out.println(y1);
				System.out.println(y2);
			}
		}
		Inner inner = new Inner();
		inner.viewInner();
	}
}

package nested;

public class StaticInnerTest {

	static class StaticInner {
		private int iMember = 10;
		private static int sMember = 0;
		
		public void innerMethod() {
			StaticInnerTest sit = new StaticInnerTest();
			System.out.println("om: " + sit.oMember + " im: " + iMember);
		}
	}
	private int oMember = 1;
	private void outerMethod() {
		StaticInner inner = new StaticInner();
		inner.iMember = 100;
		inner.innerMethod();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInner inner = new StaticInner();
		inner.innerMethod();
	}

}

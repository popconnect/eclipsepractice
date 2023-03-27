package nested;

interface SomeInterface {
	void printInfo();
}
public class AnonymusInnerTest {
	int iMember = 1;
	static int cMember = 2;
	
	void method(SomeInterface si) {
		si.printInfo();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymusInnerTest lit = new AnonymusInnerTest();
		int localVar = 3;
		lit.method(new SomeInterface() {
			
			@Override
			public void printInfo() {
				// TODO Auto-generated method stub
				System.out.println("외부 클래스 멤버 변수 : " + cMember);
				System.out.println("외부 로컬 변수 : " + localVar);
				
				cMember++;
			}
		});
	}

}

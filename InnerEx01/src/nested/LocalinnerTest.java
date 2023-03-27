package nested;

public class LocalinnerTest {
	int iMember = 1;
	static int cMember = 2;
	
	void Method() {
		int localVar = 3;
	
	class LocalInner{
		int innerLocalVar = 4;
		void innerMethod() {
			System.out.println("외부 인스턴스 멤버 변수:" + iMember);
			System.out.println("외부 클래스 멤버 변수:" + cMember);
			System.out.println("외부 로컬  변수:" + localVar);
			System.out.println("내부 인스턴스 멤버 변수:" + innerLocalVar);
			
			iMember++;
			cMember++;
			//localVar++;
			innerLocalVar++;
		}
	}
	LocalInner linner = new LocalInner();
	linner.innerMethod();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalinnerTest lit = new LocalinnerTest();
		lit.Method();
	}

}

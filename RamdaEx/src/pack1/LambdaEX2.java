package pack1;

interface FunctionalInterface2 {
	
	void methodB(String msg);
}


public class LambdaEX2 {
	public static void useFIMethod(FunctionalInterface2 fi) {
		fi.methodB("홍길동");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		useFIMethod((String msg) -> {System.out.println("람다식 이용 1 : " + msg);});
		useFIMethod(msg -> System.out.println("람다식 이용 2 : " + msg));
	}

}

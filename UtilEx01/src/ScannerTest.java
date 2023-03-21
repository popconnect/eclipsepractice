import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요: ");
		String line = sc.nextLine();
		System.out.printf("입력한 문자열 %s%n", line);
		System.out.println("정수를 입력하세요");
		int num1 = sc.nextInt();
		System.out.printf("입력한 문자열 %d%n", num1);
		System.out.println("실수를 입력하세요");
		float num2 = sc.nextFloat();
		System.out.printf("입력한 문자열 %f%n", num2);
		System.out.println("불리언을 입력하세요");
		boolean bool = sc.nextBoolean();
		System.out.printf("입력한 문자열 %d%n", bool);
	}

}

import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("입력: ");
		//공백까지 입력받음
		//String msg = sc1.next();
		//엔터키까지 입력 받음
		String msg = sc1.nextLine();
		System.out.println("msg : " + msg);
		sc1.close();
	}

}

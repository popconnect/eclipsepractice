import java.util.Scanner;

public class ScanMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String msg = "";
		int result;
		while(true) {
			System.out.println("출력하고자 하는 단수를 입력해주세요> ");
			msg = (sc.nextLine());
			if(!msg.equals("exit")) {
				for(int i=1; i<=9; i++) {
					result = Integer.valueOf(msg) * i;
					System.out.println(msg + " x " + i + " = " + result);
				}
			} else {
				System.out.println("종료");
				break;
			}
			
		}
		sc.close();
		
	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemEx04 {

	public static void main(String[] args) {
		
		
		BufferedReader br = null;
		BufferedReader br2 = null;
		br = new BufferedReader(new InputStreamReader(System.in));

		
		try {
			System.out.print("시작단수를 입력해주세요 : ");
			int startDan = Integer.parseInt(br.readLine());
			System.out.print("끝단수를 입력해주세요 : ");
			int endDan = Integer.parseInt(br.readLine());
			
			 for (int i = startDan; i<=endDan; i++) { 
				 for (int j=1; j<=9; j++) {
			 System.out.print(i + "X" + j + "=" + i*j + " "); 
			 } 
				 System.out.println("\n");
		}
			 
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(br != null) try {br.close();} catch(IOException e) {}
		}
		System.out.println("입력완료");
	}

}

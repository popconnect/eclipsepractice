import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemEx03 {

	public static void main(String[] args) {
		
		
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("데이터입력 : ");
		
		try {
			System.out.println(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(br != null) try {br.close();} catch(IOException e) {}
		}
		System.out.println("입력완료");
	}

}

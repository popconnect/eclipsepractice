import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is =  null;
		InputStreamReader isr = null;
		
		isr = new InputStreamReader(System.in);
		
		System.out.print("데이터입력 : ");
		try {
			System.out.println((char)isr.read());
			System.out.println((char)isr.read());
			System.out.println((char)isr.read());
			System.out.println((char)isr.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(is != null) try {is.close();} catch(IOException e) {}
		}
		System.out.println("입력완료");
	}

}

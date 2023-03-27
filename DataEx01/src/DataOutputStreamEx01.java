import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.io.DataOutputStream dos = null;
		
		try {
			dos = new DataOutputStream(new FileOutputStream("./value.dat"));
			
			dos.writeInt(2023);
			dos.writeUTF("utf-8 형식으로 문자열 저장");
			dos.writeFloat(1.8f);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] : " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] : " + e.getMessage());
		} finally {
			if(dos != null) try {dos.close();} catch(IOException e) {};
		}
		
		System.out.println("출력완료");
		
		
	}

}

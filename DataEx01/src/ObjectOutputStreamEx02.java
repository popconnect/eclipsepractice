import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("./object2.dat"));
			Person p = new Person("홍길동", "010-1111-1111", "20", "서울시");
			
			oos.writeObject(p);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] : " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] : " + e.getMessage());
		} finally {
			if(oos != null) try {oos.close();} catch(IOException e) {}
		}
	}

}

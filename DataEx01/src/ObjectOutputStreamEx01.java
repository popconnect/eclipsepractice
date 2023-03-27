import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("./object.dat"));
			
			
			String[] names = {"홍길동", "박문수", "이몽룡" };
			int[] ages = {55, 23, 47};
			double[] weight = {71.4, 67.9, 58.6};
			
			oos.writeObject(names);
			oos.writeObject(ages);
			oos.writeObject(weight);
			
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

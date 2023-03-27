import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("./object2.dat"));
			
			Person p = (Person)ois.readObject();
			System.out.println(p.getName());
			System.out.println(p.getPhone());
			System.out.println(p.getAge());
			System.out.println(p.getAddress());
			
			Person p2 = (Person)ois.readObject();
			System.out.println(p2.getName());
			System.out.println(p2.getPhone());
			System.out.println(p2.getAge());
			System.out.println(p2.getAddress());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] : " + e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] : " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] : " + e.getMessage());
		} finally {
			if(ois != null) try {ois.close();} catch(IOException e) {}
		}
	}

}

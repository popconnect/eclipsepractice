import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class ObjectStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File target = new File("./objPerson.dat");
		Person p = new Person("홍길동", 20 ,"111111-2222222","hong" , "1234");
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(target));
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(target));){
			oos.writeObject(p);
			Object readed = ois.readObject();
			if(readed !=null && readed instanceof Person) {
				Person casted = (Person) readed;
				System.out.println(casted);
			}
			
		}catch (IOException | ClassNotFoundException e) {
			System.out.println("에러");
		}
		
	}

}

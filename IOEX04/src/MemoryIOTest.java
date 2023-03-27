import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.util.Arrays;

public class MemoryIOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] memory = "안녕 Java World".toCharArray();
		char[] buffer = new char[5];
		int read = 0;
		try(CharArrayReader cReader = new CharArrayReader(memory);
				CharArrayWriter cWriter = new CharArrayWriter();) {
			while((read = cReader.read(buffer))>0) {
				cWriter.write(buffer, 0, read);
				
			}
			System.out.println(Arrays.toString(cWriter.toCharArray()));
		} catch (IOException e) {
			System.out.println("[에러] : " + e.getMessage());
		}
	}

}

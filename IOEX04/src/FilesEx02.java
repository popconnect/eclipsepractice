import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Path;

public class FilesEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path target = Paths.get("./test1.txt");
		
		try {
			List<String> lines = Files.readAllLines(target);
			for( String line : lines) {
				System.out.println(lines);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

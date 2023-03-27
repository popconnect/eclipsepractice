import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.sql.Date;
import java.util.concurrent.TimeUnit;

public class FilesEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("./value.dat");
		Path filePath = file.toPath();
		
		BasicFileAttributes attributes = null;
		try {
			attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
			long creationTime = attributes.creationTime().to(TimeUnit.MICROSECONDS);
			
			System.out.println(creationTime);
			Date date = new Date(creationTime);
			System.out.println(date.toLocaleString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

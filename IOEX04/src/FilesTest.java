import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.Date;

public class FilesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilesTest ft = new FilesTest();
		ft.dirInfo();
		
	}
	
	public void dirInfo() throws IOException {
		Path target = Paths.get(".");
		DirectoryStream<Path> directoryStream = Files.newDirectoryStream(target);
		for(Path path : directoryStream) {
			Date time = new Date(Files.getLastModifiedTime(path).toMillis());
			String name = path.getFileName().toString();
			long length = Files.size(path);
			if(Files.isDirectory(path)) {
				name = "[" + name + "]";
			}
			System.out.printf("%-20x/t%tF %<T/t%s%n", name, time, length);
		}
	}

}

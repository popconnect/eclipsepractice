import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
public class PathTest {

	public static void main(String[] args) throws URISyntaxException{
		// TODO Auto-generated method stub
		Path path1 = Paths.get("C:/windows/explorer.exe");
		System.out.println("파일명:" + path1.getFileName());
		System.out.println("이름의 개수:" + path1.getNameCount());
		System.out.println("0번째 이름의 개수:" + path1.getName(0));
		System.out.println("0~2의 패스:" + path1.subpath(0, 2));
		System.out.println("상위 경로:" + path1.getParent());
		System.out.println("Root 경로:" + path1.getRoot());
		
		Path relative = Paths.get("./src");
		System.out.println("절대 경로로:" + relative.toAbsolutePath());
		System.out.println("절대 경로 표시 삭제" + relative.normalize().toAbsolutePath());
		
		File file = relative.toFile();
		System.out.println("URL표현 " + relative.toUri());
	}

}

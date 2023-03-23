import java.io.IOException;

public class ExceptionEx9 {
	public static void main(String[] args) {
		try {
			ProcessBuilder b = new ProcessBuilder("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
			b.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}



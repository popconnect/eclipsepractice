import java.io.IOException;

public class SystemEx07 {
	public static void main(String[] args) throws IOException {
		ProcessBuilder prosBuilder = new ProcessBuilder("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
		prosBuilder.start();
	}
}

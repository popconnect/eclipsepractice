import java.io.IOException;

public class SystemEx07 {
	public static void main(String[] args) throws IOException {
		ProcessBuilder prosBuilder = new ProcessBuilder("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
		ProcessBuilder prosBuilder2 = new ProcessBuilder("C:\\Windows\\system32\\notepad.exe");
		prosBuilder2.start();
		
		
		// 메모장 실행파일
		
	}
}
             
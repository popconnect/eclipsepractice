package pack3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClientEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		BufferedWriter bw = null;
		try {
			System.out.println("서버와 연결을 시작합니다.");
			socket = new Socket("localhost", 7777);
			
			System.out.println("Connected");
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));
			bw.write("안녕 서버1:안녕 서버2:안녕 서버3" + System.lineSeparator());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		} finally {
			if(bw != null) try {bw.close();} catch(IOException e) {};
			if(socket != null) try {socket.close();} catch(IOException e) {}
			
		}
	}
}



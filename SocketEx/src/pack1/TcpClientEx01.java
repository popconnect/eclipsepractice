package pack1;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClientEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		
		try {
			System.out.println("서버와 연결을 시작합니다.");
			socket = new Socket("localhost", 7777);
			
			System.out.println("Connected");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		} finally {
			if(socket != null) try {socket.close();} catch(IOException e) {};

		}
	}
}



package pack4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClientEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		try {
			System.out.println("서버와 연결을 시작합니다.");
			socket = new Socket("localhost", 7777);
			
			System.out.println("Connected");
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			bw.write("Hello Echo Server" + System.lineSeparator());
			
			bw.flush();
			
			System.out.println("전송완료");
			String msg = br.readLine();
			System.out.println("에코 메세지 : " + msg);
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		} finally {
			if(bw != null) try {bw.close();} catch(IOException e) {};
			if(br != null) try {br.close();} catch(IOException e) {};
			if(socket != null) try {socket.close();} catch(IOException e) {}
			
		}
	}
}



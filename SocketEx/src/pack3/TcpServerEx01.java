package pack3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader br = null;
		
		// 1포트는 1개의 프로그램만 기용가능
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("서버가 준비되었습니다.");
			
			socket = serverSocket.accept();
			System.out.println("서버가 연결되었습니다.");
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			String[] data = br.readLine().split(":");
			for(String e : data) {
				System.out.println(e);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			if(br != null) try {br.close();} catch(IOException e) {};
			if(socket != null) try {socket.close();} catch(IOException e) {};
			if(serverSocket != null) try {serverSocket.close();} catch(IOException e) {};
		}
	}

}

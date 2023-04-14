package pack4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		// 1포트는 1개의 프로그램만 기용가능
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("서버가 준비되었습니다.");
			
			socket = serverSocket.accept();
			System.out.println("서버가 연결되었습니다.");
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));
			
			String msg = br.readLine();
			System.out.println("메세지 : " + msg);
			
			bw.write(msg + System.lineSeparator());
			
			//Fin
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(br != null) try {br.close();} catch(IOException e) {};
			if(bw != null) try {bw.close();} catch(IOException e) {};
			if(socket != null) try {socket.close();} catch(IOException e) {};
			if(serverSocket != null) try {serverSocket.close();} catch(IOException e) {};
		}
	}

}

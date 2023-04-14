package pack2;

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
		BufferedReader br = null;
		
		try {
			
			socket = new Socket("localhost", 7777);
			
			System.out.println("Connected");
			
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			System.out.println("메세지 : " + br.readLine());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		} finally {
			if(socket != null) try {socket.close();} catch(IOException e) {};
			if(br != null) try {br.close();} catch(IOException e) {};

		}
	}
}



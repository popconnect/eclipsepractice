import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.spi.FileSystemProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
public class ZiptoSql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mariadb://localhost:3306/Project";
		String user = "Project";
		String password = "1234";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색하고자 하는 동을 입력하여주십시오 : ");
		String seDong = sc.next();
		System.out.println(seDong);
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				conn = DriverManager.getConnection(url, user, password);
				System.out.println("드라이버 로딩 완료");
				String sql = String.format("INSERT INTO zipcode VALUES (?, ?, ?, ?, ?, ?, ?)"); 
				pstmt = conn.prepareStatement(sql);
				
				BufferedReader bis = new BufferedReader(new FileReader("zipcode_seoul_utf8_type2.csv"));
				String str = "";
				while((str = bis.readLine()) != null) {
					String[] arrZipcode = str.split(",");
					pstmt.setString(1, arrZipcode[0]);
					pstmt.setString(2, arrZipcode[1]);
					pstmt.setString(3, arrZipcode[2]);
					pstmt.setString(4, arrZipcode[3]);
					pstmt.setString(5, arrZipcode[4]);
					pstmt.setString(6, arrZipcode[5]);
					pstmt.setString(7, arrZipcode[6]);
					rs = pstmt.executeQuery();
				}
				int result = pstmt.executeUpdate();
				System.out.println("실행결과" + result);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if(conn != null) try {conn.close();} catch (SQLException e) {}
			}
		}
	}
	



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
public class ZiptoSql2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mariadb://localhost:3306/Project";
		String user = "Project";
		String password = "1234";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				conn = DriverManager.getConnection(url, user, password);
				System.out.println("드라이버 로딩 완료");
				
				
				while(true) {
					System.out.print("검색하고자 하는 동을 입력하여주십시오 : ");
					String seDong = sc.next();
					String sql = "SELECT * FROM zipcode WHERE DONG like ? ";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, "" + seDong + "%");
					rs = pstmt.executeQuery();
					if (seDong.equals("Exit")) {
						System.exit(0);
					} else {
						while(rs.next()) {
							System.out.printf("%s %s %s %s %s %s %s%n",
									rs.getString("ZIPCODE"), rs.getString("SIDO"),
									rs.getString("GUGUN"), rs.getString("DONG"),
									rs.getString("RI"), rs.getString("BUNJI"),
									rs.getString("SEQ"));
						}
						int result = pstmt.executeUpdate();
						System.out.println("실행완료" + result);
					}
				}
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("[Error]" + e.getMessage());

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("[Error]" + e.getMessage());

			} finally {
				if(conn != null) try {conn.close();} catch (SQLException e) {}
				if(pstmt != null) try {pstmt.close();} catch (SQLException e) {}
				if(rs != null) try {rs.close();} catch (SQLException e) {}
				if(sc != null) try {sc.close();} catch (Exception e) {}
			}
		}
	}
	



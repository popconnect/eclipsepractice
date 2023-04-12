import java.io.FileReader;
import java.sql.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;

public class WriteZipcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String url = "jdbc:mariadb://localhost:3306/Project";
		String user = "Project";
		String password = "1234";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Statement stmt = null;

			try {
				Class.forName("org.mariadb.jdbc.Driver");
				conn = DriverManager.getConnection(url, user, password);
				System.out.println("드라이버 로딩 완료");
				stmt = conn.createStatement();
				
				BufferedReader bis = new BufferedReader(new FileReader("zipcode_seoul_utf8_type2.csv"));
				String str = "";
				int count = 0;
				while((str = bis.readLine()) != null) {
					String[] arrZipcode = str.split(",");
					String sql = String.format("INSERT INTO zipcode VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s')",
							arrZipcode[0], arrZipcode[1], arrZipcode[2], 
							arrZipcode[3], arrZipcode[4], arrZipcode[5], arrZipcode[6]); 
					rs = stmt.executeQuery(sql);
					count++;
				}
				int result = pstmt.executeUpdate();
				System.out.println("실행결과" + count);
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
	



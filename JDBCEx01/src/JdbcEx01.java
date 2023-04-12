import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String url = "jdbc:mysql://localhost:3306/sample";
			String user = "root";
			String password = "12345";
			
			Connection conn = null;
			
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				System.out.println("드라이버 로딩 완료");
				conn = DriverManager.getConnection(url, user, password);
				System.out.println("연결 성공");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally { 
				if(conn != null) try {conn.close();} catch (SQLException e) {}
			}
		}
	}
	



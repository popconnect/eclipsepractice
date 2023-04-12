import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String url = "jdbc:mysql://localhost:3306/sample";
			String user = "root";
			String password = "12345";
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				conn = DriverManager.getConnection(url, user, password);
				String sql = "DELETE FROM DEPT2 WHERE DEPTNO=?";
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, "10");
				//pstmt.setString(2, "10");
				//pstmt.setString(3, "서울");
				
				int result = pstmt.executeUpdate();
				System.out.println("실행완료" + result);
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally { 
				if(conn != null) try {conn.close();} catch (SQLException e) {}
				if(pstmt != null) try {pstmt.close();} catch (SQLException e) {}
			}
		}
	}
	



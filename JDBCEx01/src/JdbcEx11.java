import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String url = "jdbc:mysql://localhost:3306/sample";
			String user = "root";
			String password = "12345";
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				conn = DriverManager.getConnection(url, user, password);
				String sql = "SELECT empno, ename, sal, job from emp where ename like ?";
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, "s%");
				
				rs = pstmt.executeQuery();
				while(rs.next()) {
					System.out.printf("%s %s %s %s%n",
							rs.getString("empno"), rs.getString("ename"),
							rs.getString("sal"), rs.getString("job"));
				}
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
				if(rs != null) try {rs.close();} catch (SQLException e) {}
				
			}
		}
	}
	



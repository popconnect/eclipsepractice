import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String url = "jdbc:mysql://localhost:3306/sample";
			String user = "root";
			String password = "12345";
			ResultSet rs = null;
					
			Connection conn = null;
			Statement stmt = null;
			
			String sql = "select * from dept";
			
			
			
			
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				System.out.println("드라이버 로딩 완료");
				conn = DriverManager.getConnection(url, user, password);
				System.out.println("연결 성공");
				
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					System.out.println(rs.getString("deptno"));
					System.out.println(rs.getString("dname"));
					System.out.println(rs.getString("loc"));
				}
				
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("[ERROR] : " + e.getMessage());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("[ERROR] : " + e.getMessage());
			} finally { 
				if(conn != null) try {conn.close();} catch (SQLException e) {}
				if(stmt != null) try {stmt.close();} catch (SQLException e) {}
			}
		}
	}
	



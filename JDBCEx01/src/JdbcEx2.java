import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String url = "jdbc:mysql://localhost:3306/sample";
			String user = "root";
			String password = "12345";
			String deptno = "20";
			String dname = "개발";
			String loc = "대전";
			//String sql = "Insert into dept2 values (" + deptno + ", '" + dname + "', '" + loc + "')";
			String sql = String.format("insert into dept2 values (%s, '%s', '%s')", deptno, dname, loc);
			System.out.println(sql);
			Connection conn = null;
			Statement stmt = null;
			
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				System.out.println("드라이버 로딩 완료");
				conn = DriverManager.getConnection(url, user, password);
				System.out.println("연결 성공");
				
				stmt = conn.createStatement();
				int Result = stmt.executeUpdate(sql);
				
				System.out.println("실행결과 : " + Result);
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
	



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String url = "jdbc:mysql://localhost:3306/sample";
			String user = "root";
			String password = "12345";
			String deptno = "10";
			String dname = "생산";
			String loc = "대전";
			ResultSet rs = null;
					
			Connection conn = null;
			Statement stmt = null;
			
			String sql = "select empno, ename, sal, ((sal*12)+ifnull(comm, 0)) annsal from emp where deptno = 10;";
			
			
			
			
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				System.out.println("드라이버 로딩 완료");
				conn = DriverManager.getConnection(url, user, password);
				System.out.println("연결 성공");
				
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					System.out.print(rs.getString("empno") + "\t");
					System.out.print(rs.getString("ename")+ "\t");
					System.out.print(rs.getString("sal")+ "\t");
					System.out.println(rs.getString("annsal"));
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
	



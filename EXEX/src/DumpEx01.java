import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.IOException;
import java.lang.StringBuilder;

public class DumpEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "12345";
		String cmd = "java -jar test.jar";
		ResultSet rs = null;
		String tableName = "emp";
		
		
		Connection conn = null;
		Statement stmt = null;
		
		
		String sql = String.format("select * from %s", tableName);
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로딩 완료");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공");
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.printf("%s, '%s', '%s', '%s', '%s', %s, %s, %s%n", 
						rs.getString("empno"),	rs.getString("ename"),
						rs.getString("job"),	rs.getString("mgr"),
						rs.getString("hiredate"),	rs.getString("sal"),
						rs.getString("comm"),	rs.getString("deptno"));
				
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}
}

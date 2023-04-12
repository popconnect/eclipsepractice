import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.FileWriter;
import java.io.BufferedWriter;


public class DumpEx02 {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String url = "jdbc:mariadb://192.168.0.36:3306/sample";
		String user = "root";
		String password = "123456";
		
		ResultSet rs = null;
		Connection conn = null;
		Statement stmt = null;
		
		String tableName = "emp";
		String tableName2 = "emp";
		
		
		
		String sql = String.format("desc %s", tableName);
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로딩 완료");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공");
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			BufferedWriter bos = new BufferedWriter(new FileWriter("./emp.sql"));
			while (rs.next()) {
				System.out.printf("%s", rs.getString("Field"));
				bos.write(rs.getString("Field"));
			}
			System.out.println("\n");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			String sql2 = String.format("select * from %s", tableName2);
			conn = DriverManager.getConnection(url, user, password);
			
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql2);
			
			while (rs.next()) {
				System.out.println();
				System.out.printf("INSERT INTO emp VALUES ( %s, '%s', '%s', '%s', '%s', %s, %s, %s)", 
						rs.getString("empno"),	rs.getString("ename"),
						rs.getString("job"),	rs.getString("mgr"),
						rs.getString("hiredate"),	rs.getString("sal"),
						rs.getString("comm"),	rs.getString("deptno"));
				System.out.println("\n");
				
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

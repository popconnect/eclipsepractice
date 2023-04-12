

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmpDAO {
	
private Connection conn = null;
	
	public EmpDAO() {
		
		// TODO Auto-generated constructor stub
		String url = "jdbc:mariadb://localhost:3306/sample";
		String user = "root";
		String password = "12345";
		

		try {
			
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[Error : " +e.getMessage() + "]");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[Error : " +e.getMessage() + "]");
		}
	}
		
		
		public ArrayList<EmpTO> listEmp() {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			ArrayList<EmpTO> items = new ArrayList<>();
			
			String sql = "SELECT empno, ename, job, mgr, hiredate, sal, comm, deptno FROM emp";
			
			try {
			pstmt = this.conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				EmpTO to = new EmpTO();
				
				to.getEmpno(); to.getEname(); to.getJob(); to.getMgr(); 
				to.getHiredate(); to.getSal(); to.getComm(); to.getDeptno();
				
				items.add(to);
			}	
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("[Error : " + e.getMessage() + "]");
			} finally {
				if( conn != null) try { conn.close();} catch(SQLException e) {}
				if( rs != null) try { rs.close();} catch(SQLException e) {}
				if( pstmt != null) try { pstmt.close();} catch(SQLException e) {}
			}

			return items;	
		}
	}
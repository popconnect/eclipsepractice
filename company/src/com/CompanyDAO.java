package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;




public class CompanyDAO {
private Connection conn = null;
	
	public CompanyDAO() {
		
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
		
		
		public ArrayList<CompanyTO> searchCompany(String strEname) {
			
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			ArrayList<CompanyTO> cName = new ArrayList<>();
			
			String sql = "SELECT e.empno, e.ename, e.deptno, e.sal, e.hiredate, m.ename FROM emp e RIGHT OUTER JOIN emp m on (e.mgr = m.empno) where e.ename LIKE ?";
			
			try {
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, strEname);
			
			rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				
				CompanyTO to = new CompanyTO();
				
				to.setEmpno(rs.getString("e.empno"));
				to.setEname(rs.getString("e.ename"));
				to.setDeptno(rs.getString("e.deptno"));
				to.setSal(rs.getString("e.sal"));
				to.setHiredate(rs.getString("e.hiredate"));
				to.setMgr(rs.getString("m.ename"));
				
				cName.add(to);
			}	
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("[Error : " + e.getMessage() + "]");
			} finally {
				if( conn != null) try { conn.close();} catch(SQLException e) {}
				if( rs != null) try { rs.close();} catch(SQLException e) {}
				if( pstmt != null) try { pstmt.close();} catch(SQLException e) {}
			}

			return cName;	
		}
	}
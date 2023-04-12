package com.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class QueueDAO {
	private Connection conn = null;
	
	public QueueDAO() {
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
	
	public ArrayList<QueueTo> queueList(String strJob) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<QueueTo> queue = new ArrayList<>();
		
		String sql = "SELECT empno, ename, mgr, hiredate, sal, comm, deptno FROM emp where job like ?";

		
		try {
			
		pstmt = this.conn.prepareStatement(sql);
		pstmt.setString(1, strJob);
		rs = pstmt.executeQuery();

		while(rs.next()) {
			
			QueueTo to = new QueueTo();
			
			to.setEmpno(rs.getString("empno"));
			to.setEname(rs.getString("ename"));
			to.setMgr(rs.getString("mgr"));
			to.setHiredate(rs.getString("hiredate"));
			to.setSal(rs.getString("sal"));
			to.setComm(rs.getString("comm"));
			to.setDeptno(rs.getString("deptno"));
			
			queue.add(to);
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[Error : " + e.getMessage() + "]");
		} finally {
			if( conn != null) try { conn.close();} catch(SQLException e) {}
			if( rs != null) try { rs.close();} catch(SQLException e) {}
			if( pstmt != null) try { pstmt.close();} catch(SQLException e) {}
		}
		return queue;
	}
}




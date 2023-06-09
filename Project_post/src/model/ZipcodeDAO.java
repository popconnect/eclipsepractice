package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ZipcodeDAO {
	
	private Connection conn ;
	
	public ZipcodeDAO() {
	    String url = "jdbc:mariadb://localhost:3306/Project";
	    String user = "Project";
	    String password = "1234";

	    try {
	        Class.forName("org.mariadb.jdbc.Driver");
	        this.conn = DriverManager.getConnection(url, user, password);
	    } catch (ClassNotFoundException e) {
	        System.out.println("[Error]" + e.getMessage());
	    } catch (SQLException e) {
	        System.out.println("[Error]" + e.getMessage());
	    } finally {
	        // TODO Auto-generated constructor stub
	    }
	}
	
	public ArrayList<ZipcodeTO> listSido() {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<ZipcodeTO> sidos = new ArrayList<>();
		
		try {
			String sql = "SELECT DISTINCT sido FROM zipcode";
			pstmt = this.conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ZipcodeTO to = new ZipcodeTO();
				to.setSido(rs.getString("sido"));
				sidos.add(to);
			}
			
		} catch(SQLException e) {
			System.out.println("[Error]" + e.getMessage());
		} finally {
			if(conn != null) try {conn.close();} catch (SQLException e) {}
			if(rs != null) try {rs.close();} catch (SQLException e) {}
			if(pstmt != null) try {pstmt.close();} catch (SQLException e) {}
		}
		
		return sidos;
		
	}
	public ArrayList<ZipcodeTO> listGugun(String strSido) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<ZipcodeTO> guguns = new ArrayList<>();
		
		try {
			String sql = "SELECT DISTINCT gugun FROM zipcode where sido = ?";
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, strSido);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ZipcodeTO to = new ZipcodeTO();
				to.setGugun(rs.getString("gugun"));
				guguns.add(to);
			}
			
		} catch(SQLException e) {
			System.out.println("[Gugun Error]" + e.getMessage());
		} finally {
			if(conn != null) try {conn.close();} catch (SQLException e) {}
			if(rs != null) try {rs.close();} catch (SQLException e) {}
			if(pstmt != null) try {pstmt.close();} catch (SQLException e) {}
		}
		
		return guguns;
		
	}
	public ArrayList<ZipcodeTO> listDong(String strSido, String strGugun) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<ZipcodeTO> dongs = new ArrayList<>();
		System.out.println(strSido);
		System.out.println(strGugun);
		
		try {
			String sql = "SELECT DISTINCT dong FROM zipcode where sido = ? and gugun = ?";
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, strSido);
			pstmt.setString(2, strGugun);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ZipcodeTO to = new ZipcodeTO();
				to.setDong(rs.getString("dong"));
				dongs.add(to);
			}
			
		} catch(SQLException e) {
			System.out.println("[Dong Error]" + e.getMessage());
			
		} finally {
			if(conn != null) try {conn.close();} catch (SQLException e) {}
			if(rs != null) try {rs.close();} catch (SQLException e) {}
			if(pstmt != null) try {pstmt.close();} catch (SQLException e) {}
		}
		
		return dongs;
		
	}
	public ArrayList<ZipcodeTO> listAddress(String strSido, String strGugun, String strDong) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<ZipcodeTO> addresses = new ArrayList<>();
		
		try {
			String sql = "SELECT zipcode, ri, bunji FROM zipcode where sido = ? and gugun = ? and dong = ?";
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, strSido);
			pstmt.setString(2, strGugun);
			pstmt.setString(3, strDong);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ZipcodeTO to = new ZipcodeTO();
				to.setZipcode(rs.getString("zipcode"));
				to.setRi(rs.getString("ri"));
				to.setBunji(rs.getString("bunji"));
				addresses.add(to);
			}
			
		} catch(SQLException e) {
			System.out.println("[Error]" + e.getMessage());
		} finally {
			if(conn != null) try {conn.close();} catch (SQLException e) {}
			if(rs != null) try {rs.close();} catch (SQLException e) {}
			if(pstmt != null) try {pstmt.close();} catch (SQLException e) {}
		}
		
		return addresses;
		
	}
	
}

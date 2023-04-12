package model1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.AbstractListModel;

public class zipcodeListModel extends AbstractListModel<String> {
	
	private ArrayList<String> items = new ArrayList<>();
	
	public zipcodeListModel(String strDong) {
		// TODO Auto-generated constructor stub
		
		String url = "jdbc:mariadb://localhost:3306/sample";
		String user = "root";
		String password = "12345";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT zipcode, sido, gugun, dong, ri, bunji from zipcode where dong like ?;
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strDong + "%");
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String zipcode = rs.getString("zipcode");
				String sido = rs.getString("sido");
				String gugun = rs.getString("gugun");
				String dong = rs.getString("dong");
				String ri = rs.getString("ri");
				String bunji = rs.getString("bunji");
				
				String address = String.format("[%s] %s %s %s %s %s", zipcode, sido, gugun, dong, ri, bunji);
				items.add(address + System.lineSeparator());
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[Error : " +e.getMessage() + "]");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[Error : " +e.getMessage() + "]");
		} finally {
			if( conn != null) try { conn.close();} catch(SQLException e) {}
			if( rs != null) try { rs.close();} catch(SQLException e) {}
			if( pstmt != null) try { pstmt.close();} catch(SQLException e) {}
		}
		
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return items.size();
	}

	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		return items.get(index);
	}
	
	
	
	
}

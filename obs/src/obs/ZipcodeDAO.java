package obs;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ZipcodeDAO {
	private Connection conn = null;
	
	public ZipcodeDAO() {
		
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
	
	public ArrayList<ZipcodeTO> searchZipcode(String strDong) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<ZipcodeTO> addresses = new ArrayList<>();
		
		try {
			String sql = "SELECT zipcode, sido, gugun, dong, ri, bunji from zipcode where dong like ?";
			
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, strDong + "%");
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ZipcodeTO to = new ZipcodeTO();
				
				to.setZipcode(rs.getString("zipcode"));
				to.setSido(rs.getString("sido"));
				to.setGugun(rs.getString("gugun"));
				to.setDong(rs.getString("dong"));
				to.setRi(rs.getString("ri"));
				to.setBunji(rs.getString("bunji"));
				
				addresses.add(to);
			}	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[Error : " + e.getMessage() + "]");
		} finally {
			if( conn != null) try { conn.close();} catch(SQLException e) {}
			if( rs != null) try { rs.close();} catch(SQLException e) {}
			if( pstmt != null) try { pstmt.close();} catch(SQLException e) {}
		}

		return addresses;	
	}
}

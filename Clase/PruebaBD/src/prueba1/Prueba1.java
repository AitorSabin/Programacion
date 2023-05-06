package prueba1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prueba1 {

	static final String URL = "jdbc:mysql://localhost:3306/universidad";
	static final String USER ="root";
	static final String PASS ="270215";
	
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			connection = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Conexion realizada");
			ps = connection.prepareStatement("select dni, numexp from alumno");
			rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.print("El dni es: "+rs.getString("dni")+", ");
				System.out.println("El numero de expediente es: "+rs.getString("numexp")+"\n");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

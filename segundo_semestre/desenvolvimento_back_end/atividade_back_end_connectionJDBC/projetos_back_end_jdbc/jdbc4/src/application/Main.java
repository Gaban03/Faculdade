package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Main {

	public static void main(String[] args) {
		Connection conn= null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			
				st = conn.prepareStatement(
						"UPDATE vendedor "
						+ "SET salarioBase = salarioBase + ? "
						+ "WHERE "
						+ "(idDepartamento = ?)");
				
				st.setDouble(1, 600.0);
				st.setInt(2, 2);
				
				int registros = st.executeUpdate();
				
				System.out.println("Finalizado! Registros = " + registros);
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			DB.closeConnection();
			DB.closeStatement(st);
		}
	}

}

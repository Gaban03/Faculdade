package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbIntegrityException;

public class Main {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"DELETE FROM departamento "
					+ "WHERE "
					+ "id = ?");
			
			st.setInt(1, 6);
			
			int registros = st.executeUpdate();
			
			System.out.println("Finalizado! Registros = " + registros);
			
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new DbIntegrityException(e.getMessage());
		}
		finally {
			DB.closeConnection();
			DB.closeStatement(st);
		}
		
	}

}

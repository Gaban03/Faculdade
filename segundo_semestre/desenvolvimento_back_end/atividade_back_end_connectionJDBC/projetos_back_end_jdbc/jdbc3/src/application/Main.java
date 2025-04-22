package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Main {

	public static void main(String[] args) {
		Connection conn= null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			
			// Faz a inserção no banco
			
//			st = conn.prepareStatement(
//				"INSERT INTO vendedor"
//				+ "(nome, email, dataNascimento, salarioBase, idDepartamento)"
//				+ "VALUES "
//				+ "(?, ?, ?, ?, ?)");
			
			// Faz a inserço e retorna o id gerado
//			st = conn.prepareStatement(
//				"INSERT INTO vendedor"
//				+ "(nome, email, dataNascimento, salarioBase, idDepartamento)"
//				+ "VALUES "
//				+ "(?, ?, ?, ?, ?)",
//				Statement.RETURN_GENERATED_KEYS);
//			
//			
//			st.setString(1, "Vinicius Gaban");
//			st.setString(2, "gaban@gmail.com");
//			st.setDate(3, new java.sql.Date(sdf.parse("27/11/2024").getTime()));
//			st.setDouble(4, 3000.0);
//			st.setInt(5, 4);
			
			st = conn.prepareStatement("INSERT INTO departamento (nome) VALUES ('D1'), ('D2')",
					Statement.RETURN_GENERATED_KEYS);
			
			int registros = st.executeUpdate();
			
			if(registros > 0) {
				ResultSet rs = st.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Finalizado! Id = " + id);
				}
			}
			else {
				System.out.println("Nenhum registro alterado!");
			}
			
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
//		catch(ParseException e) {
//			e.printStackTrace();
//		}
		finally {
			DB.closeConnection();
			DB.closeStatement(st);
		}
	}

}

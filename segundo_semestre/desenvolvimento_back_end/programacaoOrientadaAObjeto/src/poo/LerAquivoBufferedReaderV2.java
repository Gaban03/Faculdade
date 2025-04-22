package poo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LerAquivoBufferedReaderV2 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\Aluno\\Desktop\\dados\\funcionarios.csv";
		
		ArrayList<String> funcionarios = new ArrayList<>();
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
					
			String linha = br.readLine();
			
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} 
	}
}

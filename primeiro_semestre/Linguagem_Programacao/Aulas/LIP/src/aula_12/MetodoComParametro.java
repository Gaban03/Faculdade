package aula_12;

import java.util.Scanner;

public class MetodoComParametro {

	public static void main(String[] args) {
		String nome;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		nome = scan.nextLine();
		saudacao(nome);
		scan.close();
	}
	
	public static void saudacao(String name) {
		System.out.println("Ol� " + name + " vamos tomar um caf�!");
	}

}

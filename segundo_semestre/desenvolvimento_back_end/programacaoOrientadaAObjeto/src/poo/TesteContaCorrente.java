package poo;

import java.util.Scanner;

public class TesteContaCorrente {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ContaCorrente conta = new ContaCorrente(0000001, 2500, 200);
		
		boolean inicio = false;  
		
		while (inicio != true) {
			conta.Linha();
			System.out.println();
			System.out.print("                 Banco Santander ");
			System.out.println();
			conta.Linha();
			System.out.println();
			System.out.println("Menu de opções:");
			conta.Linha();
			System.out.println();
			System.out.println("1 - Consultar saldo");
			System.out.println("2 - Sacar");
			System.out.println("3 - Depositar");
			System.out.println("4 - Sacar com cartão especial");
			System.out.println("0 - Sair");
			conta.Linha();
			System.out.println();
			System.out.print("Digite uma opção de menu: ");
			int opcao = scan.nextInt();
			switch(opcao) {
				case 1:
					System.out.println("O saldo em ");
					
				break;
				
				case 2:
					
				break;
				
				case 3:
					
				break;
				
				case 4:
					
				break;
				
				case 0:
				
				break;
				
				default:
					System.out.println("Nenhuma opção válida inserida");
					conta.Linha();
				break;
				
			}
		}

	}

}

package poo;

import java.util.Scanner;

public class TesteLista {

	public static void main(String[] args) {
		
		boolean inicio = false;
		
		Lista listinha = new Lista();
		Scanner scan = new Scanner(System.in);
		
		
		while(!inicio) {
			int opcao;
			System.out.println();
			listinha.Linha();
			System.out.print(" Menu de opções ");
			listinha.Linha();
			System.out.println();
			System.out.println("1- Inserir item");
			System.out.println("2- Remover item");
			System.out.println("3- Listar item(ns)");
			System.out.println("0- Sair");
			listinha.Linha();
			System.out.println();
			System.out.print("Opção: ");
			opcao = scan.nextInt();
			listinha.Linha();
			
			switch(opcao) {
			
				case 1:
					listinha.Linha();
					System.out.print(" Inserir item ");
					listinha.Linha();
					System.out.println();
					System.out.print("Digite o nome da compra para adicionar: ");
					String nomeCompraAdicionar = scan.next();
					listinha.addListaDeCompras(nomeCompraAdicionar);
					System.out.println();
					System.out.println();
				break;
				
				case 2:
					listinha.Linha();
					System.out.print(" Remover item ");
					listinha.Linha();
					System.out.println();
					System.out.print("Digite o nome da compra que deseja remover: ");
					String nomeCompraRemover = scan.next();
					if(!listinha.removeListaDeCompras(nomeCompraRemover)) {
						System.out.println();
						System.out.println("Produto não encontrado na lista!!!");
						System.out.println();
					} else {
						System.out.println();
						listinha.removeListaDeCompras(nomeCompraRemover);
						System.out.println("Produto removido da lista!!!");
						System.out.println();
					}	
				break;
				
				case 3:
					for(String lista : listinha.getListaDeCompras()) {
						System.out.println(lista);
					}
				break;
				
				case 0:
					System.out.println("Encerrando programa!!!");
					inicio = false; 
				break;
				
				default:
					System.out.println("Opção inválida!!!");
				break;
			}
		}
		
		scan.close();

	}

}

package poo;

import java.util.Scanner;

public class TesteMassaCorporal {

	public static void main(String[] args) {
		
		boolean inicio = false;
		
		MassaCorporal usuario = new MassaCorporal("Vinicius", 80, 1.90, "Gordo", 0.00035);
		Scanner scan = new Scanner(System.in);
		
		while(!inicio) {
			int opcao;
			System.out.print("Digite seu nome: ");
			String nomeUsuario = scan.next();
			String nome = nomeUsuario.toUpperCase();
			usuario.setNome(nome);
			usuario.Linha();
			System.out.print(" BEM-VINDO (A) " + usuario.getNome() + " ");
			usuario.Linha();
			System.out.println();
			System.out.println();
			usuario.Linha();
			System.out.print(" Menu de opções ");
			usuario.Linha();
			System.out.println();
			System.out.println("1- Calcular IMC");
			System.out.println("2- Calcular quanto de aguá você deve beber");
			System.out.println("3- Ver Dados");
			System.out.println("4- Ver Categoria");
			System.out.println("5- Ver prescrição médica");
			System.out.println("0- Sair");
			usuario.Linha();
			System.out.println();
			System.out.print("Opção: ");
			opcao = scan.nextInt();
			usuario.Linha();
			switch(opcao) {
			
				case 1:
					usuario.Linha();
					System.out.print(" Calculo IMC ");
					usuario.Linha();
					System.out.println();
					System.out.print("Qual o seu peso: ");
					double peso = scan.nextDouble();
					usuario.setPeso(peso);
					System.out.println();
					System.out.print("Qual sua altura: ");
					double altura = scan.nextDouble();
					usuario.setAltura(altura);
					System.out.println();
					System.out.printf("O indice de massa corporal é : %.2f" , usuario.imc());
					System.out.println();
					System.out.println();
				break;
				
				case 2:
					System.out.println();
					System.out.println("Digite seu peso: ");
					double pesoPessoa = scan.nextDouble();
					usuario.setPeso(pesoPessoa);
					System.out.printf("Quantidade de água que deve consumir: %.2f", usuario.beberAgua());
					System.out.println();
				break;
				
				case 3:
					System.out.println();
					System.out.printf("IMC: %.2f" , usuario.imc());
					System.out.println();
					System.out.println("Peso: " + usuario.getPeso());
					System.out.println("Altura: " + usuario.getAltura());
					System.out.println("Categoria: " + usuario.categoria(usuario.imc()));
					System.out.println("Prescrição médica: " + usuario.preescricaoMedica(usuario.categoria(usuario.imc())));
					System.out.printf("Quantidade de água que deve consumir: %.2f", usuario.beberAgua() + "L");
				break;
				
				case 4:
					System.out.println();
					System.out.println("\nA sua classificação é: " + usuario.categoria(usuario.imc()));
					System.out.println();
				break;
				
				case 5:
					System.out.println();
					System.out.println(usuario.preescricaoMedica("\n A prescrição médica para você e: " + usuario.categoria(usuario.imc())));
					System.out.println();
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
		
		/*MassaCorporal pessoa1 = new MassaCorporal();
		MassaCorporal pessoa2 = new MassaCorporal();
		
		pessoa1.setAltura(1.86);
		pessoa1.setPeso(70);
		System.out.printf("O indice de massa corporal é : %.2f" ,pessoa1.imc());
		System.out.println("\nA classificação da pessoa é " + pessoa1.categoria(pessoa1.imc()));
		System.out.println(pessoa1.preescricaoMedica(pessoa1.categoria(pessoa1.imc())));
		
		System.out.println();
		
		
		pessoa2.setAltura(1.90);;
		pessoa2.setPeso(50);;
		System.out.printf("O indice de massa corporal é : %.2f" ,pessoa2.imc());
		System.out.println("\nA classificação da pessoa2 é " + pessoa2.categoria(pessoa2.imc()));
		System.out.println(pessoa2.preescricaoMedica(pessoa2.categoria(pessoa2.imc())));*/
	}

}

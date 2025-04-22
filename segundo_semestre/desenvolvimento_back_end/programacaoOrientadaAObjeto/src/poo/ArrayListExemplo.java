package poo;

import java.util.ArrayList;

public class ArrayListExemplo {

	public static void main(String[] args) {
		ArrayList<String> listaDeNomes = new ArrayList<>();
		
		listaDeNomes.add("André");
		listaDeNomes.add("Roberto");
		listaDeNomes.add("Silva");
		listaDeNomes.add("João");
		listaDeNomes.add("Pedro");
		listaDeNomes.add("Lucas");
		listaDeNomes.add("Judas");
		listaDeNomes.add("Tiago");
		
		for(String lista : listaDeNomes) {
			System.out.println(lista);
		}
		
		listaDeNomes.remove(0);
		listaDeNomes.remove("Pedro");		

		System.out.println();
		
		for (String lista : listaDeNomes) {
			System.out.println(lista);
		}
	}

}

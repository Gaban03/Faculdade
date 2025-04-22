package poo;

import java.util.ArrayList;

public class Lista {
	private ArrayList<String> listaCompras = new ArrayList<>();
	
	public Lista() {}
	
	public Lista(ArrayList<String> listaCompras, String nome) {
		this.listaCompras = listaCompras;
		
	}
	
	public ArrayList<String> getListaDeCompras() {
		System.out.println();
		Linha();
		System.out.print(" Lista de Compras ");
		Linha();
		System.out.println();
		return listaCompras;
	}
	
	public void addListaDeCompras(String listaDeCompras) {
		listaCompras.add(listaDeCompras);
	}
	
	public boolean removeListaDeCompras(String listaDeCompra) {
		return listaCompras.remove(listaDeCompra);
	}
	
	public void Linha() {
		for(int x = 1; x <= 15; x++) {
			System.out.print("=");
		}
	}
}

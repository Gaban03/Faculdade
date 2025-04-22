package aula11;

public class Gato extends Mamifero{

	private boolean unhaAfiada;
	
	
	public Gato() {
		
	}

	public Gato(String nome, String familia, boolean unhaAfiada) {
		super(nome, familia);
		this.unhaAfiada = unhaAfiada;
	}
	

	public boolean getUnhaAfiada() {
		return unhaAfiada;
	}

	public void setRaca(boolean unhaAfiada) {
		this.unhaAfiada = unhaAfiada;
	}
	
}

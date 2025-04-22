package poo;

public class Lampada {
	boolean ligada;
	boolean desligada;
	
	public Lampada(boolean ligada, boolean desligada) {
		this.ligada = ligada;
		this.desligada = desligada;
	}
	
	public String acenderLuz() {
		ligada = true;
		desligada = false;
		return "A luz está acesa!";
	}
	
	public String apagarLuz() {
		ligada = false;
		desligada = true;
		return "A luz está apagada!";
	}

}


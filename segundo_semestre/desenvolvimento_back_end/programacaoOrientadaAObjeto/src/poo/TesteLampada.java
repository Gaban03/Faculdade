package poo;

public class TesteLampada {

	public static void main(String[] args) {
		Lampada sala = new Lampada(false, true);

		System.out.println("Lâmpada desligada: " + sala.desligada);
		System.out.println(sala.acenderLuz());
		System.out.println("Lâmpada desligada: " + sala.desligada);
		System.out.println(sala.apagarLuz());
		System.out.println("Lâmpada desligada: " + sala.desligada);
	}

}

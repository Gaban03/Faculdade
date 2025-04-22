package enumaracoes;


public class Main {

	public static void main(String[] args) {
		
		DiaDaSemana dia = DiaDaSemana.QUARTA;
		
		if (dia == DiaDaSemana.SABADO || dia == DiaDaSemana.DOMINGO) {
			System.out.println("É fim de semana!");
		} else {
			System.out.println("Dia de trabalho.");
		}

		System.out.println("===================================");
				
		StatusPedido status = StatusPedido.ENVIADO;
		
		System.out.println("Status: " + status);
		System.out.println("Código do status: " + status.getCodigo());
		
		System.out.println("===================================");
	}

}

package entidades;

public class PagamentoPix extends Pagamento {

	private String contaBancaria;
	
	public PagamentoPix(double valor, String contaBancaria) {
		super(valor);
		this.contaBancaria = contaBancaria;
	}
	
	@Override
	public void processarPagamento() {
		System.out.println("Processando pagamento via Pix...");
		System.out.println("Número do cartão: " + contaBancaria);
		
		imprimirRecibo();
	}

}

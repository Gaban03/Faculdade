package entidades;

public class Main {

	public static void main(String[] args) {
		
		// Pagamento com cartão
		Pagamento pagamentoCartao = new PagamentoCartao(250.75, "1237-4564-7893-7476");
		pagamentoCartao.processarPagamento();
		
		// Pagamento por transferência
		Pagamento pagamentoPix = new PagamentoPix(500.00, "123477-4");
		pagamentoPix.processarPagamento();

	}

}

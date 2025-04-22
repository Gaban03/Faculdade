package entidades;

public abstract class Pagamento {
	
	protected double valor;
	
	public Pagamento(double valor) {
		this.valor = valor;
	}
	
	public abstract void processarPagamento();
	
	public void imprimirRecibo() {
		System.out.println("Recebido gerado. Valor: R$ " + valor);
	}
}

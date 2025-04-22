package aula11;

public class ContaEmpresa extends Conta {

	private Double limiteDeEmprestimo;

	
	public ContaEmpresa() {
		
	}

	public ContaEmpresa(Integer numero, String titular, Double saldo, Double limiteDeEmprestimo) {
		super(numero, titular, saldo);
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}

	public Double getLimiteDeEmprestimo() {
		return limiteDeEmprestimo;
	}

	public void setLimiteDeEmprestimo(Double limiteDeEmprestimo) {
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}
	
	public void emprestimo(Double valor) {
		saldo = valor;
	}

	@Override
	public void sacar(Double valor) {
		super.sacar(valor);
		saldo -= 2.0;
	}

	
	
}

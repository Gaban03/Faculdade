package poo;

public class ContaCorrente {
	double numero;
	double saldo;
	double limiteDeChequeEspecial;
	
	public ContaCorrente(double numero, double saldo, double limiteDeChequeEspecial) {
		this.numero = numero;
		this.saldo = saldo;
		this.limiteDeChequeEspecial = limiteDeChequeEspecial;
	}
	
	public void sacar(double valor) {
		if(saldo < 0 && saldo < valor ) {
			System.out.println("Saldo insuficiente!");
		} else {
			saldo = saldo - valor;
		}
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public double consultar() {
		return saldo;
	}
	
	public String sacarComChequeEspecial(double valor) {
		
		if(saldo + limiteDeChequeEspecial < valor) {
			return "Não foi possivel realizar o saque";
		} else {
			saldo = saldo - valor;
			return "O saque foi realizado com sucesso";
		}
		
	}
	
	public void Linha() {
		for(int x = 1; x <= 50; x++) {
			System.out.print("=");
		}
	}
	
}

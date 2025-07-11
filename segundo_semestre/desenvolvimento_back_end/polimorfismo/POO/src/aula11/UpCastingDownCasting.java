package aula11;

public class UpCastingDownCasting {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1010, "Vinicius Gaban", 0.0);
		ContaEmpresa contaEmpresa = new ContaEmpresa(1011, "C3A", 0.0, 500.0);
		
		// UPCASTING
		Conta c1 = contaEmpresa; // acesso aos membros da superclasse
		Conta c2 = new ContaEmpresa(1012, "ARS", 0.0, 300.0);
		Conta c3 = new ContaPoupanca(1013, "Isabella", 0.0, 0.01);
		
		//DOWCASTING
		//ContaEmpresa ce1 = conta; // erro compilação
		//ContaEmpresa ce2 = (ContaEmpresa)conta; // erro execução
		//ContaEmpresa ce3 = (ContaEmpresa)c3; // erro execução
		
		ContaEmpresa ce4 = (ContaEmpresa)c2;
		System.out.println(ce4.getLimiteDeEmprestimo());
		
		if(c2 instanceof ContaEmpresa) {
			ContaEmpresa c4 = (ContaEmpresa)c2;
			System.out.println("Sou uma conta empresa!");
		}
		
		if(c2 instanceof ContaPoupanca) {
			ContaEmpresa c4 = (ContaEmpresa)c3;
			System.out.println("Sou uma conta poupança!");
		}
		
	}

}

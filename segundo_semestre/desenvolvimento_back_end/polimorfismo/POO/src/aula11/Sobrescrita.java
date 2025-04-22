package aula11;

public class Sobrescrita {

	public static void main(String[] args) {
		ContaEmpresa ce = new ContaEmpresa(1010, "ARS", 1000.0, 500.0);
		ContaPoupanca cp = new ContaPoupanca(1020, "Gaban", 1000.0, 0.0);
		
		System.out.println("Saldo Inicial CE: " + ce.getSaldo());
		System.out.println("Saldo Inicial CP: " + cp.getSaldo());
		System.out.println("==========================================");
		ce.sacar(300.0);
		cp.sacar(300.0);
		System.out.println("Saldo Inicial CE: " + ce.getSaldo());
		System.out.println("Saldo Inicial CP: " + cp.getSaldo());
	}

}

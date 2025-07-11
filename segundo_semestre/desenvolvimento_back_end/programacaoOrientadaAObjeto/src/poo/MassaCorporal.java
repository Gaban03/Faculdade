package poo;

public class MassaCorporal {
	private String nome;
	private double peso;
	private double altura;
	private String classificacao;
	private double agua;

	public MassaCorporal() {
	}

	public MassaCorporal(String nome, double peso, double altura, String classificacao, double agua) {
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.classificacao = classificacao;
		this.agua = agua;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public double imc() {
		return peso / (altura * altura);
	}
	
	public double beberAgua() {
		return agua * peso;
	}

	public String categoria(double imc) {

		if (imc <= 16.9) {
			classificacao = "Muito abaixo de peso";
		}
		if (imc > 17 && imc <= 18.4) {
			classificacao = "Abaixo do peso";
		}
		if (imc > 18.5 && imc <= 24.9) {
			classificacao = "Peso normal";
		}
		if (imc > 25 && imc <= 29.9) {
			classificacao = "Acima do pesso";
		}
		if (imc > 30 && imc <= 34.9) {
			classificacao = "Obesidade grau 1";
		}
		if (imc > 35 && imc <= 40) {
			classificacao = "Obesidade grau 2";
		}
		if (imc > 40) {
			classificacao = "Obesidade grau 3";
		}

		return classificacao;
	}

	public String preescricaoMedica(String diagnostico) {

		switch (diagnostico) {
		case "Muito abaixo de peso":
			diagnostico = "Comer mais";
			break;

		case "Abaixo do peso":
			diagnostico = "Comer um pouco mais";
			break;

		case "Peso normal":
			diagnostico = "Continue assim :)";
			break;

		case "Acima do pesso":
			diagnostico = "Comer um pouco menos";
			break;

		case "Obesidade grau 1":
			diagnostico = "Comer menos";
			break;

		case "Obesidade grau 2":
			diagnostico = "Comer muito menos";
			break;

		case "Obesidade grau 3":
			diagnostico = "Comer muito muito menos";
			break;
		}

		return diagnostico;
	}
	
	public void Linha() {
		for(int x = 1; x <= 25; x++) {
			System.out.print("=");
		}
	}
}

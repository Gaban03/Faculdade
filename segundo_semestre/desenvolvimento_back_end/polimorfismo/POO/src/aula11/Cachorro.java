package aula11;

public class Cachorro extends Mamifero {

	private String raca;
	
	
	public Cachorro() {
		
	}

	public Cachorro(String nome, String familia, String raca) {
		super(nome, familia);
		this.raca = raca;
	}
	

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	@Override
	public void brincar() {
		System.out.println("AU AU AU AU!!!");
	}
	
}

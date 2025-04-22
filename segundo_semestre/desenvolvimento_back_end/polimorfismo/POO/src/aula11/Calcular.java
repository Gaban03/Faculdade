package aula11;

public class Calcular {

	private Double linear;
	private Double area;
	private Double volume;

	public Calcular() {

	}
	
	public Calcular(Double linear) {
		this.linear = linear;
	}

	public Calcular(Double linear, Double area) {
		this.linear = linear;
		this.area = area;
	}
	
	public Calcular(Double linear, Double area, Double volume) {
		this.linear = linear;
		this.area = area;
		this.volume = volume;
	}

	public Double getLinear() {
		return linear;
	}

	public void setLinear(Double linear) {
		this.linear = linear;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public void calcular(Double comprimento) {
		System.out.println("Comprimento: " + comprimento);
		setLinear(comprimento);
	}

	public void calcular(Double comprimento, Double largura) {
		System.out.println("Comprimento: " + comprimento);
		System.out.println("Área: " + comprimento * largura);
		setLinear(comprimento);
		setArea(largura);
	}
	
	public void calcular(Double comprimento, Double largura, Double altura) {
		System.out.println("Comprimento: " + comprimento);
		System.out.println("Área: " + comprimento * largura);
		System.out.println("Volume: " + comprimento * altura * largura);
		setLinear(comprimento);
		setArea(comprimento * largura);
		setVolume(comprimento * altura * largura);
	}

}

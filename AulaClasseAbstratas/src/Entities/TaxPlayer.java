package Entities;

public abstract class TaxPlayer {

	private String name;
	private Double anaualIcome;
	
	public TaxPlayer() {
		
	}

	public TaxPlayer(String name, Double anauallcome) {
		this.name = name;
		this.anaualIcome = anauallcome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnauallcome() {
		return anaualIcome;
	}

	public void setAnauallcome(Double anauallcome) {
		this.anaualIcome = anauallcome;
	}

	public abstract double tax();
	
}


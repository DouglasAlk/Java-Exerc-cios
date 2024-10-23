package ultilidades;

public class Funcoes {
	
	private String name;
	private int number;
	private double saldo;
	
	
	public Funcoes() {
	
	}
	

	public Funcoes(String name, int number, double initialDeposit) {
		this.name = name;
		this.number = number;
		deposit(initialDeposit);
	}
	
	public Funcoes(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getNumber() {
		return number;
	}


	public double getSaldo() {
		return saldo;
	}

	

	public void deposit(double valor) {
		 saldo += valor;
	}
	
	public void withdraw(double valor) {
	     saldo -= (valor + 5);	
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", saldo);
	}
}



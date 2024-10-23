package entites;

public class Student {
	
	public String name;
	public double nota1, nota2, nota3;

	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
}

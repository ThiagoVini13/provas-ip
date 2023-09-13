import java.util.Scanner;

public class Temperatura {
	private float farenheit;
	
	Temperatura(float novoFarenheit){
		this.setFarenheit(novoFarenheit);
	}
	
	public void setFarenheit(float novoFarenheit){
		this.farenheit = novoFarenheit;
	}
	
	public float getFarenheit(){
		return this.farenheit;
	}
	
	public void converteCelsius(){
		float temperaturaCelsius = (this.getFarenheit() - 32)/1.8f;
		System.out.printf("Temperatura em F: %.1f\n", this.getFarenheit());
		System.out.printf("Temperatura em C: %.1f\n", temperaturaCelsius);
	}
	
	public static void main(String[] args){
		Scanner leitura = new Scanner(System.in);
		float temperaturaFarenheit = leitura.nextFloat();
		Temperatura temp = new Temperatura(temperaturaFarenheit);
		temp.converteCelsius();
	}
}	
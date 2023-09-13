import java.util.Scanner;

public class Carro {
	private float custoFabrica;
	private float custoFinal;
	
	Carro(float novoCustoFabrica){
		this.setCustoFabrica(novoCustoFabrica);
	}
	
	public void setCustoFabrica(float novoCustoFabrica){
		this.custoFabrica = novoCustoFabrica;
	}
	
	public float getCustoFabrica(){
		return this.custoFabrica;
	}
	
	private void setCustoFinal(float novoCustoFinal){
		this.custoFinal = novoCustoFinal;
	}
	
	public float getCustoFinal(){
		return this.custoFinal;
	}
	
	public void calculaCustoFinal(){
		float valorFinal = this.getCustoFabrica();
		valorFinal += ((this.getCustoFabrica() * 0.45f) + (this.getCustoFabrica() * 0.12f));
		this.setCustoFinal(valorFinal);
	}
	
	public void imprimeCustoFinal(){
		this.calculaCustoFinal();
		System.out.printf("%.2f", this.getCustoFinal());
	}
	
	public static void main(String[] args){
		Scanner leitura = new Scanner(System.in);
		float novoCustoFabrica = leitura.nextFloat();
		Carro car = new Carro(novoCustoFabrica);
		car.imprimeCustoFinal();
	}
}
import java.util.Scanner;

public class Tartaruga {
	private float tamanhoAtual;
	private float taxaDeCrescimento;

	Tartaruga(float novoTamanho, float novaTaxa){
		this.setTamanhoAtual(novoTamanho);
		this.setTaxaDeCrescimento(novaTaxa);
	}
	
	public void setTamanhoAtual(float novoTamanho){
		this.tamanhoAtual = novoTamanho;
	}
	
	public float getTamanhoAtual(){
		return this.tamanhoAtual;
	}
	
	public void setTaxaDeCrescimento(float novaTaxa){
		this.taxaDeCrescimento = novaTaxa;
	}
	
	public float getTaxaDeCrescimento(){
		return this.taxaDeCrescimento;
	}
	
	public void verificaTempo(Tartaruga tart2){
		float tempo = 0.0f;
		tempo = (this.getTamanhoAtual() - tart2.getTamanhoAtual());
		tempo /= (tart2.getTaxaDeCrescimento() - this.getTaxaDeCrescimento());
		System.out.printf("%.2f", tempo);
	}
	
	public static void main(String[] args){
		Scanner leitura = new Scanner(System.in);
		float ta1 = leitura.nextFloat();
		float tc1 = leitura.nextFloat();
		float ta2 = leitura.nextFloat();
		float tc2 = leitura.nextFloat();
		Tartaruga tart1 = new Tartaruga(ta1, tc1);
		Tartaruga tart2 = new Tartaruga(ta2, tc2);
		tart1.verificaTempo(tart2);
	}
}
import java.util.Scanner;

public class Divida{
	private float divida;
	private int diasAtraso;
	private float taxaMulta;
	
	Divida(float novaDivida, int novosDiasAtraso, float novaTaxaMulta){
		this.setDivida(novaDivida);
		this.setDiasAtraso(novosDiasAtraso);
		this.setTaxaMulta(novaTaxaMulta);
	}
	
	public void setDivida(float novaDivida){
		this.divida = novaDivida;
	}
	
	public float getDivida(){
		return this.divida;
	}
	
	public void setTaxaMulta(float novaTaxaMulta){
		this.taxaMulta = novaTaxaMulta;
	}
	
	public float getTaxaMulta(){
		return this.taxaMulta;
	}
	
	public void setDiasAtraso(int novosDiasAtraso){
		this.diasAtraso = novosDiasAtraso;
	}
	
	public int getDiasAtraso(){
		return this.diasAtraso;
	}
	
	public void calculaDividaTotal(){
		float dividaTotal = 0.0f;
		dividaTotal = this.getDivida() + (this.getDiasAtraso() * this.getTaxaMulta());
		System.out.printf("O valor da sua divida atual eh: %.2f", dividaTotal);
	}
	
	public static void main(String[] args){
		Scanner leitura = new Scanner(System.in);
		float novaDivida = leitura.nextFloat();
		int novosDiasAtraso = leitura.nextInt();
		float novaTaxaMulta = leitura.nextFloat();
		Divida divida = new Divida(novaDivida, novosDiasAtraso, novaTaxaMulta);
		divida.calculaDividaTotal();
	}
}
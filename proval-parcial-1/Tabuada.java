import java.util.Scanner;

public class Tabuada {
	private int numero;
	
	Tabuada(int novoNumero){
		this.setNumero(novoNumero);
	}
	
	public void setNumero(int novoNumero){
		this.numero = novoNumero;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public void imprimeTabuada(){
		int num = this.getNumero();
		int i;
		for(i = 0; i <= num; i++){
			System.out.printf("%d x %d = %d\n", num, i, num*i);
		}
	}
	
	public static void main(String[] args){
		Scanner leitura = new Scanner(System.in);
		int num = leitura.nextInt();
		Tabuada tabuada = new Tabuada(num);
		tabuada.imprimeTabuada();
	}
}
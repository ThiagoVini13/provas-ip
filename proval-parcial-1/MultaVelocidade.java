import java.util.Scanner;

public class MultaVelocidade{
	private int velocidadeMaxima;
	private int velocidadeMotora;
	
	MultaVelocidade(int novaVelocidadeMaxima, int novaVelocidadeMotora){
		this.setVelocidadeMaxima(novaVelocidadeMaxima);
		this.setVelocidadeMotora(novaVelocidadeMotora);
	}
	
	public void setVelocidadeMaxima(int novaVelocidadeMaxima){
		this.velocidadeMaxima = novaVelocidadeMaxima;
	}
	
	public int getVelocidadeMaxima(){
		return this.velocidadeMaxima;
	}
	
	public void setVelocidadeMotora(int novaVelocidadeMotora){
		this.velocidadeMotora = novaVelocidadeMotora;
	}
	
	public int getVelocidadeMotora(){
		return this.velocidadeMotora;
	}
	
	public void calcularMulta(){
		int excedido = this.getVelocidadeMotora() - this.getVelocidadeMaxima();
		int multa = 0;
		if(excedido > 0){
			if (excedido <= 10){
				multa = 50;
			} else if (excedido <= 30) {
				multa = 100;
			} else {
				multa = 200;
			}
		}
		System.out.println(multa);
	}
	
	public static void main(String[] args){
		Scanner leitura = new Scanner(System.in);
		int VMAX = leitura.nextInt();
		int VMOTORA = leitura.nextInt();
		MultaVelocidade multa = new MultaVelocidade(VMAX, VMOTORA);
		multa.calcularMulta();
	}
}
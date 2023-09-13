import java.util.Scanner;

public class Eleitor {
	private int idade;
	
	Eleitor(int novaIdade){
		this.setIdade(novaIdade);
	}
	
	public void setIdade(int novaIdade){
		this.idade = novaIdade;
	}
	
	public int getIdade(){
		return this.idade;
	}
	
	public void verificaClasseEleitoral(){
		if(this.getIdade() < 16){
			System.out.println("nao votante");
		} else {
			if (this.getIdade() < 18 || this.getIdade() > 65){
				System.out.println("eleitor facultativo");
			} else {
				System.out.println("eleitor obrigatorio");
			}
		}
	}
	
	public static void main(String[] args){
		Scanner leitura = new Scanner(System.in);
		int novaIdade = leitura.nextInt();
		Eleitor eleitor = new Eleitor(novaIdade);
		eleitor.verificaClasseEleitoral();
	}
}
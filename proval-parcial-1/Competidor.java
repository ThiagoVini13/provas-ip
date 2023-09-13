import java.util.Scanner;

public class Competidor{
	private String nome;
	private int pontos;
	
	Competidor(String novoNome, int novosPontos){
		this.setNome(novoNome);
		this.setPontos(novosPontos);
	}
	
	public void setNome(String novoNome){
		this.nome = novoNome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setPontos(int novosPontos){
		this.pontos = novosPontos;
	}
	
	public int getPontos(){
		return this.pontos;
	}
	
	public void ComparaCompetidorCom(Competidor competidor2){
		if(this.getPontos() > competidor2.getPontos()){
			System.out.println(this.getNome());
		} else {
			System.out.println(competidor2.getNome());
		}
	}
	
	public static void main(String[] args){
		Scanner leitura = new Scanner(System.in);
		String nome1 = leitura.nextLine();
		int pontos1 = leitura.nextInt();
		leitura.nextLine();
		String nome2 = leitura.nextLine();
		int pontos2 = leitura.nextInt();
		leitura.nextLine();
		Competidor competidor1 = new Competidor(nome1, pontos1);
		Competidor competidor2 = new Competidor(nome2, pontos2);
		competidor1.ComparaCompetidorCom(competidor2);
	}
}
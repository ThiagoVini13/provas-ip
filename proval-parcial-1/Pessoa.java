import java.util.Scanner;

public class Pessoa {
	private String nome;
	private int anoNascimento;
	
	Pessoa(String novoNome, int novoAnoNascimento){
		this.setNome(novoNome);
		this.setAnoNascimento(novoAnoNascimento);
	}
	
	public void setNome(String novoNome){
		this.nome = novoNome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setAnoNascimento(int novoAnoNascimento){
		this.anoNascimento = novoAnoNascimento;
	}
	
	public int getAnoNascimento(){
		return this.anoNascimento;
	}
	
	public void calculaIdade(){
		if(this.getAnoNascimento() <= 2020){
			int idade = 2020 - this.getAnoNascimento();
			System.out.printf("Nome: %s\n", this.getNome());
			System.out.printf("Idade: %d\n", idade);
		}
	}
	
	public static void main(String[] args){
		Scanner leitura = new Scanner(System.in);
		String novoNome = leitura.nextLine();
		int novoAnoNascimento = leitura.nextInt();
		Pessoa pessoa = new Pessoa(novoNome, novoAnoNascimento);
		pessoa.calculaIdade();
	}
}
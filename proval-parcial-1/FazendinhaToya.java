import java.util.Scanner;

public class FazendinhaToya{
	private int quantidadeTotalBranco;
	private int quantidadeTotalPreto;
	private float pesoTotalBranco;
	private float pesoTotalPreto;

	FazendinhaToya(){
		this.setQuantidadeTotalBranco(0);
		this.setQuantidadeTotalPreto(0);
		this.setPesoTotalBranco(0.0f);
		this.setPesoTotalPreto(0.0f);
	}
	
	public void setQuantidadeTotalBranco(int novaQuantidadeBranco){
		this.quantidadeTotalBranco = novaQuantidadeBranco;
	}
	
	public int getQuantidadeTotalBranco(){
		return this.quantidadeTotalBranco;
	}
	
	public void setQuantidadeTotalPreto(int novaQuantidadePreto){
		this.quantidadeTotalPreto = novaQuantidadePreto;
	}
	
	public int getQuantidadeTotalPreto(){
		return this.quantidadeTotalPreto;
	}
	
	public void setPesoTotalBranco(float novoPesoBranco){
		this.pesoTotalBranco = novoPesoBranco;
	}
	
	public float getPesoTotalBranco(){
		return this.pesoTotalBranco;
	}
	
	public void setPesoTotalPreto(float novoPesoPreto){
		this.pesoTotalPreto = novoPesoPreto;
	}
	
	public float getPesoTotalPreto(){
		return this.pesoTotalPreto;
	}
	
	public void registraBois(){
		Scanner leitura = new Scanner(System.in);
		int quantidadeDeLeituras = leitura.nextInt();
		int i, j;
		
		for(i = 0; i < quantidadeDeLeituras; i++){
			char racaBoi = leitura.next().charAt(0);
			int quantidadeBois = leitura.nextInt();
			float peso = 0.0f;
			
			for(j = 0; j < quantidadeBois; j++){
				peso += leitura.nextFloat();
			}
			
			if(racaBoi == 'b'){
				quantidadeBois += this.getQuantidadeTotalBranco();
				peso += this.getPesoTotalBranco();
				this.setQuantidadeTotalBranco(quantidadeBois);
				this.setPesoTotalBranco(peso);
			} else if (racaBoi == 'p'){
				quantidadeBois += this.getQuantidadeTotalPreto();
				peso += this.getPesoTotalPreto();
				this.setQuantidadeTotalPreto(quantidadeBois);
				this.setPesoTotalPreto(peso);
			}
		}		
	}
	
	public void imprimeQuantidadeEPeso(){
		System.out.printf("Quantidade de bois brancos: %d\n", this.getQuantidadeTotalBranco());
		System.out.printf("Peso total dos bois brancos: %.2f KG\n", this.getPesoTotalBranco());
		System.out.printf("Quantidade de bois pretos: %d\n", this.getQuantidadeTotalPreto());
		System.out.printf("Peso total dos bois pretos: %.2f KG\n", this.getPesoTotalPreto());
	}
	
	public static void main(String[] args){
		FazendinhaToya fazenda = new FazendinhaToya();
		fazenda.registraBois();
		fazenda.imprimeQuantidadeEPeso();
	}
}
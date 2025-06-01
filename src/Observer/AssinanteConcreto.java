package Observer;

public class AssinanteConcreto implements Assinante {

	private String nome; // Nome do assinante

	public AssinanteConcreto(String nome) {
		this.nome = nome;
	}

	public void publicar(String mensagem) {
		System.out.println("Assinante: " + this.nome + " recebeu a mensagem: " + mensagem);
	}
}
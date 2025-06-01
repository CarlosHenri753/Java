package Observer;

public interface Editora {
	
	void assinarEditora(Assinante assinante);

	void cancelarEditora(Assinante assinante);

	void notificarAssinantes(String messagem);
	
}
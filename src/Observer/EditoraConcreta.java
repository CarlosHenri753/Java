package Observer;

import java.util.ArrayList;
import java.util.List;

public class EditoraConcreta {
	private List<Assinante> esporte = new ArrayList<>();
	private List<Assinante> politica = new ArrayList<>();
	private List<Assinante> financas = new ArrayList<>();

	public void assinar(String assunto, Assinante assinante) {
		switch (assunto) {
			case "Esporte":
				esporte.add(assinante);
				break;
			case "Política":
				politica.add(assinante);
				break;
			case "Finanças":
				financas.add(assinante);
				break;
		}
	}

	public void notificar(String assunto, String mensagem) {
		List<Assinante> lista = switch (assunto) {
			case "Esporte" -> esporte;
			case "Política" -> politica;
			case "Finanças" -> financas;
			default -> null;
		};

		if (lista != null) {
			for (Assinante a : lista) {
				a.publicar(mensagem);
			}
		}
	}
}

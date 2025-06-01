package Proxy;

import java.util.ArrayList;

public class ProxyBuscaLivro implements BuscaLivroInterface {

	private BuscaLivro busca;

	public ProxyBuscaLivro() {
		this.busca = new BuscaLivro();
	}

	public ArrayList<Livro> buscaPorAutor(String autor) {
		ArrayList<Livro> listaPorAutor = new ArrayList<>();

		if (autor.equals("Dan Brown")) {
			listaPorAutor.add(new Livro("Dan Brown", "Origem", 12345));
			listaPorAutor.add(new Livro("Dan Brown", "Código Da Vinci", 53654));
			listaPorAutor.add(new Livro("Dan Brown", "Inferno", 256487));
		} else {
			listaPorAutor = busca.buscaPorAutor(autor);
		}

		return listaPorAutor;
	}

	public ArrayList<Livro> buscaPorTitulo(String titulo) {
		ArrayList<Livro> listaPorTitulo = new ArrayList<>();

		if (titulo.equals("Dom Casmurro")) {
			listaPorTitulo.add(new Livro("Machado de Assis", "Dom Casmurro", 99887));
		} else {
			listaPorTitulo = busca.buscaPorTitulo(titulo);
		}

		return listaPorTitulo;
	}

	public Livro buscaPorISBN(int isbn) {
		if (isbn == 326457) {
			return new Livro("George Orwell", "1984", 326457);
		} else {
			return busca.buscaPorISBN(isbn);
		}
	}
}

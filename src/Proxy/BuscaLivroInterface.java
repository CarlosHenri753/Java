package Proxy;

import java.util.ArrayList;

public interface BuscaLivroInterface {
	
	public ArrayList<Livro>buscaPorAutor (String autor); 
	public ArrayList <Livro> buscaPorTitulo (String titulo); 
	public Livro buscaPorISBN (int isbn);

}

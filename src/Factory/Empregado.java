package Factory;

import java.time.LocalDate;

abstract class Empregado {

	private String nome;
	private String email;
	private int anoContratacao;

	public Empregado(String nome, String email, int anoContratacao) {
		this.nome = nome;
		this.email = email;
		this.anoContratacao = anoContratacao;
	}

	public int tempoCasa() {
		LocalDate dataLocal = LocalDate.now();
		int anoAtual = dataLocal.getYear();
		return anoAtual - anoContratacao;
	}

	public abstract double ganha();

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", email=" + email + ", anoContratacao=" + anoContratacao + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAnoContratacao() {
		return anoContratacao;
	}

	public void setAnoContratacao(int anoContratacao) {
		this.anoContratacao = anoContratacao;
	}

}

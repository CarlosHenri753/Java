package Factory;

public class PorHora extends Empregado {
	private double valorHora;
	private int quantHoras;

	public PorHora(String nome, String email, int anoContratacao, double valorHora, int quantHoras) {
		super(nome, email, anoContratacao);
		this.valorHora = valorHora;
		this.quantHoras = quantHoras;
	}

	@Override
	public double ganha() {
		return valorHora * quantHoras;
	}

	@Override
	public String toString() {
		return "PorHora [valorHora=" + valorHora + ", quantHoras=" + quantHoras + "]";
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getQuantHoras() {
		return quantHoras;
	}

	public void setQuantHoras(int quantHoras) {
		this.quantHoras = quantHoras;
	}

}

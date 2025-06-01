package Factory;

public class PorItem extends Empregado {
	private double valorProducao;
	private int quantidade;

	public PorItem(String nome, String email, int anoContratacao, double valorProducao, int quantidade) {
		super(nome, email, anoContratacao);
		this.valorProducao = valorProducao;
		this.quantidade = quantidade;
	}

	@Override
	public double ganha() {
		return valorProducao * quantidade;
	}

	@Override
	public String toString() {
		return "PorItem [valorProducao=" + valorProducao + ", quantidade=" + quantidade + "]";
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}

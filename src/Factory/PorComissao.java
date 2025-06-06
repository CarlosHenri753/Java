package Factory;

public class PorComissao extends Empregado {
	private double salario;
	private double comissao;
	private int vendas;

	public PorComissao(String nome, String email, int anoContratacao, double salario, double comissao, int vendas) {
		super(nome, email, anoContratacao);
		this.salario = salario;
		this.comissao = comissao;
		this.vendas = vendas;
	}

	@Override
	public double ganha() {
		return salario + (comissao * vendas);
	}

	@Override
	public String toString() {
		return "PorComissao [salario=" + salario + ", comissao=" + comissao + ", vendas=" + vendas + "]";
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public int getVendas() {
		return vendas;
	}

	public void setVendas(int vendas) {
		this.vendas = vendas;
	}

}

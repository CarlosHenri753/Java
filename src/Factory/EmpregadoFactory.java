package Factory;

public class EmpregadoFactory {

	public static Empregado getEmpregado(int cargo, String nome, String email, int anoContratacao, int quantHoras) {

		switch (cargo) {
		case 1:
			return new Gerente(nome, email, anoContratacao, 4000);
		case 2:
			return new PorComissao(nome, email, anoContratacao, 3000, 1.4, 50000);
		case 3:
			return new PorHora(nome, email, anoContratacao, 30, 180);
		case 4:
			return new PorItem(nome, email, anoContratacao, 50, 100);
		default:
			return null;

		}

	}

}

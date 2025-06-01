package Factory;

public class Principal {

	public static void main(String[] args) {

		int cargo;
		String nome;
		String email;
		int anoContratacao;

		cargo = 1;
		nome = "Antonio Maciel";
		email = "antonio@gmail.com";
		anoContratacao = 2005;

		Empregado emp1 = EmpregadoFactory.getEmpregado(cargo, nome, email, anoContratacao, anoContratacao);
		System.out.println(emp1.toString());

	}

}

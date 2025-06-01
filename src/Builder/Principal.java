package Builder;

public class Principal {

	public static void main(String[] args) {

		BuilderAluno aluno1 = new BuilderAluno();
		BuilderAluno aluno2 = new BuilderAluno();
		BuilderAluno aluno3 = new BuilderAluno();

		aluno1.setAluno("Carlos", "Henrique", 26, 04, 01, "12442057964", "carlos.bancks@hotmail.com");
		aluno1.setEndereco("Rua Mariano Torres", 24, "Apartamento 5", "Centro", "Curitiba", "Paraná", "Brasil");
		aluno1.setFormacao(2025, "Senac", "Curitiba", "Paraná", "Brasil");
		aluno1.setTurma(8, 2025, null);
		aluno1.setFone(41, 97348398, "Celular");

		aluno2.setAluno("Pedro", "Da Silva", 24, 05, 94, "53473437434", "Pedro@hotmail.com");
		aluno2.setEndereco("Rua Pedro Alvares", 48, "Apartamento 24", "Batel", "Curitiba", "Paraná", "Brasil");
		aluno2.setFormacao(2023, "Senai", "Curitiba", "Paraná", "Brasil");
		aluno2.setTurma(4, 2023, null);
		aluno2.setFone(41, 973454548, "Celular");

		aluno3.setAluno("Luiz", "Monteiro", 20, 01, 04, "8348484985", "Luiz@hotmail.com");
		aluno3.setEndereco("Rua Silva", 48, "Apartamento 24", "Centro", "Curitiba", "Paraná", "Brasil");
		aluno3.setFormacao(2025, "Sesi", "Curitiba", "Paraná", "Brasil");
		aluno3.setTurma(9, 2024, null);
		aluno3.setFone(41, 994384898, "Celular");

	}

}

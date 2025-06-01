package Builder;

import java.util.ArrayList;
import java.util.List;

public class BuilderAluno {

	private Aluno aluno;
	private Endereco endereco;
	private Cidade cidadeEndereco;
	private Formacao formacao;
	private Cidade cidadeFormacao;
	private Turma turma;
	private List telefones;

	public BuilderAluno() {
		this.aluno = new Aluno();

		this.endereco = new Endereco();
		aluno.setEndereco(endereco);

		this.formacao = new Formacao();
		aluno.setFormacao(formacao);

		this.turma = new Turma();
		aluno.setTurma(turma);

		this.telefones = new ArrayList();
		aluno.setTelefones(telefones);
	}

	public void setAluno(String nome, String sobrenome, int dia, int mes, int ano, String cpf, String email) {
		aluno.setNome(nome);
		aluno.setSobrenome(sobrenome);
		aluno.setDia(dia);
		aluno.setMes(mes);
		aluno.setAno(ano);
		aluno.setCpf(cpf);
		aluno.setEmail(email);
	}

	public void setEndereco(String logradouro, int numero, String complemento, String bairro, String cidade, String estado, String pais) {
		endereco.setLogradouro(logradouro);
		endereco.setNumero(numero);
		endereco.setComplemento(complemento);
		endereco.setCidade(cidadeEndereco);
		endereco.setBairro(bairro);

	}

	public void setFormacao(int ano, String instituicao, String cidade, String estado, String pais) {
		formacao.setAno(ano);
		formacao.setCidade(cidadeEndereco);
		formacao.setInstituicao(instituicao);

	}

	public void setTurma(int numero, int ano, String descricao) {
		turma.setAno(ano);
		turma.setDescricao(descricao);
		turma.setNumero(numero);

	}

	public void setFone(int ddd, int numero, String tipoFone){
	Telefone tel1 = new Telefone(ddd, numero, tipoFone);
	telefones.add(tel1);
		
	}

}

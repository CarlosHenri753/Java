package Observer;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EditoraConcreta editora = new EditoraConcreta();

		// cadastrar assinantes
		while (true) {
			System.out.println("Deseja cadastrar um assinante?");
			System.out.println("1 – SIM\n2 – NÃO");
			int opcao = scanner.nextInt();
			scanner.nextLine(); // Limpar buffer

			if (opcao != 1) break;

			// pega o nome do assinante
			System.out.print("Informe o nome do assinante: ");
			String nome = scanner.nextLine();

			// escolher o assunto
			System.out.println("Qual assinatura deseja:");
			System.out.println("1 – Esporte\n2 – Política\n3 – Finanças");
			int assuntoOpcao = scanner.nextInt();
			scanner.nextLine(); 

			String assunto = "";

			if (assuntoOpcao == 1) {
				assunto = "Esporte";
			} else if (assuntoOpcao == 2) {
				assunto = "Política";
			} else if (assuntoOpcao == 3) {
				assunto = "Finanças";
			} else {
				System.out.println("Assunto invalido.");
				continue;
			}

			
			AssinanteConcreto novo = new AssinanteConcreto(nome);
			editora.assinar(assunto, novo);
		}

		// envia as mensagens para cada assunto
		System.out.print("Informe a mensagem de ESPORTE: ");
		String msgEsporte = scanner.nextLine();
		editora.notificar("Esporte", msgEsporte);

		System.out.print("Informe a mensagem de POLITICA: ");
		String msgPolitica = scanner.nextLine();
		editora.notificar("Política", msgPolitica);

		System.out.print("Informe a mensagem de FINANCAS: ");
		String msgFinancas = scanner.nextLine();
		editora.notificar("Finanças", msgFinancas);

		scanner.close();
	}
}

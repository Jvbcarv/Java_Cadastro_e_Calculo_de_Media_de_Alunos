package alura;

import java.util.Scanner;

public class CadastroNotas {

		public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Solicitar o número de alunos
		        System.out.print("Quantos alunos deseja cadastrar? ");
		        int quantidadeAlunos = scanner.nextInt();
		        scanner.nextLine(); // consumir a quebra de linha

		        // Criar os arrays
		        String[] nomes = new String[quantidadeAlunos];
		        double[] notas = new double[quantidadeAlunos];

		        // Coletar os dados dos alunos
		        for (int i = 0; i < quantidadeAlunos; i++) {
		            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
		            nomes[i] = scanner.nextLine();

		            System.out.print("Digite a nota de " + nomes[i] + ": ");
		            notas[i] = scanner.nextDouble();
		            scanner.nextLine(); // consumir a quebra de linha
		        }

		        // Exibit nomes e notas
		        System.out.println("\n--- Resultado ---");
		        double somaNotas = 0;
		        for (int i = 0; i < quantidadeAlunos; i++) {
		            System.out.println(nomes[i] + ": " + notas[i]);
		            somaNotas += notas[i];
		        }

		        // Calcular e exibir a média
		        double media = somaNotas / quantidadeAlunos;
		        System.out.printf("\nMedia da turma: %.2f\n", media);

		        // Mostrar os alunos com nota acima da média
		        System.out.println("\nAlunos acima da media:");
		        for (int i = 0; i < quantidadeAlunos; i++) {
		            if (notas[i] > media) {
		                System.out.println(nomes[i]);
		            }
		        }

		        scanner.close();
	}
}

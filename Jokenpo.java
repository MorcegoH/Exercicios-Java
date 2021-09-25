
package desafios;

import java.util.Scanner; //Necessário para usar a classe.

// Programa para jogar Jokenpo.
// 3 partes;
// 1 - Captura da escolha do jogador
// 2 - Sorteio da opção do computador
// 3 - Verificação das escolhas para gerar o resultado

public class Jokenpo {

	public static void main(String[] args) {
		// Variaveis
		int player, cpu;

		// estrutura básica
		Scanner teclado = new Scanner(System.in);
		System.out.println("----------- JokenPoh ------------");
		System.out.println("");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("");
		System.out.print("Digite a sua escolha: ");

		// Parte 1;
		player = teclado.nextInt();
		System.out.println("");
		switch (player) {
		case 1:
			System.out.println("Jogador escolheu: Pedra");
			break;
		case 2:
			System.out.println("Jogador escolheu: Papel");
			break;
		case 3:
			System.out.println("Jogador escolheu: Tesoura");
			break;
		default:
			System.out.println("Opção Inválida, Jagunço!");
			break;
		}
		System.out.println("");
		// Parte 2;

		cpu = (int) (Math.random() * 3 + 1); // Math.random escolhe entre 3 nsº aleatório entre 0,1,2, para ficar de 1,2,3 é necessário acrescentar o +1, assim fica a opção +1 para o resultado.
		teclado.close();
		switch (cpu) {
		case 1:
			System.out.println("Computador escolheu: Pedra");
			break;
		case 2:
			System.out.println("Computador escolheu: Papel");
			break;
		case 3:
			System.out.println("Computador escolheu: Tesoura");
			break;
		}
		// Parte 3;
		System.out.println("");
		if (player == cpu) {
			System.out.println("EMPATE!!");
		} else {
			if ((player == 1 && cpu == 3) || (player == 3 && cpu == 2) || (player == 2 && cpu == 1)) {
				System.out.println("***** Jogador Venceu!!! *****");
			} else {
				System.out.println("***** Jogador Perdeu!! *****");
			}
		}
	}
}
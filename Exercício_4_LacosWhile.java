package LacosDeRepeticao;

import java.util.Scanner;

public class Exercício_4_LacosWhile {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade, genero, categoria, contNPB = 0, contNMFS = 0, contHM40 = 0, contMF30 = 0;
		String escolha = "s";

		while (escolha.equalsIgnoreCase("s")) {
			System.out.println("\nDigite sua Idade: ");
			idade = leia.nextInt();

			System.out.println("\nDigite seu Genero: ");
			System.out.println("\n1--Masculino\n2--Feminino\n3--Não se aplica");
			genero = leia.nextInt();

			System.out.println("\nDigite sua área de atuação: ");
			System.out.println("\n1--Backend\n2--Frontend\n3--Mobile\n4--FullStack");
			categoria = leia.nextInt();

			System.out.println("\nDeseja continuar? (S-SIM / N-NÃO");
			escolha = leia.next();

			if (categoria == 1) {
				contNPB++;
			}
			if (genero == 2 && categoria == 2) {
				contNMFS++;
			}
			if (idade > 40 && genero == 1 && categoria == 3) {
				contHM40++;
			}
			if (idade < 30 && genero == 2 && categoria == 4) {
				contMF30++;
			}
		}
		System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + contNPB);
		System.out.println("\nTotal de mulheres desenvolvedoras Frontend: " + contNMFS);
		System.out.println("\nTotal de homens desenvolvedores Mobile maiores de 40 anos: " + contHM40);
		System.out.println("\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos: " + contMF30);
	}
}
package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio_3_LacosWhile {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade = 0, pessoaMenor = 0, pessoaMaior = 0;

		while (idade >= 0) {
			System.out.println("Digite a sua Idade: ");
			idade = leia.nextInt();
			if (idade > 1 && idade < 21) {
				pessoaMenor++;
			} else if (idade > 50) {
				pessoaMaior++;
			}
		}
		System.out.println("\nTotal de pessoas menores de 21 anos: " + pessoaMenor);
		System.out.println("\nTotal de pessoas maiores de 50 anos: " + pessoaMaior);
	}

}

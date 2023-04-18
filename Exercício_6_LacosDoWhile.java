package LacosDeRepeticao;

import java.util.Scanner;

public class Exercício_6_LacosDoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int num, quantNum = 0;
		float media = 0, soma = 0;
		
		do {
			System.out.println("Digite um Número: ");
			num = leia.nextInt();
			
			if (num % 3 == 0 && num !=0) {
				soma += num;
				quantNum++;
				media = soma / quantNum;
			}
		}while(num !=0);
		System.out.printf("A média de todos os números múltiplos de 3 é: %.2f",media);
		}
}

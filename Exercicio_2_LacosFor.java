package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio_2_LacosFor {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		int num, x, numPar=0, numImpar=0;
		
		for(x=1;x<=10;x++) {
			System.out.printf("Digite um número: ");
			num = leia.nextInt();
			
			if (num % 2 == 0) {
				numPar++;
			}else {
				numImpar++;
			}
			
		}
		System.out.println("\nTotal de números pares: "+numPar);
		System.out.println("\nTotal de números ímpares: "+numImpar);
	}

}

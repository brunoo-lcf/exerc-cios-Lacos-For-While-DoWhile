package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio_1_LacosFor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1,n2, x = 0 ;
		
		System.out.println("Digite o primeiro valor: ");
		n1 = leia.nextInt();
		System.out.println("\nDigite osegundo valor: ");
		n2 = leia.nextInt();
		
		for (x=n1; x<=n2; x++) {
			if(x % 3 == 0 && x % 5 == 0) {
				System.out.println("O valor "+x+" é múltiplo de 3 e 5");
			}
		}
	}
}



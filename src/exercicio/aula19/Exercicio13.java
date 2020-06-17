package exercicio.aula19;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int soma = 0;
		
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			numero = sc.nextInt();
			if(numero % 5 == 0) {
				soma += numero;
			}
		}
		
		System.out.println("A soma é igual " + soma);
	}

}

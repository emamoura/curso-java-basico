package exercicio.aula19;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int soma = 0;
		int[] a = new int[10];
		
		System.out.println("Digite 10 números: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			soma += a[i];
		}
		
		System.out.println("Soma: " + soma);
		
	}

}

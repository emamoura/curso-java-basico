package exercicio.aula19;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		int[] a = new int[10];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if(a[i] % 2 == 0) {
				count += 1;
				System.out.println("O número " + a[i] + " é par");
			}
		}
		
		System.out.println("O total de números pares é: " + count);
	}

}

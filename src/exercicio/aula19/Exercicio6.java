package exercicio.aula19;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
	
		
		System.out.println("Digite 10 números em uma única linha: ");
		for (int i = 0; i < b.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Digite 10 números em uma única linha: ");
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		
		for (int i = 0; i < b.length; i++) {
			c[i] = a[i] + b[i];
			System.out.println(c[i]);
		}
		
	}

}
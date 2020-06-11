package exercicio.aula19;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		int[] b = new int[10];
	
		
		System.out.println("Digite 10 números em uma única linha: ");
		for (int i = 0; i < b.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i] * i;
			System.out.println(b[i]);
		}
		
	}

}

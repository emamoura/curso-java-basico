package exercicio.aula19;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] a = new int[15];
		int[] b = new int[15];
		
		System.out.println("Digite 15 números em uma única linha: ");
		for (int i = 0; i < b.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < b.length; i++) {
			b[i] = (int) Math.sqrt(a[i]);
			System.out.println(b[i]);
		}
		
	}

}

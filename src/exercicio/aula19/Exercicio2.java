package exercicio.aula19;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[5];
		int[] b = new int[5];
		
		System.out.println("Digite os valores de A");
		for (int i = 0; i < b.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i] * 2;
			System.out.println(b[i]);
		}
	}

}

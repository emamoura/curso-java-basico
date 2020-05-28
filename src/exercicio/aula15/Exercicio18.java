package exercicio.aula15;
import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite umm número: ");
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("É par");
		}
		else {
			System.out.println("É impar");
		}
		
		sc.close();
	}

}

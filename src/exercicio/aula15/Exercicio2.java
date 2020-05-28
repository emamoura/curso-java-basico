package exercicio.aula15;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		
		double valor = sc.nextDouble();
		
		if(valor > 0) {
			System.out.println("O número digitado é positivo");
		}
		else if(valor < 0) {
			System.out.println("O número digitado é negativo");
		}
		else {
			System.out.println("O número digitado é nulo");
		}
		
		
	}

}

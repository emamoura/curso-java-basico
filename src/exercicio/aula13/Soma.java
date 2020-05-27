package exercicio.aula13;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois valores e mostrarei a soma entre eles:");
		Double num1 = sc.nextDouble();
		Double num2 = sc.nextDouble();
		
		Double soma = num1 + num2;
		
		System.out.println("A soma é igual a: " + soma);
	}

}

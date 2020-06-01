package exercicio.aula17;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double soma = 0;
		double media = 0;
		
		System.out.println("Digite cinco números reais: ");
		
		for(int i = 0; i < 5; i++) {
			double numero = sc.nextDouble();
			soma += numero;
		}
		
		media = soma / 5;
		
		System.out.println("A soma é igual a: " + soma );
		System.out.println("A média é igual a: " + media);
		
		sc.close();
	}

}
